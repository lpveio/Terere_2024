package br.cta.ipev.terere_auto;

import android.app.Application;

import androidx.fragment.app.FragmentActivity;

import br.cta.ipev.commom.instruments.odometers.SemiOdometer;
import br.cta.isad.Display;
import br.cta.isad.IenaPacketReceiver;
import br.cta.isad.UDPConnector;
import br.cta.isad.iCounts2UE;

public class AppManager extends Application {
    private UDPConnector udpConnector;
    private IenaPacketReceiver receiver;
    private boolean playPlot = true;
    private iCounts2UE converter;
    public Index[] offsetsIndex;

    public boolean isPlayPlot() {
        return playPlot;
    }

    public void setPlayPlot(boolean playPlot) {
        this.playPlot = playPlot;
    }

    public void setUdpConnector(UDPConnector udpConnector, IenaPacketReceiver receiver) {
        this.udpConnector = udpConnector;
        this.receiver = receiver;
        this.converter = this.receiver.getConverter();
        this.udpConnector.addReceived(this.receiver);
    }

    public void setCounts2UE(iCounts2UE counts2UE){
        this.converter = counts2UE;
        this.receiver.setConverter(this.converter);
    }

    public void setOffsets(Index[] offsetsIndex, Index[] indicatorsIndex, boolean reset){
        Index[] offsets = this.offsetsIndex;
        if (reset){
            offsets = offsetsIndex;
        }
        iOffsets sad = (iOffsets) this.converter;
        sad.set_offset(offsetsIndex);
        this.receiver.setConverter((iCounts2UE) sad);
        this.resetOdometers(indicatorsIndex);
        this.offsetsIndex = offsetsIndex;




    }

    public void resetView(FragmentActivity v){
        for (Index i: this.offsetsIndex) {
            int id = v.getResources().getIdentifier("odo" + i.toString(), "id", getPackageName());
            ((SemiOdometer) v.findViewById(id)).resetValues();
        }
    }

    public void addDisplay(Display display){
        this.receiver.addDisplay(display);
    }

    public void start(){
        Thread thread = new Thread(udpConnector);
        thread.start();
    }

    public void stop(){
        if (udpConnector != null)
            udpConnector.stop();
    }

    private void resetOdometers(Index[] offsets){
        for (int c=0; c < this.receiver.getDisplay().size(); c++){
            FragmentActivity b = (FragmentActivity)this.receiver.getDisplay().get(c);
            for (Index i: offsets) {
                int id = b.getResources().getIdentifier("odo" + i.toString(), "id", getPackageName());
                if (b.findViewById(id)!=null) {
                    ((SemiOdometer) b.findViewById(id)).resetValues();
                }
            }
        }
    }
}

package br.cta.ipev.terere_auto;

import android.content.Context;
import android.graphics.Color;

import java.util.ArrayList;
import java.util.List;

import br.cta.ipev.commom.instruments.odometers.AlertRange;
import br.cta.ipev.commom.screen.BaseSetup;
import br.cta.ipev.commom.screen.Tab;
import br.cta.ipev.terere_auto.telas.TelaCinco;
import br.cta.ipev.terere_auto.telas.TelaDois;
import br.cta.ipev.terere_auto.telas.TelaOito;
import br.cta.ipev.terere_auto.telas.TelaQuatro;
import br.cta.ipev.terere_auto.telas.TelaSeis;
import br.cta.ipev.terere_auto.telas.TelaSete;
import br.cta.ipev.terere_auto.telas.TelaStrain;
import br.cta.ipev.terere_auto.telas.TelaStrainDois;
import br.cta.ipev.terere_auto.telas.TelaTres;
import br.cta.ipev.terere_auto.telas.TelaUm;
import br.cta.ipev.terere_auto.telas.TelaUmA;
import br.cta.ipev.terere_auto.telas.TelaUmB;

public class Setup extends BaseSetup{

    public static class AlertConfig {
        public static final AlertRange alertRed = new AlertRange(100d, 120d, Color.RED);
        public static final AlertRange RxEH = new AlertRange(45d, 100d, Color.YELLOW);
        public static final AlertRange RxEV = new AlertRange(50d, 100d, Color.YELLOW);
        public static final AlertRange RxLa = new AlertRange(-100d, -35d, Color.YELLOW);
        public static final AlertRange RxLb = new AlertRange(40d, 100d, Color.YELLOW);
        public static final AlertRange RHAxa = new AlertRange(-100d, -15d, Color.YELLOW);
        public static final AlertRange RHAxb = new AlertRange(15d, 100d, Color.YELLOW);
        public static final AlertRange RSA1 = new AlertRange(10d, 100d, Color.YELLOW);

        public static final AlertRange alertDDL = new AlertRange(-100d, -75d,Color.YELLOW);
        public static final AlertRange alertDDLa = new AlertRange(75d,100d,Color.YELLOW);
    }

    @Override
    public List<Tab> getScreenTabs(boolean forTablets) {
        List<Tab>screenTabs = new ArrayList<Tab>();
        screenTabs.add(0,new Tab("1b","1", TelaUmB.class,true,false));
        screenTabs.add(1,new Tab("5","2", TelaCinco.class,true,true));
        screenTabs.add(2,new Tab("6","3", TelaSeis.class,true,false));
        screenTabs.add(3,new Tab("7","4", TelaSete.class,true,false));
        screenTabs.add(4,new Tab("8","5", TelaOito.class,true,false));
        screenTabs.add(5,new Tab("8","Strain", TelaStrain.class,true,false));
        return (super.getScreenForTablets(screenTabs,forTablets));
    }

    public List<Tab> getScreenTabs2(boolean forTablets){
        List<Tab>screenTabs = new ArrayList<Tab>();
        screenTabs.add(0,new Tab("ANQ","An. Qualit.", TelaUm.class,true,false));
        screenTabs.add(1,new Tab("ANQA","An. Qualit.(2)", TelaUmA.class,true,false));
        screenTabs.add(2,new Tab("EMPH","Emp. Horiz.", TelaDois.class,true,false));
        screenTabs.add(3,new Tab("EMPV","Emp. Vert.", TelaTres.class,true,false));
        screenTabs.add(4,new Tab("CMD","Cmd. Leme", TelaQuatro.class,true,false));
        screenTabs.add(5,new Tab("8","Strain", TelaStrainDois.class,true,false));
        return (super.getScreenForTablets(screenTabs,forTablets));
    }

    @Override
    public void setAlerts(Context context) {

    }
}

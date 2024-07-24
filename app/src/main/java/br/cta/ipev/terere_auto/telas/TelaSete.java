package br.cta.ipev.terere_auto.telas;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import br.cta.ipev.terere_auto.AppManager;
import br.cta.ipev.terere_auto.Index;
import br.cta.ipev.terere_auto.databinding.ActivityTelaSeteBinding;
import br.cta.isad.Display;
import br.cta.misc.Convertions;

public class TelaSete extends AppCompatActivity implements Display {
    private ActivityTelaSeteBinding binding;
    @Override
    public void update(double[] CVT) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                try {
                    binding.txtTempo.setText(Convertions.sec2dhms(CVT[Index.TEMPO.ordinal()]));
                    binding.txtTOP.setValue(CVT[Index.TOP.ordinal()]);

                    binding.txtAOA1.setValue(CVT[Index.AOA1.ordinal()]);
                    binding.txtAOA2.setValue(CVT[Index.AOA2.ordinal()]);

                    binding.txtTAS.setValue(CVT[Index.TAS.ordinal()]);
                    binding.txtCAS.setValue(CVT[Index.CAS.ordinal()]);

                    binding.txtSP.setValue(CVT[Index.SP.ordinal()]);
                    binding.txtTP.setValue(CVT[Index.TP.ordinal()]);

                    binding.txtSAT.setValue(CVT[Index.SAT.ordinal()]);
                    binding.txtTAT.setValue(CVT[Index.TAT.ordinal()]);

                    binding.txtMACH.setValue(CVT[Index.MACH.ordinal()]);
                    binding.txtSA.setValue(CVT[Index.SA.ordinal()]);

                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLayout();
        init();
    }

    private void setLayout(){
        binding = ActivityTelaSeteBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        getSupportActionBar().hide();
    }

    private void init(){
        ((AppManager)getApplicationContext()).addDisplay(this);
    }
}

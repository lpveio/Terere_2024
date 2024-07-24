package br.cta.ipev.terere_auto.telas;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import br.cta.ipev.terere_auto.AppManager;
import br.cta.ipev.terere_auto.Index;
import br.cta.ipev.terere_auto.databinding.ActivityTelaOitoBinding;
import br.cta.isad.Display;
import br.cta.misc.Convertions;

public class TelaOito extends AppCompatActivity implements Display {
    private ActivityTelaOitoBinding binding;
    @Override
    public void update(double[] CVT) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                try {
                    binding.txtTempo.setText(Convertions.sec2dhms(CVT[Index.TEMPO.ordinal()]));
                    binding.txtTOP.setValue(CVT[Index.TOP.ordinal()]);

                    binding.txtVZIB.setValue(CVT[Index.VZIB.ordinal()]);
                    binding.txtGRWeight.setValue(CVT[Index.GR_WEIGHT.ordinal()]);
                    binding.txtGSpeed.setValue(CVT[Index.GSPEED.ordinal()]);
                    binding.txtWSpeed.setValue(CVT[Index.WSPEED.ordinal()]);
                    binding.txtWAngle.setValue(CVT[Index.WANGLE.ordinal()]);
                    binding.txtBaro.setValue(CVT[Index.BARO_C_A.ordinal()]);
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
        binding = ActivityTelaOitoBinding.inflate(getLayoutInflater());
        binding = ActivityTelaOitoBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        getSupportActionBar().hide();
    }

    private void init(){
        ((AppManager)getApplicationContext()).addDisplay(this);
    }
}

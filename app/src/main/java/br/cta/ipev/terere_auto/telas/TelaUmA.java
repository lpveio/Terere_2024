package br.cta.ipev.terere_auto.telas;

import static br.cta.ipev.terere_auto.Setup.AlertConfig.*;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

import br.cta.ipev.terere_auto.AppManager;
import br.cta.ipev.terere_auto.Index;
import br.cta.ipev.terere_auto.databinding.ActivityTelaUmABinding;
import br.cta.isad.Display;
import br.cta.misc.Convertions;

public class TelaUmA extends AppCompatActivity implements Display {
    private static final String TAG = "TelaUm";
    private ActivityTelaUmABinding binding;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLayout();
        init();

    }

    @Override
    public void update(double[] CVT) {

        runOnUiThread(() -> {
            try {
                Objects.requireNonNull(binding.odoR1EH).setValue(CVT[Index.R1EH.ordinal()]);
                Objects.requireNonNull(binding.odoR2EH).setValue(CVT[Index.R2EH.ordinal()]);
                Objects.requireNonNull(binding.odoR1EV).setValue(CVT[Index.R1EV.ordinal()]);
                Objects.requireNonNull(binding.odoR2EV).setValue(CVT[Index.R2EV.ordinal()]);

                Objects.requireNonNull(binding.odoR1L).setValue(CVT[Index.R1L.ordinal()]);
                Objects.requireNonNull(binding.odoR2L).setValue(CVT[Index.R2L.ordinal()]);

                binding.txtTempo.setText(Convertions.sec2dhms(CVT[Index.TEMPO.ordinal()]));
            }
            catch (Exception e){
                Log.e(TAG, "run: ", e);
            }
        });
    }

    private void setLayout(){
        binding = ActivityTelaUmABinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        getSupportActionBar().hide();
    }

    private void init(){
        ((AppManager)getApplicationContext()).addDisplay(this);
        this.setAlerts();
    }

    private void setAlerts(){
        binding.odoR1EH.addAlert(alertRed);
        binding.odoR2EH.addAlert(alertRed);
        binding.odoR1EV.addAlert(alertRed);
        binding.odoR2EV.addAlert(alertRed);
        binding.odoR1L.addAlert(alertRed);
        binding.odoR2L.addAlert(alertRed);
        binding.odoR1EH.addAlert(RxEH);
        binding.odoR2EH.addAlert(RxEH);
        binding.odoR1EV.addAlert(RxEV);
        binding.odoR2EV.addAlert(RxEV);
        binding.odoR1L.addAlert(RxLa);
        binding.odoR1L.addAlert(RxLb);
        binding.odoR2L.addAlert(RxLa);
        binding.odoR2L.addAlert(RxLb);

    }
}

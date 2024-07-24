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
import br.cta.ipev.terere_auto.databinding.ActivityTelaTresBinding;
import br.cta.isad.Display;
import br.cta.misc.Convertions;

public class TelaTres extends AppCompatActivity implements Display {
    private static final String TAG = "TelaTres";
    private ActivityTelaTresBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLayout();
        init();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void update(double[] CVT) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                try {
                    Objects.requireNonNull(binding.odoR1EV).setValue(CVT[Index.R1EV.ordinal()]);
                    Objects.requireNonNull(binding.odoR2EV).setValue(CVT[Index.R2EV.ordinal()]);

                    binding.txtTempo.setText(Convertions.sec2dhms(CVT[Index.TEMPO.ordinal()]));
                }
                catch (Exception e){
                    Log.e(TAG, "run: ", e);
                }
            }
        });
    }

    private void setLayout(){
        binding = ActivityTelaTresBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        getSupportActionBar().hide();
    }

    private void init(){
        ((AppManager)getApplicationContext()).addDisplay(this);
        this.setAlerts();
    }

    private void setAlerts(){
        binding.odoR1EV.addAlert(alertRed);
        binding.odoR2EV.addAlert(alertRed);

        binding.odoR1EV.addAlert(RxEV);
        binding.odoR2EV.addAlert(RxEV);
    }
}

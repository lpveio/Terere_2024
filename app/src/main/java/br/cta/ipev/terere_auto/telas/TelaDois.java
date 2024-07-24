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
import br.cta.ipev.terere_auto.databinding.ActivityTelaDoisBinding;
import br.cta.isad.Display;
import br.cta.misc.Convertions;

public class TelaDois extends AppCompatActivity implements Display {
    private static final String TAG = "TelaDois";
    private ActivityTelaDoisBinding binding;
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
                    Objects.requireNonNull(binding.odoR1EH).setValue(CVT[Index.R1EH.ordinal()]);
                    Objects.requireNonNull(binding.odoR2EH).setValue(CVT[Index.R2EH.ordinal()]);

                    binding.txtTempo.setText(Convertions.sec2dhms(CVT[Index.TEMPO.ordinal()]));
                }
                catch (Exception e){
                    Log.e(TAG, "run: ", e);
                }
            }
        });
    }

    private void setLayout(){
        binding = ActivityTelaDoisBinding.inflate(getLayoutInflater());
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

        binding.odoR1EH.addAlert(RxEH);
        binding.odoR2EH.addAlert(RxEH);
    }
}

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
import br.cta.ipev.terere_auto.databinding.ActivityTelaQuatroBinding;
import br.cta.isad.Display;
import br.cta.misc.Convertions;

public class TelaQuatro extends AppCompatActivity implements Display {
    private static final String TAG = "TelaQuatro";
    private ActivityTelaQuatroBinding binding;
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
                    Objects.requireNonNull(binding.odoR1L).setValue(CVT[Index.R1L.ordinal()]);
                    Objects.requireNonNull(binding.odoR2L).setValue(CVT[Index.R2L.ordinal()]);

                    binding.txtTempo.setText(Convertions.sec2dhms(CVT[Index.TEMPO.ordinal()]));
                }
                catch (Exception e){
                    Log.e(TAG, "run: ", e);
                }
            }
        });
    }

    private void setLayout(){
        binding = ActivityTelaQuatroBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        getSupportActionBar().hide();
    }

    private void init(){
        ((AppManager)getApplicationContext()).addDisplay(this);
        this.setAlerts();
    }

    private void setAlerts(){
        binding.odoR1L.addAlert(alertRed);
        binding.odoR2L.addAlert(alertRed);

        binding.odoR1L.addAlert(RxLa);
        binding.odoR1L.addAlert(RxLb);
        binding.odoR2L.addAlert(RxLa);
        binding.odoR2L.addAlert(RxLb);

    }
}

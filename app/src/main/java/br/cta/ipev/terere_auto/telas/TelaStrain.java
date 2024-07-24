package br.cta.ipev.terere_auto.telas;

import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

import br.cta.ipev.terere_auto.AppManager;
import br.cta.ipev.terere_auto.Index;
import br.cta.ipev.terere_auto.databinding.ActivityTelaStrainBinding;
import br.cta.isad.Display;
import br.cta.misc.Convertions;

public class TelaStrain extends AppCompatActivity implements Display {
    private static final String TAG = "TelaStrain";
    private ActivityTelaStrainBinding binding;
    @Override
    public void update(double[] CVT) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                try {
                    Objects.requireNonNull(binding.txtRSA1A).setValue(CVT[Index.RSA1A.ordinal()]);
                    Objects.requireNonNull(binding.txtRSA1B).setValue(CVT[Index.RSA1B.ordinal()]);
                    Objects.requireNonNull(binding.txtRSA1C).setValue(CVT[Index.RSA1C.ordinal()]);

                    Objects.requireNonNull(binding.txtRHA1A).setValue(CVT[Index.RHA1A.ordinal()]);
                    Objects.requireNonNull(binding.txtRHA2A).setValue(CVT[Index.RHA2A.ordinal()]);

                    Objects.requireNonNull(binding.txtRH2P2A).setValue(CVT[Index.RH2P2A.ordinal()]);

                    binding.txtTOP.setValue(CVT[Index.TOP.ordinal()]);
                    binding.txtTempo.setText(Convertions.sec2dhms(CVT[Index.TEMPO.ordinal()]));
                }
                catch (Exception e){
                    Log.e(TAG, "run: ", e);
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

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    private void setLayout(){
        binding = ActivityTelaStrainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        getSupportActionBar().hide();
    }

    private void init() {
        ((AppManager) getApplicationContext()).addDisplay(this);
    }
}

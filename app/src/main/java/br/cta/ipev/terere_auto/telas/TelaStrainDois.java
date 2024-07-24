package br.cta.ipev.terere_auto.telas;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

import br.cta.ipev.terere_auto.AppManager;
import br.cta.ipev.terere_auto.Index;
import br.cta.ipev.terere_auto.databinding.ActivityTelaStrainBinding;
import br.cta.ipev.terere_auto.databinding.ActivityTelaStrainDoisBinding;
import br.cta.isad.Display;
import br.cta.misc.Convertions;

public class TelaStrainDois extends AppCompatActivity implements Display {
    private static final String TAG = "TelaStrainDois";
    private ActivityTelaStrainDoisBinding binding;
    @Override
    public void update(double[] CVT) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                try {
                    Objects.requireNonNull(binding.txtR1EHA).setValue(CVT[Index.R1EHA.ordinal()]);
                    Objects.requireNonNull(binding.txtR1EHB).setValue(CVT[Index.R1EHB.ordinal()]);
                    Objects.requireNonNull(binding.txtR1EHC).setValue(CVT[Index.R1EHC.ordinal()]);

                    Objects.requireNonNull(binding.txtR2EHA).setValue(CVT[Index.R2EHA.ordinal()]);
                    Objects.requireNonNull(binding.txtR2EHB).setValue(CVT[Index.R2EHB.ordinal()]);
                    Objects.requireNonNull(binding.txtR2EHC).setValue(CVT[Index.R2EHC.ordinal()]);

                    Objects.requireNonNull(binding.txtR1EVA).setValue(CVT[Index.R1EVA.ordinal()]);
                    Objects.requireNonNull(binding.txtR1EVB).setValue(CVT[Index.R1EVB.ordinal()]);
                    Objects.requireNonNull(binding.txtR1EVC).setValue(CVT[Index.R1EVC.ordinal()]);

                    Objects.requireNonNull(binding.txtR2EVA).setValue(CVT[Index.R2EVA.ordinal()]);
                    Objects.requireNonNull(binding.txtR2EVB).setValue(CVT[Index.R2EVB.ordinal()]);
                    Objects.requireNonNull(binding.txtR2EVC).setValue(CVT[Index.R2EVC.ordinal()]);

                    Objects.requireNonNull(binding.txtR1LA).setValue(CVT[Index.R1LA.ordinal()]);
                    Objects.requireNonNull(binding.txtR2LA).setValue(CVT[Index.R2LA.ordinal()]);

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
        binding = ActivityTelaStrainDoisBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        getSupportActionBar().hide();
    }

    private void init() {
        ((AppManager) getApplicationContext()).addDisplay(this);
    }
}

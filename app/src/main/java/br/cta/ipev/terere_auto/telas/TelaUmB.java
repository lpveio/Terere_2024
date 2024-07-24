package br.cta.ipev.terere_auto.telas;

import static br.cta.ipev.terere_auto.Setup.AlertConfig.*;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

import br.cta.ipev.terere_auto.AppManager;
import br.cta.ipev.terere_auto.Index;
import br.cta.ipev.terere_auto.databinding.ActivityTelaUmBBinding;
import br.cta.isad.Display;
import br.cta.misc.Convertions;

public class TelaUmB extends AppCompatActivity implements Display {

    private static final String TAG = "TelaUm_B";
    private ActivityTelaUmBBinding binding;
    private boolean isTablet;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLayout();
        init();
    }

    @Override
    public void update(double[] CVT) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                try {
                    binding.txtTempo.setText(Convertions.sec2dhms(CVT[Index.TEMPO.ordinal()]));
                    binding.txtTOP.setValue(CVT[Index.TOP.ordinal()]);
                    Objects.requireNonNull(binding.odoRSA1).setValue(CVT[Index.RSA1.ordinal()]);
                    Objects.requireNonNull(binding.odoDDL).setValue(CVT[Index.DDL.ordinal()]);
                    Objects.requireNonNull(binding.odoRHA1).setValue(CVT[Index.RHA1.ordinal()]);
                    Objects.requireNonNull(binding.odoRHA2).setValue(CVT[Index.RHA2.ordinal()]);

                    Objects.requireNonNull(binding.odoRH2P2).setValue(CVT[Index.RH2P2.ordinal()]);

                    Objects.requireNonNull(binding.txtDDL).setValue(CVT[Index.DDL.ordinal()]);
                    Objects.requireNonNull(binding.txtFDL).setValue(CVT[Index.RH2P1.ordinal()]);
                    Objects.requireNonNull(binding.txtDL1).setValue(CVT[Index.DL_1.ordinal()]);
                    Objects.requireNonNull(binding.txtDL2).setValue(CVT[Index.DL_2.ordinal()]);

                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }

    private void setLayout(){
        binding = ActivityTelaUmBBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        getSupportActionBar().hide();
    }

    private void init(){
        AppManager manager =  ((AppManager)getApplicationContext());
        manager.addDisplay(this);

        binding.btnReset.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Index[] offsetsIDS = new Index[]{};
                Index[] indicatorsIDS = new Index[]{Index.RSA1, Index.RHA1, Index.RHA2, Index.RH2P2};
                if (isChecked) {
                    offsetsIDS = new Index[]{Index.RSA1A, Index.RSA1B,Index.RSA1C,
                            Index.RSA2A, Index.RSA2B,Index.RSA2C,
                            Index.RHA1A, Index.RHA2A, Index.RH2P2A};
                }
                manager.setOffsets(offsetsIDS, indicatorsIDS, isChecked);
            }
        });

        this.isTablet = getResources().getBoolean(br.cta.ipev.commom.R.bool.isTablet);
        this.setAlerts();
    }

    private void setAlerts(){
        binding.odoRHA1.addAlert(alertRed);
        binding.odoRHA2.addAlert(alertRed);
        binding.odoRSA1.addAlert(alertRed);

        binding.odoRHA1.addAlert(RHAxa);
        binding.odoRHA1.addAlert(RHAxb);
        binding.odoRHA2.addAlert(RHAxa);
        binding.odoRHA2.addAlert(RHAxb);

        binding.odoRSA1.addAlert(RSA1);

        binding.odoDDL.addAlert(alertDDL);
        binding.odoDDL.addAlert(alertDDLa);

    }
}

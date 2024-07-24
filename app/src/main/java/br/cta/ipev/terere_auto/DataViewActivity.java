package br.cta.ipev.terere_auto;

import android.app.ActivityGroup;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TabHost;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

import br.cta.ipev.commom.screen.Tab;
import br.cta.isad.IenaPacketReceiver;
import br.cta.isad.UDPConnector;

public class DataViewActivity  extends ActivityGroup{
    public static final String TAG = "DataViewActivity";
    private static final String PREF_FILE_NAME = "PrefFileTerere";
    private AppManager missionManager;
    private TabHost tabHost;
    private boolean isTablet;
    private int SADIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_view);
        this.isTablet = getResources().getBoolean(br.cta.ipev.commom.R.bool.isTablet);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        missionManager = (AppManager) getApplicationContext();
        if (!this.isTablet){
            createMission(SADIndex);
            createTabs(SADIndex);
        } else {
            createDialog();
        }


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        missionManager.stop();
    }
    private void createDialog(){
        View view = getLayoutInflater().inflate(R.layout.dialog_sad_option,null);
        RadioButton radioButton;
        radioButton = (RadioButton)view.findViewById(R.id.rbSAD01);
        if(loadSADIndex()==2)
            radioButton = (RadioButton)view.findViewById(R.id.rbSAD02);
        radioButton.setChecked(true);
        new AlertDialog.Builder(DataViewActivity.this)
                .setTitle("SAD")
                .setMessage("Selecione o SAD desejado.")
                .setView(view)
                .setCancelable(false)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        SADIndex = ((RadioButton)((AlertDialog)dialog).findViewById(R.id.rbSAD01)).isChecked() ? 1 : 2;
                        createMission(SADIndex);
                        createTabs(SADIndex);
                        saveSADIndex(SADIndex);
                    }
                })
                .show();

    }

    private void createMission(int sad){

        IenaPacketReceiver ienaPacketReceiver = new IenaPacketReceiver(getBaseContext());
        if (sad==1)
            ienaPacketReceiver.setConverter(new CoefsSAD1());
        else
            ienaPacketReceiver.setConverter(new CoefsSAD2());
        missionManager.setUdpConnector(new UDPConnector(1024),ienaPacketReceiver);
        missionManager.start();
    }

    private int loadSADIndex(){
        SharedPreferences prefs = getSharedPreferences(PREF_FILE_NAME, MODE_PRIVATE);
        return (prefs.getInt("sad", 1));
    }

    private void saveSADIndex(int sad){
        SharedPreferences preferences = getSharedPreferences(PREF_FILE_NAME, MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt("sad", sad); // value to store
        editor.commit();
    }

    private void createTabs(int sad){
        this.tabHost = (findViewById(android.R.id.tabhost));
        this.tabHost.setup(this.getLocalActivityManager());


        TabHost.TabSpec spec = tabHost.newTabSpec("Config");
        Setup setup = new Setup();
        List<Tab> screenTabs;
        if (sad == 1)
            screenTabs = setup.getScreenTabs(isTablet);
        else
            screenTabs = setup.getScreenTabs2(isTablet);

        for(Tab screenTab:screenTabs){
            spec = tabHost.newTabSpec(screenTab.Tag);
            spec.setContent(new Intent().setClass(this,screenTab.Class));
            spec.setIndicator(screenTab.Indicator);
            tabHost.addTab(spec);
        }

        if((SADIndex == 1)&&(!this.isTablet)){
            this.tabHost.getTabWidget().getChildAt(0).getLayoutParams().height = 0;
        }

        for(int i=tabHost.getTabWidget().getTabCount()-1;i>=0;i--){
            tabHost.setCurrentTab(i);
        }


        /*this.tabHost.getTabWidget().getChildAt(0).getLayoutParams().height = 35;
        this.tabHost.getTabWidget().getChildAt(1).getLayoutParams().height = 35;
        this.tabHost.getTabWidget().getChildAt(2).getLayoutParams().height = 35;
        this.tabHost.getTabWidget().getChildAt(3).getLayoutParams().height = 35;
        this.tabHost.getTabWidget().getChildAt(4).getLayoutParams().height = 35;*/
        setup.setAlerts(this);



    }
}

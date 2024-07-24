package br.cta.ipev.terere_auto;

import br.cta.isad.iCounts2UE;
import br.cta.isad.EV;

public class CoefsSAD2 extends CoefsSAD implements iCounts2UE, iOffsets {
    public static final String TAG = "CoefsSAD2";
    public static final int R1EHA = 13 - OFFSET_IENA;
    public static final int R1EHB = 14 - OFFSET_IENA;
    public static final int R1EHC = 15 - OFFSET_IENA;
    public static final int R1EVA = 16 - OFFSET_IENA;
    public static final int R1EVB = 17 - OFFSET_IENA;
    public static final int R1EVC = 18 - OFFSET_IENA;
    public static final int R1LA = 19 - OFFSET_IENA;
    public static final int R2EHA = 20 - OFFSET_IENA;
    public static final int R2EHB = 21 - OFFSET_IENA;
    public static final int R2EHC = 22 - OFFSET_IENA;
    public static final int R2EVA = 23 - OFFSET_IENA;
    public static final int R2EVB = 24 - OFFSET_IENA;
    public static final int R2EVC=  25 - OFFSET_IENA;
    public static final int R2LA = 26 - OFFSET_IENA;
    public static final int R3LA = 27 - OFFSET_IENA;
    public static final int R4LA = 28 - OFFSET_IENA;

    public static final int TCG102D_0_J4_HI_TI = 29 - OFFSET_IENA;

    public static final int TCG102D_0_J4_LO_TI = 36 - OFFSET_IENA;
    public static final int TCG102D_0_J4_MI_TI=  37 - OFFSET_IENA;

    @Override
    public double[] convert(char[] counts) {
        double[] result = new double[Index.values().length];
        double[] CV;

        //TEMPO
        result[Index.TEMPO.ordinal()] = EV.sadtime2secs(0xffff & counts[TCG102D_0_J4_HI_TI], 0xffff & counts[TCG102D_0_J4_LO_TI], 0xffff & counts[TCG102D_0_J4_MI_TI]);

        // TOP
        result[Index.TOP.ordinal()] = 0;

        //R1EHA_0
        CV = new double[]{6.53528E-01, -2.09992E+04};
        result[Index.R1EHA.ordinal()] = EV.polyval(CV,counts[R1EHA]) - this._offsetsCVT[Index.R1EHA.ordinal()];

        //R1EHB_0
        CV = new double[]{6.50435E-01, -2.08989E+04};
        result[Index.R1EHB.ordinal()]  = EV.polyval(CV,counts[R1EHB]) - this._offsetsCVT[Index.R1EHB.ordinal()];

        //R1EHC_0
        CV = new double[]{6.53527E-01, -2.10043E+04};
        result[Index.R1EHC.ordinal()]  = EV.polyval(CV,counts[R1EHC]) - this._offsetsCVT[Index.R1EHC.ordinal()];

        result[Index.R1EH.ordinal()] = EV.sigmaVM(E, v,
                result[Index.R1EHA.ordinal()],
                result[Index.R1EHB.ordinal()],
                result[Index.R1EHC.ordinal()]);

        //R2EHA_0
        CV = new double[]{6.50273E-01, -2.06229E+04};
        result[Index.R2EHA.ordinal()] = EV.polyval(CV,counts[R2EHA]) - this._offsetsCVT[Index.R2EHA.ordinal()];

        //R2EHB_0
        CV = new double[]{6.41243E-01, -2.05881E+04};
        result[Index.R2EHB.ordinal()] = EV.polyval(CV,counts[R2EHB]) - this._offsetsCVT[Index.R2EHB.ordinal()];

        //R2EHC_0
        CV = new double[]{6.41305E-01, -2.05898E+04};
        result[Index.R2EHC.ordinal()] = EV.polyval(CV,counts[R2EHC]) - this._offsetsCVT[Index.R2EHC.ordinal()];

        result[Index.R2EH.ordinal()] = EV.sigmaVM(E, v,
                result[Index.R2EHA.ordinal()],
                result[Index.R2EHB.ordinal()],
                result[Index.R2EHC.ordinal()]);

        //R1EVA_0
        CV = new double[]{6.53315E-01, -2.06348E+04};
        result[Index.R1EVA.ordinal()] = EV.polyval(CV,counts[R1EVA]) - this._offsetsCVT[Index.R1EVA.ordinal()];

        //R1EVB_0
        CV = new double[]{6.50268E-01, -2.06181E+04};
        result[Index.R1EVB.ordinal()] = EV.polyval(CV,counts[R1EVB]) - this._offsetsCVT[Index.R1EVB.ordinal()];

        //R1EVC_0
        CV = new double[]{6.53328E-01, -2.06360E+04};
        result[Index.R1EVC.ordinal()] = EV.polyval(CV,counts[R1EVC]) - this._offsetsCVT[Index.R1EVC.ordinal()];

        result[Index.R1EV.ordinal()] = EV.sigmaVM(E, v,
                result[Index.R1EVA.ordinal()],
                result[Index.R1EVB.ordinal()],
                result[Index.R1EVC.ordinal()]);

        //R2EVA_0
        CV = new double[]{6.53362E-01, -2.06294E+04};
        result[Index.R2EVA.ordinal()] = EV.polyval(CV,counts[R2EVA]) - this._offsetsCVT[Index.R2EVA.ordinal()];

        //R2EVB_0
        CV = new double[]{6.50313E-01, -2.06216E+04};
        result[Index.R2EVB.ordinal()] = EV.polyval(CV,counts[R2EVB]) - this._offsetsCVT[Index.R2EVB.ordinal()];

        //R2EVC_0
        CV = new double[]{6.53360E-01, -2.06238E+04};
        result[Index.R2EVC.ordinal()] = EV.polyval(CV,counts[R2EVC]) - this._offsetsCVT[Index.R2EVC.ordinal()];

        result[Index.R2EV.ordinal()] = EV.sigmaVM(E, v,
                result[Index.R2EVA.ordinal()],
                result[Index.R2EVB.ordinal()],
                result[Index.R2EVC.ordinal()]);

        //R1LA_0
        CV = new double[]{-5.270878E-13, 5.048570E-08, 6.52204E-01, -2.08963E+04};
        result[Index.R1LA.ordinal()] = EV.polyval(CV,counts[R1LA]) - this._offsetsCVT[Index.R1LA.ordinal()];
        result[Index.R1L.ordinal()] = EV.sigmaVM(E, result[Index.R1LA.ordinal()]);

        //R2LA_0
        CV = new double[]{-1.208354E-13, 1.197121E-08, 6.50184E-01, -2.08954E+04};
        result[Index.R2LA.ordinal()] = EV.polyval(CV,counts[R2LA]) - this._offsetsCVT[Index.R2LA.ordinal()];
        result[Index.R2L.ordinal()] = EV.sigmaVM(E,result[Index.R2LA.ordinal()]);

        //RSA1
        result[Index.RSA1A.ordinal()] = 0;
        result[Index.RSA1B.ordinal()] = 0;
        result[Index.RSA1C.ordinal()] = 0;
        result[Index.RSA1.ordinal()] = 0;

        //RSA2
        result[Index.RSA2A.ordinal()] = 0;
        result[Index.RSA2B.ordinal()] = 0;
        result[Index.RSA2C.ordinal()] = 0;
        result[Index.RSA2.ordinal()] = 0;

        //RHA1
        result[Index.RHA1A.ordinal()] = 0;
        result[Index.RHA1.ordinal()] = 0;

        //RHA2
        result[Index.RHA2A.ordinal()] = 0;
        result[Index.RHA2.ordinal()] = 0;

        //RH2P1
        result[Index.RH2P1.ordinal()] = 0;

        //RH2P2
        result[Index.RH2P2A.ordinal()] = 0;
        result[Index.RH2P2.ordinal()] = 0;

        //TQ1
        result[Index.TQ1.ordinal()] = 0;

        //TQ2
        result[Index.TQ2.ordinal()] = 0;

        //NP1
        result[Index.NP1.ordinal()] = 0;

        //NP2
        result[Index.NP2.ordinal()] = 0;

        //RAW1
        result[Index.RAW1.ordinal()] = 0;

        //RAW2
        result[Index.RAW2.ordinal()] = 0;

        //TRM1
        result[Index.TRM1.ordinal()] = 0;

        //TRM2
        result[Index.TRM2.ordinal()] = 0;

        //RFF
        result[Index.RFF.ordinal()] = 0;

        //LFF
        result[Index.LFF.ordinal()] = 0;

        //JX
        result[Index.JX.ordinal()] = 0;

        //JY
        result[Index.JY.ordinal()] = 0;

        //JZ
        result[Index.JZ.ordinal()] = 0;

        //P
        result[Index.P.ordinal()] = 0;

        //Q
        result[Index.Q.ordinal()] = 0;

        //R
        result[Index.R.ordinal()] = 0;

        //THETA
        result[Index.THETA.ordinal()] = 0;

        //PHI
        result[Index.PHI.ordinal()] = 0;

        //PSI
        result[Index.PSI.ordinal()] = 0;

        //GAMA
        result[Index.GAMA.ordinal()] = 0;

        //HEADING
        result[Index.HEADING.ordinal()] = 0;

        //AOA1
        result[Index.AOA1.ordinal()] = 0;

        //A0A2
        result[Index.AOA2.ordinal()] = 0;

        //TAS
        result[Index.TAS.ordinal()] = 0;

        //CAS
        result[Index.CAS.ordinal()] = 0;

        //MACH
        result[Index.MACH.ordinal()] = 0;

        //SP
        result[Index.SP.ordinal()] = 0;

        //TP
        result[Index.TP.ordinal()] = 0;

        //SA
        result[Index.SA.ordinal()] = 0;

        //SAT
        result[Index.SAT.ordinal()] = 0;

        //TAT
        result[Index.TAT.ordinal()] = 0;

        //VZIB
        result[Index.VZIB.ordinal()] = 0;

        //GR_WEIGHT
        result[Index.GR_WEIGHT.ordinal()] = 0;

        //GSPEED
        result[Index.GSPEED.ordinal()] = 0;

        //WSPEED
        result[Index.WSPEED.ordinal()] = 0;

        //WANGLE
        result[Index.WANGLE.ordinal()] = 0;

        //BARO_C_A
        result[Index.WANGLE.ordinal()] = 0;

        //TE
        result[Index.TE.ordinal()] = 0;

        //TD
        result[Index.TD.ordinal()] = 0;

        //DDL
        result[Index.DDL.ordinal()] = 0;

        //DL_1
        result[Index.DL_1.ordinal()] = 0;

        //DL_2
        result[Index.DL_2.ordinal()] = 0;

        //TI
        result[Index.TI.ordinal()] = 0;

        this._currentCVT = result;
        return this._currentCVT;
    }
}

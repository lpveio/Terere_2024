package br.cta.ipev.terere_auto;

import br.cta.isad.iCounts2UE;
import br.cta.isad.EV;

public class CoefsSAD1 extends CoefsSAD implements iCounts2UE, iOffsets {
    public static final String TAG = "CoefsSAD1";
    public static final int TOP_HI = 134 - OFFSET_IENA;
    public static final int TOP_LO = 135 - OFFSET_IENA;

    public static final int TCG102C_0_J3_HI_TI = 147 - OFFSET_IENA;
    public static final int TCG102C_0_J3_LO_TI = 148 - OFFSET_IENA;
    public static final int TCG102C_0_J3_MI_TI=  149 - OFFSET_IENA;

    public static final int EIDS1_LFF_dh = 86 - OFFSET_IENA;
    public static final int EIDS1_LFF_dl = 87 - OFFSET_IENA;
    public static final int EIDS2_RFF_dh = 88  - OFFSET_IENA;
    public static final int EIDS2_RFF_dl = 89 - OFFSET_IENA;

    public static final int EEC1_NP_1_dh = 70 - OFFSET_IENA;
    public static final int EEC1_NP_1_dl = 71 - OFFSET_IENA;
    public static final int EEC1_RAW1_dh = 72 - OFFSET_IENA;
    public static final int EEC1_RAW1_dl = 73 - OFFSET_IENA;
    public static final int EEC1_TQ_1_dh = 74 - OFFSET_IENA;
    public static final int EEC1_TQ_1_dl = 75  - OFFSET_IENA;
    public static final int EEC1_TRM1_dh = 76 - OFFSET_IENA;
    public static final int EEC1_TRM1_dl = 77 - OFFSET_IENA;

    public static final int EEC2_NP_2_dh = 78 - OFFSET_IENA;
    public static final int EEC2_NP_2_dl = 79 - OFFSET_IENA;
    public static final int EEC2_RAW2_dh = 80 - OFFSET_IENA;
    public static final int EEC2_RAW2_dl = 81 - OFFSET_IENA;
    public static final int EEC2_TQ_2_dh = 82 - OFFSET_IENA;
    public static final int EEC2_TQ_2_dl = 83  - OFFSET_IENA;
    public static final int EEC2_TRM2_dh = 84 - OFFSET_IENA;
    public static final int EEC2_TRM2_dl = 85 - OFFSET_IENA;

    public static final int AHRU_JX_dh = 31 - OFFSET_IENA;
    public static final int AHRU_JX_dl = 32 - OFFSET_IENA;
    public static final int AHRU_JY_dh = 33 - OFFSET_IENA;
    public static final int AHRU_JY_dl = 34 - OFFSET_IENA;
    public static final int AHRU_JZ_dh = 35 - OFFSET_IENA;
    public static final int AHRU_JZ_dl = 36 - OFFSET_IENA;

    public static final int AHRU_P_dh = 37 - OFFSET_IENA;
    public static final int AHRU_P_dl = 38 - OFFSET_IENA;
    public static final int AHRU_Q_dh = 43 - OFFSET_IENA;
    public static final int AHRU_Q_dl = 44 - OFFSET_IENA;
    public static final int AHRU_R_dh = 45 - OFFSET_IENA;
    public static final int AHRU_R_dl = 46 - OFFSET_IENA;

    public static final int AHRU_THETA_dh = 47 - OFFSET_IENA;
    public static final int AHRU_THETA_dl = 48 - OFFSET_IENA;
    public static final int AHRU_PHI_dh = 39 - OFFSET_IENA;
    public static final int AHRU_PHI_dl = 40 - OFFSET_IENA;
    public static final int AHRU_PSI_dh = 41 - OFFSET_IENA;
    public static final int AHRU_PSI_dl = 42 - OFFSET_IENA;

    public static final int GAMA_GAMA_dh = 92 - OFFSET_IENA;
    public static final int GAMA_GAMA_dl = 93 - OFFSET_IENA;
    public static final int GAMA_HEADING_dh = 98 - OFFSET_IENA;
    public static final int GAMA_HEADING_dl = 99 - OFFSET_IENA;

    public static final int AOA1_LHAOA11_dh = 60 - OFFSET_IENA;
    public static final int AOA1_LHAOA11_dl = 61 - OFFSET_IENA;
    public static final int AOA2_RHAOA22_dh = 68 - OFFSET_IENA;
    public static final int AOA2_RHAOA22_dl = 69 - OFFSET_IENA;
    public static final int ADU_TAS_dh = 21 - OFFSET_IENA;
    public static final int ADU_TAS_dl = 22 - OFFSET_IENA;
    public static final int ADU_CAS_dh = 9 - OFFSET_IENA;
    public static final int ADU_CAS_dl = 10 - OFFSET_IENA;
    public static final int ADU_MACH_dh = 13 - OFFSET_IENA;
    public static final int ADU_MACH_dl = 14 - OFFSET_IENA;
    public static final int ADU_SP_dh = 19 - OFFSET_IENA;
    public static final int ADU_SP_dl = 20 - OFFSET_IENA;
    public static final int ADU_TP_dh = 25 - OFFSET_IENA;
    public static final int ADU_TP_dl = 26 - OFFSET_IENA;
    public static final int ADU_SA_dh = 15 - OFFSET_IENA;
    public static final int ADU_SA_dl = 16 - OFFSET_IENA;

    public static final int ADU_SAT_dh = 17 - OFFSET_IENA;
    public static final int ADU_SAT_dl = 18 - OFFSET_IENA;
    public static final int ADU_TAT_dh = 23 - OFFSET_IENA;
    public static final int ADU_TAT_dl = 24 - OFFSET_IENA;

    public static final int AHRU_VZIB_dh = 49 - OFFSET_IENA;
    public static final int AHRU_VZIB_dl = 50 - OFFSET_IENA;
    public static final int GAMA_GR_WEIGHT_dh = 94 - OFFSET_IENA;
    public static final int GAMA_GR_WEIGHT_dl = 95 - OFFSET_IENA;
    public static final int GAMA_GSPEED_dh = 96 - OFFSET_IENA;
    public static final int GAMA_GSPEED_dl = 97 - OFFSET_IENA;
    public static final int GAMA_WSPEED_dh = 108 - OFFSET_IENA;
    public static final int GAMA_WSPEED_dl = 109 - OFFSET_IENA;
    public static final int GAMA_WANGLE_dh = 106 - OFFSET_IENA;
    public static final int GAMA_WANGLE_dl = 107 - OFFSET_IENA;
    public static final int ADU_Alt_baro_c_dh = 7 - OFFSET_IENA;
    public static final int ADU_Alt_baro_c_dl = 8 - OFFSET_IENA;

    public static final int TD1 = 127 - OFFSET_IENA;
    public static final int TD2 = 128 - OFFSET_IENA;
    public static final int TD3 = 129 - OFFSET_IENA;
    public static final int TE1 = 130 - OFFSET_IENA;
    public static final int TE2 = 131 - OFFSET_IENA;
    public static final int TE3 = 132 - OFFSET_IENA;

    public static final int RSA1A = 121 - OFFSET_IENA;
    public static final int RSA1B = 122 - OFFSET_IENA;
    public static final int RSA1C = 123 - OFFSET_IENA;

    public static final int RSA2A = 124 - OFFSET_IENA;
    public static final int RSA2B = 125 - OFFSET_IENA;
    public static final int RSA2C = 126 - OFFSET_IENA;

    public static final int RHA1 = 119 - OFFSET_IENA;
    public static final int RHA2 = 120 - OFFSET_IENA;

    public static final int RH2P1 = 57 - OFFSET_IENA;
    public static final int RH2P2 = 56 - OFFSET_IENA;

    public static final int AILERON_CMD_POS = 55 - OFFSET_IENA;
    public static final int AILERON_DIR_POS = 117 - OFFSET_IENA;
    public static final int AILERON_ESQ_POS = 118 - OFFSET_IENA;

    public static final int TI = 133 - OFFSET_IENA;

    private int bitSinal = 1;

    @Override
    public double[] convert(char[] counts) {
        double[] result = new double[Index.values().length];
        double[] CV;
        int arincC105 = 0;
        int numBits = 0;

        //TEMPO
        result[Index.TEMPO.ordinal()] = EV.sadtime2secs(0xffff & counts[TCG102C_0_J3_HI_TI], 0xffff & counts[TCG102C_0_J3_LO_TI], 0xffff & counts[TCG102C_0_J3_MI_TI]);

        // TOP
        result[Index.TOP.ordinal()] = counts[TOP_LO];

        //R1EH
        result[Index.R1EHA.ordinal()] = 0;
        result[Index.R1EHB.ordinal()] = 0;
        result[Index.R1EHC.ordinal()] = 0;
        result[Index.R1EH.ordinal()] = 0;

        //R2EH
        result[Index.R2EHA.ordinal()] = 0;
        result[Index.R2EHB.ordinal()] = 0;
        result[Index.R2EHC.ordinal()] = 0;
        result[Index.R2EH.ordinal()] = 0;

        //R1EV
        result[Index.R1EVA.ordinal()] = 0;
        result[Index.R1EVB.ordinal()] = 0;
        result[Index.R1EVC.ordinal()] = 0;
        result[Index.R1EV.ordinal()] = 0;

        //R2EV
        result[Index.R2EVA.ordinal()] = 0;
        result[Index.R2EVB.ordinal()] = 0;
        result[Index.R2EVC.ordinal()] = 0;
        result[Index.R2EV.ordinal()] = 0;

        //R1LA_0
        result[Index.R1LA.ordinal()] = 0;
        result[Index.R1L.ordinal()] = 0;
        result[Index.R1L.ordinal()] = 0;

        //R2LA_0
        result[Index.R2LA.ordinal()] = 0;
        result[Index.R2L.ordinal()] = 0;

        //RSA1 [RSA1A, RSA1B, RSA1C]
        CV = new double[]{-7.268936E-14, 6.665517E-09, 6.119901E-01, -2.065888E04};
        result[Index.RSA1A.ordinal()] = EV.polyval(CV,counts[RSA1A]) - this._offsetsCVT[Index.RSA1A.ordinal()];

        CV = new double[]{-6.413501E-14, 6.012330E-09, 6.062781E-01, -2.046630E04};
        result[Index.RSA1B.ordinal()] = EV.polyval(CV,counts[RSA1B]) - this._offsetsCVT[Index.RSA1B.ordinal()];

        CV = new double[]{-5.987127E-14, 5.666792E-09, 6.119705E-01, -2.065849E04};
        result[Index.RSA1C.ordinal()] = EV.polyval(CV,counts[RSA1C]) - this._offsetsCVT[Index.RSA1C.ordinal()];

        result[Index.RSA1.ordinal()] = EV.sigmaVM(E, v,
                result[Index.RSA1A.ordinal()],
                result[Index.RSA1B.ordinal()],
                result[Index.RSA1C.ordinal()]);

        //RSA2 [RSA2A, RSA2B, RSA2C]
        CV = new double[]{0.612154, -20660.39};
        result[Index.RSA2A.ordinal()] = EV.polyval(CV,counts[RSA2A]) - this._offsetsCVT[Index.RSA2A.ordinal()];

        CV = new double[]{0.606334, -20466.15};
        result[Index.RSA2B.ordinal()] = EV.polyval(CV,counts[RSA2B]) - this._offsetsCVT[Index.RSA2B.ordinal()];

        CV = new double[]{0.612079, -20662.46};
        result[Index.RSA2C.ordinal()] = EV.polyval(CV,counts[RSA2C]) - this._offsetsCVT[Index.RSA2C.ordinal()];

        result[Index.RSA2.ordinal()] = EV.sigmaVM(E, v,
                result[Index.RSA2A.ordinal()],
                result[Index.RSA2B.ordinal()],
                result[Index.RSA2C.ordinal()]);

        //RHA1
        CV = new double[]{-1.439713E-13, 1.359134E-08, 6.249419E-01, -2.109423E04};
        result[Index.RHA1A.ordinal()] = EV.polyval(CV,counts[RHA1]) - this._offsetsCVT[Index.RHA1A.ordinal()];
        result[Index.RHA1.ordinal()] = EV.sigmaVM(E, result[Index.RHA1A.ordinal()]);

        //RHA2
        CV = new double[]{-5.415286E-14, 4.623532E-09, 6.251784E-01, -2.109411E04};
        result[Index.RHA2A.ordinal()] = EV.polyval(CV,counts[RHA2]) - this._offsetsCVT[Index.RHA2A.ordinal()];
        result[Index.RHA2.ordinal()] = EV.sigmaVM(E,result[Index.RHA2A.ordinal()]);

        //RH2P1
        CV = new double[]{8.64363740786847e-16, -2.27824210444690e-10, 2.40124945139026e-05, -1.26508786233342, 33315.9440841980, -350851772.582865};
        result[Index.RH2P1.ordinal()] = EV.polyval(CV,counts[RH2P1]);

        //RH2P2
        CV = new double[]{-1.431987E-13, 1.438919E-08, 6.548887E-01, -2.209222E04};
        result[Index.RH2P2A.ordinal()] = EV.polyval(CV,counts[RH2P2]) - this._offsetsCVT[Index.RH2P2A.ordinal()];
        result[Index.RH2P2.ordinal()] = EV.sigmaVM(E, result[Index.RH2P2A.ordinal()]);

        //TQ1
        numBits = 12 + bitSinal;
        arincC105 = EV.extrairArincC105(mergeWords(counts[EEC1_TQ_1_dh], counts[EEC1_TQ_1_dl]));
        arincC105 = arincC105 >> (EV.ARINCC105DataFieldSize - numBits);
        result[Index.TQ1.ordinal()] = EV.TwosComplement(arincC105,numBits) * 0.0625;

        //TQ2
        arincC105 = EV.extrairArincC105(mergeWords(counts[EEC2_TQ_2_dh], counts[EEC2_TQ_2_dl]));
        arincC105 = arincC105 >> (EV.ARINCC105DataFieldSize - numBits);
        result[Index.TQ2.ordinal()] = EV.TwosComplement(arincC105,numBits) * 0.0625;

        //NP1
        numBits = 14 + bitSinal;
        arincC105 = EV.extrairArincC105(mergeWords(counts[EEC1_NP_1_dh], counts[EEC1_NP_1_dl]));
        arincC105 = arincC105 >> (EV.ARINCC105DataFieldSize - numBits);
        result[Index.NP1.ordinal()] = EV.TwosComplement(arincC105,numBits) * 0.015625;

        //NP2
        arincC105 = EV.extrairArincC105(mergeWords(counts[EEC2_NP_2_dh], counts[EEC2_NP_2_dl]));
        arincC105 = arincC105 >> (EV.ARINCC105DataFieldSize - numBits);
        result[Index.NP2.ordinal()] = EV.TwosComplement(arincC105,numBits) * 0.015625;

        //RAW1
        numBits = 12 + bitSinal;
        arincC105 = EV.extrairArincC105(mergeWords(counts[EEC1_RAW1_dh],counts[EEC1_RAW1_dl]));
        arincC105 = arincC105 >> (EV.ARINCC105DataFieldSize - numBits);
        result[Index.RAW1.ordinal()] = EV.TwosComplement(arincC105,numBits) * 0.0439453125;

        //RAW2
        arincC105 = EV.extrairArincC105(mergeWords(counts[EEC2_RAW2_dh], counts[EEC2_RAW2_dl]));
        arincC105 = arincC105 >> (EV.ARINCC105DataFieldSize - numBits);
        result[Index.RAW2.ordinal()] = EV.TwosComplement(arincC105,numBits) * 0.0439453125;

        //TRM1
        arincC105 = EV.extrairArincC105(mergeWords(counts[EEC1_TRM1_dh], counts[EEC1_TRM1_dl]));
        arincC105 = arincC105 >> (EV.ARINCC105DataFieldSize - numBits);
        result[Index.TRM1.ordinal()] = EV.TwosComplement(arincC105,numBits) * 0.0439453125;

        //TRM2
        arincC105 = EV.extrairArincC105(mergeWords(counts[EEC2_TRM2_dh], counts[EEC2_TRM2_dl]));
        arincC105 = arincC105 >> (EV.ARINCC105DataFieldSize - numBits);
        result[Index.TRM2.ordinal()] = EV.TwosComplement(arincC105,numBits) * 0.0439453125;

        //RFF
        numBits = 16 + bitSinal;
        arincC105 = EV.extrairArincC105(mergeWords(counts[EIDS2_RFF_dh], counts[EIDS2_RFF_dl]));
        arincC105 = arincC105 >> (EV.ARINCC105DataFieldSize - numBits);
        result[Index.RFF.ordinal()] = EV.TwosComplement(arincC105,numBits) * 0.5;

        //LFF
        arincC105 = EV.extrairArincC105(mergeWords(counts[EIDS1_LFF_dh], counts[EIDS1_LFF_dl]));
        arincC105 = arincC105 >> (EV.ARINCC105DataFieldSize - numBits);
        result[Index.LFF.ordinal()] = EV.TwosComplement(arincC105,numBits) * 0.5;

        //JX
        numBits = 12 + bitSinal;
        arincC105 = EV.extrairArincC105(mergeWords(counts[AHRU_JX_dh], counts[AHRU_JX_dl]));
        arincC105 = arincC105 >> (EV.ARINCC105DataFieldSize - numBits);
        result[Index.JX.ordinal()] = EV.TwosComplement(arincC105,numBits) * 0.0009765625;

        //JY
        arincC105 = EV.extrairArincC105(mergeWords(counts[AHRU_JY_dh], counts[AHRU_JY_dl]));
        arincC105 = arincC105 >> (EV.ARINCC105DataFieldSize - numBits);
        result[Index.JY.ordinal()] = EV.TwosComplement(arincC105,numBits) * 0.0009765625;

        //JZ
        arincC105 = EV.extrairArincC105(mergeWords(counts[AHRU_JZ_dh], counts[AHRU_JZ_dl]));
        arincC105 = arincC105 >> (EV.ARINCC105DataFieldSize - numBits);
        result[Index.JZ.ordinal()] = EV.TwosComplement(arincC105,numBits) * 0.0009765625;

        //P
        numBits = 13 + bitSinal;
        arincC105 = EV.extrairArincC105(mergeWords(counts[AHRU_P_dh], counts[AHRU_P_dl]));
        arincC105 = arincC105 >> (EV.ARINCC105DataFieldSize - numBits);
        result[Index.P.ordinal()] = EV.TwosComplement(arincC105,numBits) * 0.015625;

        //Q
        arincC105 = EV.extrairArincC105(mergeWords(counts[AHRU_Q_dh], counts[AHRU_Q_dl]));
        arincC105 = arincC105 >> (EV.ARINCC105DataFieldSize - numBits);
        result[Index.Q.ordinal()] = EV.TwosComplement(arincC105,numBits) * 0.015625;

        //R
        arincC105 = EV.extrairArincC105(mergeWords(counts[AHRU_R_dh], counts[AHRU_R_dl]));
        arincC105 = arincC105 >> (EV.ARINCC105DataFieldSize - numBits);
        result[Index.R.ordinal()] = EV.TwosComplement(arincC105,numBits) * 0.015625;

        //THETA
        numBits = 14 + bitSinal;
        arincC105 = EV.extrairArincC105(mergeWords(counts[AHRU_THETA_dh], counts[AHRU_THETA_dl]));
        arincC105 = arincC105 >> (EV.ARINCC105DataFieldSize - numBits);
        result[Index.THETA.ordinal()] = EV.TwosComplement(arincC105,numBits) * 0.010986328125;

        //PHI
        arincC105 = EV.extrairArincC105(mergeWords(counts[AHRU_PHI_dh], counts[AHRU_PHI_dl]));
        arincC105 = arincC105 >> (EV.ARINCC105DataFieldSize - numBits);
        result[Index.PHI.ordinal()] = EV.TwosComplement(arincC105,numBits) * 0.010986328125;

        //PSI
        numBits = 15 + bitSinal;
        arincC105 = EV.extrairArincC105(mergeWords(counts[AHRU_PSI_dh], counts[AHRU_PSI_dl]));
        arincC105 = arincC105 >> (EV.ARINCC105DataFieldSize - numBits);
        result[Index.PSI.ordinal()] = EV.TwosComplement(arincC105,numBits) * 0.0054931640625;

        //GAMA
        numBits = 12 + bitSinal;
        arincC105 = EV.extrairArincC105(mergeWords(counts[GAMA_GAMA_dh], counts[GAMA_GAMA_dl]));
        arincC105 = arincC105 >> (EV.ARINCC105DataFieldSize - numBits);
        result[Index.GAMA.ordinal()] = EV.TwosComplement(arincC105,numBits) * 0.0054931640625;

        //HEADING
        numBits = 15 + bitSinal;
        arincC105 = EV.extrairArincC105(mergeWords(counts[GAMA_HEADING_dh], counts[GAMA_HEADING_dl]));
        arincC105 = arincC105 >> (EV.ARINCC105DataFieldSize - numBits);
        result[Index.HEADING.ordinal()] = EV.TwosComplement(arincC105,numBits) * 0.0054931640625;

        //AOA1
        numBits = 12 + bitSinal;
        arincC105 = EV.extrairArincC105(mergeWords(counts[AOA1_LHAOA11_dh], counts[AOA1_LHAOA11_dl]));
        arincC105 = arincC105 >> (EV.ARINCC105DataFieldSize - numBits);
        result[Index.AOA1.ordinal()] = EV.TwosComplement(arincC105,numBits) * 0.0439453125;

        //A0A2
        arincC105 = EV.extrairArincC105(mergeWords(counts[AOA2_RHAOA22_dh], counts[AOA2_RHAOA22_dl]));
        arincC105 = arincC105 >> (EV.ARINCC105DataFieldSize - numBits);
        result[Index.AOA2.ordinal()] = EV.TwosComplement(arincC105,numBits) * 0.0439453125;

        //TAS
        numBits = 15 + bitSinal;
        arincC105 = EV.extrairArincC105(mergeWords(counts[ADU_TAS_dh], counts[ADU_TAS_dl]));
        arincC105 = arincC105 >> (EV.ARINCC105DataFieldSize - numBits);
        result[Index.TAS.ordinal()] = EV.TwosComplement(arincC105,numBits) * 0.0625;

        //CAS
        numBits = 14 + bitSinal;
        arincC105 = EV.extrairArincC105(mergeWords(counts[ADU_CAS_dh], counts[ADU_CAS_dl]));
        arincC105 = arincC105 >> (EV.ARINCC105DataFieldSize - numBits);
        result[Index.CAS.ordinal()] = EV.TwosComplement(arincC105,numBits) * 0.0625;

        //MACH
        numBits = 16 + bitSinal;
        arincC105 = EV.extrairArincC105(mergeWords(counts[ADU_MACH_dh], counts[ADU_MACH_dl]));
        arincC105 = arincC105 >> (EV.ARINCC105DataFieldSize - numBits);
        result[Index.MACH.ordinal()] = EV.TwosComplement(arincC105,numBits) * 6.25E-05;

        //SP
        numBits = 16 + bitSinal;
        arincC105 = EV.extrairArincC105(mergeWords(counts[ADU_SP_dh], counts[ADU_SP_dl]));
        arincC105 = arincC105 >> (EV.ARINCC105DataFieldSize - numBits);
        result[Index.SP.ordinal()] = EV.TwosComplement(arincC105,numBits) * 0.03125;

        //TP
        arincC105 = EV.extrairArincC105(mergeWords(counts[ADU_TP_dh], counts[ADU_TP_dl]));
        arincC105 = arincC105 >> (EV.ARINCC105DataFieldSize - numBits);
        result[Index.TP.ordinal()] = EV.TwosComplement(arincC105,numBits) * 0.03125;

        //SA
        numBits = 17 + bitSinal;
        arincC105 = EV.extrairArincC105(mergeWords(counts[ADU_SA_dh], counts[ADU_SA_dl]));
        arincC105 = arincC105 >> (EV.ARINCC105DataFieldSize - numBits);
        result[Index.SA.ordinal()] = EV.TwosComplement(arincC105,numBits);

        //SAT
        numBits = 11 + bitSinal;
        arincC105 = EV.extrairArincC105(mergeWords(counts[ADU_SAT_dh], counts[ADU_SAT_dl]));
        arincC105 = arincC105 >> (EV.ARINCC105DataFieldSize - numBits);
        result[Index.SAT.ordinal()] = EV.TwosComplement(arincC105,numBits) * 0.25;

        //TAT
        arincC105 = EV.extrairArincC105(mergeWords(counts[ADU_TAT_dh], counts[ADU_TAT_dl]));
        arincC105 = arincC105 >> (EV.ARINCC105DataFieldSize - numBits);
        result[Index.TAT.ordinal()] = EV.TwosComplement(arincC105,numBits) * 0.25;

        //VZIB
        numBits = 15 + bitSinal;
        arincC105 = EV.extrairArincC105(mergeWords(counts[AHRU_VZIB_dh], counts[AHRU_VZIB_dl]));
        arincC105 = arincC105 >> (EV.ARINCC105DataFieldSize - numBits);
        result[Index.VZIB.ordinal()] = EV.TwosComplement(arincC105,numBits);

        //GR_WEIGHT
        numBits = 18 + bitSinal;
        arincC105 = EV.extrairArincC105(mergeWords(counts[GAMA_GR_WEIGHT_dh], counts[GAMA_GR_WEIGHT_dl]));
        arincC105 = arincC105 >> (EV.ARINCC105DataFieldSize - numBits);
        result[Index.GR_WEIGHT.ordinal()] = EV.TwosComplement(arincC105,numBits) * 2.2679;

        //GSPEED
        numBits = 15 + bitSinal;
        arincC105 = EV.extrairArincC105(mergeWords(counts[GAMA_GSPEED_dh], counts[GAMA_GSPEED_dl]));
        arincC105 = arincC105 >> (EV.ARINCC105DataFieldSize - numBits);
        result[Index.GSPEED.ordinal()] = EV.TwosComplement(arincC105,numBits) * 0.125;

        //WSPEED
        numBits = 8 + bitSinal;
        arincC105 = EV.extrairArincC105(mergeWords(counts[GAMA_WSPEED_dh], counts[GAMA_WSPEED_dl]));
        arincC105 = arincC105 >> (EV.ARINCC105DataFieldSize - numBits);
        result[Index.WSPEED.ordinal()] = EV.TwosComplement(arincC105,numBits);

        //WANGLE
        arincC105 = EV.extrairArincC105(mergeWords(counts[GAMA_WANGLE_dh], counts[GAMA_WANGLE_dl]));
        arincC105 = arincC105 >> (EV.ARINCC105DataFieldSize - numBits);
        result[Index.WANGLE.ordinal()] = EV.TwosComplement(arincC105,numBits) * 0.703125;

        //BARO_C_A
        numBits = 17 + bitSinal;
        arincC105 = EV.extrairArincC105(mergeWords(counts[ADU_Alt_baro_c_dh], counts[ADU_Alt_baro_c_dl]));
        arincC105 = arincC105 >> (EV.ARINCC105DataFieldSize - numBits);
        result[Index.BARO_C_A.ordinal()] = EV.TwosComplement(arincC105,numBits);

        //TE
        CV = new double[]{0.0193786621, -270};
        result[Index.TE.ordinal()] = 0;

        //TD
        result[Index.TD.ordinal()] = 0;

        //DDL
        CV = new double[]{-7.172171E-17, 5.535307E-12, -1.267426E-07, -6.009795E-03, 1.315509E02};
        result[Index.DDL.ordinal()] = EV.polyval(CV,counts[AILERON_CMD_POS]);

        //DL_1
        CV = new double[]{-7.425171E-18, 9.288115E-13, -3.169400E-08, 3.839718E-03, -1.120723E02};
        result[Index.DL_1.ordinal()] = EV.polyval(CV,counts[AILERON_ESQ_POS]);

        //DL_2
        CV = new double[]{-4.121487E-18, 4.958417E-13, -1.569907E-08, -3.576116E-03, 1.104174E02};
        result[Index.DL_2.ordinal()] = EV.polyval(CV,counts[AILERON_DIR_POS]);

        //TI
        CV = new double[]{2.337699E-18, -3.546667E-13, 1.935331E-08, 1.072171E-03, -4.639768E01};
        result[Index.TI.ordinal()] = EV.polyval(CV,counts[TI]);

        this._currentCVT = result;
        return this._currentCVT;
    }

}

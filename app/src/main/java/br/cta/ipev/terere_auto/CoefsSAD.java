package br.cta.ipev.terere_auto;

public abstract class CoefsSAD {
    protected double[] _currentCVT = new double[Index.values().length];
    protected double[] _offsetsCVT = new double[Index.values().length];
    protected double E = 7.17E10;
    protected double v = 3.3E-1;

    public static final int OFFSET_IENA = 7;

    public void set_offset(Index[] ids) {
        double[] offsets = new double[Index.values().length];
        for (int i=0; i < ids.length; i++){
            int id = ids[i].ordinal();
            offsets[id] = this._currentCVT[id];
        }
        this._offsetsCVT = offsets;
    }

    protected int mergeWords(int wHigh, int wLow){
        return ( (wHigh << 16) |  wLow);
    }

    protected double[] calculate_data_with_offsets(double[] CVT){
        double[] result = new double[Index.values().length];
        for (int i=0; i < CVT.length; i++){
            result[i] = CVT[i] - this._offsetsCVT[i];
        }
        return result;
    }
}

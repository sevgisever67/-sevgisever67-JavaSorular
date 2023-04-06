package kendim_Constructo2;

public class Araba {

        String marka;
        String model;
        int fiyat;

    public Araba (String mrk, String mdl, int fyt){
        marka = mrk;
        model=mdl;
        fiyat=fyt;
    }

    @Override
    public String toString() {
        return "Arabanın Özellikleri  " +
                "       \n marka = " + marka +
                "       \n model = " + model +
                "       \n fiyat = " + fiyat ;
    }

}

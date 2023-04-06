package kendim_Constructor;

public class C06_Araba {
    int yıl;

    @Override
    public String toString() {
        return "C06_Araba{" +
                "yıl=" + yıl +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", hasarliMi=" + hasarliMi +
                ", fiyat=" + fiyat +
                '}';
    }

    String marka="Marka belirtilmemiş";
    String model="Model belirtilmemiş";
    boolean hasarliMi;
    int fiyat;

    public  C06_Araba(String mrk, Boolean hsrlMi, int yl, int fyt,String mdl){
        marka=mrk;
        yıl=yl;
        model=mdl;
        hasarliMi=hsrlMi;
        fiyat=fyt;

    }
    public C06_Araba(){

    }



    public void yakitTuketimi(String yakitTuru){
        switch (yakitTuru){
            case "Benzin" :
                System.out.println("benzinli araclar icin yakit tuketimi: 6 l/100 km");
                break;
            case "dizel" :
                System.out.println("Dizel araclar icin yakit tuketimi: 5 l/100 km");
                break;
            case "Elektrik" :
                System.out.println("Elektrikli araclar icin yakit tuketimi: 5 kW/100 km");
                break;
            default:
                System.out.println("gecersiz yakit turu");
        }
    }
}

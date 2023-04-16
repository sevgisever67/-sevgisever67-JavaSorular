package hastaneProjesi;

public class Doktor extends Hastane{
    String isim;
    String soyisim;
    String unvan;

    public Doktor(String isim, String soyisim, String unvan) {
        this.isim=isim;
        this.soyisim=soyisim;
        this.unvan=unvan;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

}


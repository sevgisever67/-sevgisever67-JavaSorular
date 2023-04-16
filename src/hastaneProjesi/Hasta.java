package hastaneProjesi;

public class Hasta {
    private String isim;
    private String soyIsim;
    private int hastaID;
    private Durum hastaDurumu;

    public Hasta(String hastaİsimleri, String hastaSoyİsimleri, int hastaİd, Durum hastaDurumu {
    this.isim=hastaİsimleri;
    this.soyIsim=hastaSoyİsimleri;
    this.hastaID=hastaİd;
    this.hastaDurumu=hastaDurumu;

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public int getHastaID() {
        return hastaID;
    }

    public void setHastaID(int hastaID) {
        this.hastaID = hastaID;
    }
}

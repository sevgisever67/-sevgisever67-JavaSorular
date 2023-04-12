package hastaneProjesi;

public class Hasta {
    private String isim;

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setSoyİsim(boolean soyİsim) {
        this.soyİsim = soyİsim;
    }

    public void setHastaID(boolean hastaID) {
        this.hastaID = hastaID;
    }

    public void setHasataDurumu(boolean hasataDurumu) {
        this.hasataDurumu = hasataDurumu;
    }

    private boolean soyİsim;
    private boolean hastaID;
    private  boolean hasataDurumu;

    public String getIsim() {
        return isim;
    }

    public boolean isSoyİsim() {
        return soyİsim;
    }

    public boolean isHastaID() {
        return hastaID;
    }

    public boolean isHasataDurumu() {
        return hasataDurumu;
    }
}

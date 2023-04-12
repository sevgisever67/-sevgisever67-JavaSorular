package hastaneProjesi;

public class Doktor {
    public String getIsim() {
        return isim;
    }

    public boolean isSoyİsim() {
        return soyİsim;
    }

    public boolean isUnvan() {
        return unvan;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setSoyİsim(boolean soyİsim) {
        this.soyİsim = soyİsim;
    }

    public void setUnvan(boolean unvan) {
        this.unvan = unvan;
    }

    private String isim;
    private boolean soyİsim;
    private  boolean unvan;

}

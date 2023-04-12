package hastaneProjesi;

public class Durum {
    private String aktalDurum;
    private  boolean aciliyet;

    public void setAktalDurum(String aktalDurum) {
        this.aktalDurum = aktalDurum;
    }

    public void setAciliyet(boolean aciliyet) {
        this.aciliyet = aciliyet;
    }

    public String getAktalDurum() {
        return aktalDurum;
    }

    public boolean isAciliyet() {
        return aciliyet;
    }
}

package hastaneOtomasyon;

public class Durum {

	//private String aktuelDurum;
	private boolean aciliyet;




	public boolean isAciliyet() {
		return aciliyet;
	}
	public void setAciliyet(boolean aciliyet) {
		this.aciliyet = aciliyet;

	}

	@Override
	public String toString() {
		return "Durum : aciliyet" + aciliyet;

	}
}

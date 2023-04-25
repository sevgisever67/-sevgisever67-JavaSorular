package hastaneOtomasyon;

import java.util.Random;
import java.util.Scanner;

public class HastaneRunner {
	static Durum durum = new Durum();
	private static Hastane hastane1 = new Hastane();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Sikayetinizi giriniz : ");
		String sikayet = scan.nextLine();

		//hastane1.setDoktor(doktorBul(sikayet));
		hastane1.setHasta(hastaBul(sikayet));
		durum.setAciliyet(hastaDurumuBul(sikayet).isAciliyet());
		doktorBul(sikayet);

		//System.out.println("Doktor ismi : " + hastane1.doktor.getIsim());
		//System.out.println("Doktor Soyismi : " + hastane1.doktor.getSoyisim());
		//System.out.println("Doktor Unvani : " + hastane1.doktor.getUnvan());
		System.out.println("Hasta Ismi : " + hastane1.hasta.getIsim());
		System.out.println("Hasta Soyismi : " + hastane1.hasta.getSoyIsim());
		System.out.println("Hasta ID : " + hastane1.hasta.getHastaID());
		System.out.println("Hasta aciliyet : "+durum);
		scan.close();

	}

	public static String doktorUnvan(String sikayet) {

		if (sikayet.equalsIgnoreCase("Allerji")) {
			return hastane1.unvanlar.get(0);
		} else if (sikayet.equalsIgnoreCase("Bas agrisi")) {
			return hastane1.unvanlar.get(1);
		} else if (sikayet.equalsIgnoreCase("Diabet")) {
			return hastane1.unvanlar.get(2);
		} else if (sikayet.equalsIgnoreCase("Soguk Alginligi")) {
			return hastane1.unvanlar.get(3);
		} else if (sikayet.equalsIgnoreCase("Migren")) {
			return hastane1.unvanlar.get(4);
		} else if (sikayet.equalsIgnoreCase("Kalp hastaliklari")) {
			return hastane1.unvanlar.get(5);
		} else {
			return "Yanlis unvan";
		}

	}

	public static void doktorBul(String sikayet) {

		for (int i = 0; i < hastane1.doktorIsimleri.size(); i++) {
			if (sikayet.equalsIgnoreCase(hastane1.durumlar.get(i))) {
				System.out.println("doktor ismi :	"+hastane1.doktorIsimleri.get(i));
				System.out.println("doktor Soyismi :	"+hastane1.doktorSoyisimleri.get(i));
				System.out.println("doktor unvan : "+hastane1.unvanlar.get(i));
			}
		}

		//return hastane1.doktor;
	}

	public static Durum hastaDurumuBul(String sikayet) {

		sikayet = sikayet.substring(0, 1).toUpperCase() + sikayet.substring(1).toLowerCase();

		switch (sikayet) {
		case "Allerji":
			durum.setAciliyet(false);
			break;
		case "Bas agrisi":
			durum.setAciliyet(false);
			break;
		case "Diabet":
			durum.setAciliyet(false);
			break;
		case "Soguk alginligi":
			durum.setAciliyet(false);
			break;
		case "Migren":
			durum.setAciliyet(true);
			break;
		case "Kalp hastaliklari":
			durum.setAciliyet(true);
			break;

		default:
			System.out.println("Gecerli bir durum degil");
			break;
		}

		return durum;
	}

	public static Hasta hastaBul(String sikayet) {

		for (int i = 0; i < hastane1.hastaIsimleri.size(); i++) {
			sikayet = sikayet.substring(0, 1).toUpperCase() + sikayet.substring(1).toLowerCase();
			if (sikayet.equalsIgnoreCase(hastane1.durumlar.get(i))) {
				hastane1.hasta.setHastaID(hastane1.hastaIDleri.get(i));
				hastane1.hasta.setIsim(hastane1.hastaIsimleri.get(i));
				hastane1.hasta.setSoyIsim(hastane1.hastaSoyisimleri.get(i));
				
				hastane1.hasta.setHastaDurumu(null);

			}
		}

		return hastane1.hasta;

	}

}

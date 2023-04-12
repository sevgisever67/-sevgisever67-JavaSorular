package byPassValue;

import java.util.ArrayList;
import java.util.List;

public class ByPassValue {
    public static void main(String[] args) {
        List<Integer> liste=new ArrayList<>();
        liste.add(10);
        liste.add(20);
        System.out.println(listeyeYeniDegerAta(liste));
        System.out.println(liste);
        System.out.println(listeElementleriniDeğiştir(liste));
        System.out.println(liste);
    }

    private static List<Integer> listeElementleriniDeğiştir(List<Integer> liste) {
        liste.add(30);
        liste.add(50);
        return liste;
    }

    private static List<Integer> listeyeYeniDegerAta(List<Integer> liste) {
        List<Integer>yeniListe=new ArrayList<>();
        yeniListe.add(30);
        yeniListe.add(50);
        liste=yeniListe;
        return liste;

    }
}

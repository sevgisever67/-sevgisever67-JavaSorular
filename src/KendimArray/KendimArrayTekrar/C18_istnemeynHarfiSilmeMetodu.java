package KendimArray.KendimArrayTekrar;

import java.util.ArrayList;
import java.util.List;

public class C18_istnemeynHarfiSilmeMetodu {
    public static void main(String[] args) {
        //Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan
        //kismini list olarak bize donduren bir method olusturun
        List<String> str = new ArrayList<>();
        str.add("ayşe");
        str.add("esra");
        str.add("inci");
        str.add("yavuz");
        System.out.println(istenmeyenHarfiSilme(str, "i"));

    }

    public static List<String> istenmeyenHarfiSilme(List<String> silinecekliste, String istenmeyenHarf) {
        List<String> yeniListe = new ArrayList<>();
        for (String each : silinecekliste
        ) {
            if (!each.contains(istenmeyenHarf)) {
                yeniListe.add(each);

            }

        }
        return yeniListe;

    }

}




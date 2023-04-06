package Maps;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C05_Maps {
    public static void main(String[] args) {
        //öğrenciler mapinde subesi H olan öğrencilerin
        // isim soy isim ve sınıflarını yazdıralım

        Map<Integer,String> ögrenciMap=MapDepo.öğrenciMapOluştur();
        Set<Integer> ögrenciKey=ögrenciMap.keySet();
        Collection<String>ÖgrenciValueCollection=ögrenciMap.values();
        String yazdırılacakSube="h";
        MapDepo.HsınıfıÖğrencileriniYazdır(ögrenciMap,yazdırılacakSube);

    }
}

package Maps;

import java.util.HashMap;
import java.util.Map;

public class NestedMap {
    public static void main(String[] args) {
        Map<String,String> ogrenci1Map=new HashMap<>();
        ogrenci1Map.put("isim","Ali");
        ogrenci1Map.put("soyisim","Ak");
        ogrenci1Map.put("sınıf","10");
        ogrenci1Map.put("sube","H");
        ogrenci1Map.put("bölüm","Tm");

        Map<String,String> ogrenci2Map=new HashMap<>();
        ogrenci2Map.put("isim","kerem");
        ogrenci2Map.put("soyisim","can");
        ogrenci2Map.put("sınıf","11");
        ogrenci2Map.put("sube","t");
        ogrenci2Map.put("bölüm","Tm");

        Map<String,String> ogrenci3Map=new HashMap<>();
        ogrenci3Map.put("isim","Sude");
        ogrenci3Map.put("soyisim","çetin");
        ogrenci3Map.put("sınıf","10");
        ogrenci3Map.put("sube","H");
        ogrenci3Map.put("bölüm","MF");

        Map<Integer,Map<String,String>> okulMap=new HashMap<>();
        okulMap.put(101,ogrenci1Map);
        okulMap.put(102,ogrenci2Map);
        okulMap.put(103,ogrenci3Map);

        System.out.println(okulMap);
        /*
        101={Sube=H, sınıf=10, soyisim=Ak, Bölüm=Tm, isim=Ali},
        102={Sube=t, sınıf=11, soyisim=can, Bölüm=Tm, isim=kerem},
        103={Sube=H, sınıf=10, soyisim=çetin, Bölüm=MF, isim=Sude}
         */

        //101 Nolu öğrencinin sınıfını  yazdır
        System.out.println(okulMap.get(103).get("sube"));
        System.out.println(okulMap.get(102).get("sube").equalsIgnoreCase(okulMap.get(101).get("sube")));//False



    }
}

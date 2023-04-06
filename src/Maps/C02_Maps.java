package Maps;

import java.util.Map;

public class C02_Maps {
    public static void main(String[] args) {
        Map<Integer, String> ögrenciMap = MapDepo.öğrenciMapOluştur();
        ögrenciMap.put(107,"Hikmet-Yek-10,H-Söz");
        System.out.println(MapDepo.ismSoyisimDöndür(ögrenciMap, 107));//Hikmet Yek

        //106 numaralı öğrencinin subesini "k" yap;
        //varsa değiştirip geri döndür, yoksa aynen kalsın.
        int öğrenciKey=106;
        String yeniSube="k";
        ögrenciMap=MapDepo.öğrenciYeniSubeat(ögrenciMap,öğrenciKey,yeniSube);
        System.out.println(ögrenciMap);



    }
}

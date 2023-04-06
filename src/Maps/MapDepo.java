package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDepo {
    public static Map<Integer, String> öğrenciMapOluştur() {

        Map<Integer,String> öğrenciMap=new HashMap<>();
        öğrenciMap.put(101,"Hasan-can-10-H-MF");
        öğrenciMap.put(102,"sevgi-sever-11-l-TM");
        öğrenciMap.put(103,"ismail-sayar-10-l-MF");
        öğrenciMap.put(104,"ayse-sever-12-a-TM");
        öğrenciMap.put(105,"Hakan-koç-11-H-MF");
        öğrenciMap.put(106,"ali-sever-11-l-TM");

        return öğrenciMap;
    }

    public static String ismSoyisimDöndür(Map<Integer,String> ögrenciMap, int ögrencikey) {
        String ögrenciValue=ögrenciMap.get(ögrencikey);//Hakan-koç-11-H-MF
        String []valueArr=ögrenciValue.split("-");//[Hakan,koç,11,H,MF]
        String isimSoyisim=valueArr[0]+" "+valueArr[1];//Hakan koç

      return isimSoyisim;
    }

    public static Map<Integer, String> öğrenciYeniSubeat(Map<Integer, String> ögrenciMap, int öğrenciKey, String yeniSube) {

        if (ögrenciMap.containsKey(öğrenciKey)){
            String istenenKeyValue=ögrenciMap.get(öğrenciKey);//ali-sever-11-l-TM
            String[] istenenKeyValueArr=istenenKeyValue.split("-");//ali,sever,11,l,TM
            istenenKeyValueArr[3]=yeniSube;
            String istenenKeyYeniValue =istenenKeyValueArr[0]+"-"+
                                        istenenKeyValueArr[1]+ "-"+
                                        istenenKeyValueArr[2]+"-"+
                                        istenenKeyValueArr[3]+"-"+
                                        istenenKeyValueArr[4]+"-";
            ögrenciMap.put(öğrenciKey,istenenKeyYeniValue);

        }else {
            return ögrenciMap;
        }



    return ögrenciMap;
    }

    public static void HsınıfıÖğrencileriniYazdır(Map<Integer, String> ögrenciMap, String yazdırılacakSube) {
    ögrenciMap.keySet();


    }
}

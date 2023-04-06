package Maps;

import java.util.Map;

public class C03_Maps {
    public static void main(String[] args) {
       Map<Integer,String> ögrenciMap=MapDepo.öğrenciMapOluştur();
        System.out.println(ögrenciMap);
        /*
        101=Hasan-can-10-H-MF,
        102=sevgi-sever-11-l-TM,
        103=ismail-sayar-10-l-MF,
        104=ayse-sever-12-a-TM,
        105=Hakan-koç-11-H-MF,
        106=ali-sever-11-l-TM
         */
        ögrenciMap.put(108, "Ali-Eker-10-M-TM");

        System.out.println(ögrenciMap);
        /*
        101=Hasan-can-10-H-MF,
        102=sevgi-sever-11-l-TM,
        103=ismail-sayar-10-l-MF,
        104=ayse-sever-12-a-TM,
        105=Hakan-koç-11-H-MF,
        106=ali-sever-11-l-TM,
        108=Ali-Eker-10-M-TM}

         */
        ögrenciMap=MapDepo.öğrenciYeniSubeat(ögrenciMap,105,"z");
        System.out.println(ögrenciMap);
        /*
        101=Hasan-can-10-H-MF,
        102=sevgi-sever-11-l-TM,
        103=ismail-sayar-10-l-MF,
        104=ayse-sever-12-a-TM,
        105=Hakan-koç-11-z-MF-,
        106=ali-sever-11-l-TM,
        108=Ali-Eker-10-M-TM}

         */


    }
}

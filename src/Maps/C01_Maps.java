package Maps;

import java.util.Map;

public class C01_Maps {
    public static void main(String[] args) {

       Map<Integer,String>ögrencimap= MapDepo.öğrenciMapOluştur();
        System.out.println(ögrencimap);
        /*
        101=Hasan-can-10-H-MF,
        102=sevgi-sever-11-l-TM,
        103=ismail-sayar-10-l-MF,
        104=ayse-sever-12-a-TM,
        105=Hakan-koç-11-H-MF,
        106=ali-sever-11-l-TM}
         */
        System.out.println(ögrencimap.keySet());//101, 102, 103, 104, 105, 106

        int ögrencikey=105;
        String isimSoyisim=MapDepo.ismSoyisimDöndür(ögrencimap,ögrencikey);
        System.out.println(isimSoyisim);//Hakan koç

    }
}

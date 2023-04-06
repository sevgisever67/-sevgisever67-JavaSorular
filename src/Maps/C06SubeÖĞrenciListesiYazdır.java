package Maps;

import java.util.Collection;
import java.util.Map;

public class C06SubeÖĞrenciListesiYazdır {
    public static void main(String[] args) {
        //metodsuz Çözüm
        Map<Integer,String> öğrenciMap=MapDepo.öğrenciMapOluştur();
        Collection<String>valueCollection=öğrenciMap.values();//Hasan-can-10-H-MF,....
        String isteneSube="h";
        int sıraNo=1;
        System.out.println("====Şube Listesi=====");
        System.out.println("Sıra SınıfNo İsim Soyisim    ");
        for (String eachValue:valueCollection) {

            String [] valueArr=eachValue.split("-");//[Hasan,can,10,H,Mf]
            if (valueArr[3].equalsIgnoreCase(isteneSube)){
                System.out.println(sıraNo+".    " +valueArr[2] +"     "+ valueArr[0]+"  "+valueArr[1]);
                sıraNo++;
            }

        }


    }
}

package KendimArray.KendimArrayTekrar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C21_ForEachMükererisil {
    public static void main(String[] args) {
       // Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
       // elemanlardan sadece 1 tane yapip eski array’e yeni halini atayip yazdirin.

   int [] sayilar={7,2,2,5,5,6,7,8,8};
        List<Integer>yeniliste=new ArrayList<>();


        for (int each:sayilar
             ) {if (!yeniliste.contains(each)){
                 yeniliste.add(each);
             }
        }
        System.out.println(yeniliste);

        int [] yeniArraysayılar=new int[yeniliste.size()];

        for (int each:yeniArraysayılar
             ) {
            yeniArraysayılar[each]=yeniliste.get(each);

        }

        System.out.println(Arrays.toString(yeniArraysayılar));

    }
}

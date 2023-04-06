package Maps;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class C04_Maps {
    public static void main(String[] args) {
        //verilen bir cümlede kullanılan herbir harfi
        //ve o harfin kullanım miktarını
        //A=5,b=3 ...gibi yazdır

        String str="javayı balonu patlatmadan bitirelim";
        //j=1; a=7; v=1, y=1......,
        str=str.replaceAll(" ","");

        String [] harflerArr=str.split("");
        //j, a, v, a, y, ı,  , b, a, l, o, n, u,
        // , p, a, t, l, a, t, m, a, d, a, n,
        // , b, i, t, i, r, e, l, i, m]

        Map<String,Integer> kullanımMiktarlarıMap=new TreeMap<>();
        int sayaç=1;
        for (int i = 0; i < harflerArr.length ; i++) {
            if (!(kullanımMiktarlarıMap.containsKey(harflerArr[i]))) {
                for (int j = i + 1; j < harflerArr.length; j++) {
                    if (harflerArr[j].equals(harflerArr[i])) {
                        sayaç++;
                    }
                    kullanımMiktarlarıMap.put(harflerArr[i], sayaç);
                }
                sayaç = 1;
            }
        }
        System.out.println(kullanımMiktarlarıMap);
    }
}

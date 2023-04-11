package Maps;

import java.util.Map;
import java.util.TreeMap;

public class MapKullanımMiktarı {
    public static void main(String[] args) {
        String[]arr={"A","C","C","V","F","F"};
        Map<String,Integer> kullanımmiktarları=new TreeMap<>();
        for (String each:arr) {
            if (!kullanımmiktarları.containsKey(each)){
                kullanımmiktarları.put(each,1);
            }else {
                kullanımmiktarları.put(each,kullanımmiktarları.get(each)+1);
            }
        }
        System.out.println(kullanımmiktarları);
    }
}

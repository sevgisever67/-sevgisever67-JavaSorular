package Maps;

import java.util.Map;
import java.util.TreeMap;

public class KullanımMiktarı {
    public static void main(String[] args) {
        String[]arr={"A","C","C","V","F","F"};
        Map<String,Integer>kullanımmiktarları=new TreeMap<>();
        for (String eachArr:arr) {
            if (!kullanımmiktarları.containsKey(eachArr)){
                kullanımmiktarları.put(eachArr,1);
            }else {

            }
        }
    }
}

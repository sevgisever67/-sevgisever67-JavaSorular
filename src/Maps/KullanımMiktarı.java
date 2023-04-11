package Maps;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class KullanımMiktarı {
    public static void main(String[] args) {
        String[] arr = {"A", "C", "C", "V", "F", "F", "f", "A"};
        Map<String, Integer> kullanımmiktarları = new TreeMap<>();

            for (String each : arr) {
                int resuelt=FindFruciency(each,arr);

                kullanımmiktarları.put(each,resuelt);
            }


        System.out.println(kullanımmiktarları);
    }

    private static int FindFruciency(String Letter, String[] arr) {
        int counter = 0;
        for (String s :arr) {
            if (s.equalsIgnoreCase(Letter)){
                counter++;
            }
        }return counter;
    }
}
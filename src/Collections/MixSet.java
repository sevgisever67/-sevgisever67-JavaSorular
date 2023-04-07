package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MixSet {
    public static void main(String[] args) {
        Set<Object> mixSet=new HashSet<>();
        mixSet.add(12);
        mixSet.add("sevgi");
        mixSet.add(true);
        int[]arr=new int[3];
        mixSet.add(arr);
        List<Object> mixLİst=new ArrayList<>();
        mixLİst.add("havva");
        mixLİst.add(24);
        System.out.println(mixSet);
        System.out.println(mixLİst);

    }
}

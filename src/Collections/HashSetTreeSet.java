package Collections;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTreeSet {
    public static void main(String[] args) {
        Random rnd=new Random();
        Set<Integer> hashSet=new HashSet<>();
        Set<Integer> treeSet=new TreeSet<>();
        int sayi;

        Long hashStart=System.currentTimeMillis();
        for (int i = 0; i <150001 ; i++) {
            sayi=rnd.nextInt(1250000);
            hashSet.add(sayi);
        }
        Long hashFinish=System.currentTimeMillis();
        Long setStart=System.currentTimeMillis();
        for (int i = 0; i <150000 ; i++) {
            sayi= rnd.nextInt(1250000);
            treeSet.add(sayi);
        }

        Long setFnish=System.currentTimeMillis();
        System.out.println("hash işlemsüresi : "+ (hashFinish-hashStart));
        System.out.println("hash işlemsüresi : "+ (setFnish-setStart));

    }
}

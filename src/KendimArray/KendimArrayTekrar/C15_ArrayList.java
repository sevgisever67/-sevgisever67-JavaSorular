package KendimArray.KendimArrayTekrar;

import java.util.ArrayList;
import java.util.List;

public class C15_ArrayList {
    public static void main(String[] args) {
        List<Integer> sayılar=new ArrayList<>();
        sayılar.add(2);
        sayılar.add(3);
        sayılar.add(4);
        sayılar.add(1,9);
        System.out.println(sayılar);
        List<Integer> sayılar2=new ArrayList<>();
        sayılar2.add(5);
        sayılar2.add(8);
        sayılar.addAll(0,sayılar2);
        System.out.println(sayılar);

        System.out.println(sayılar.size());
        System.out.println(sayılar2.isEmpty());
        System.out.println(sayılar2.contains(5));

        System.out.println("00000000000");
        int []arr={1,2,3,4,5,6,5};
        List<Integer>sayılar1=new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            sayılar1.add(arr[i]);

        }

        System.out.println(sayılar1);

        System.out.println(sayılar1.get(4));
        sayılar1.set(0,9);
        System.out.println(sayılar1);

        sayılar1.clear();
        //System.out.println(sayılar1+" ==  ");

    }
}

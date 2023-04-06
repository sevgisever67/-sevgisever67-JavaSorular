package arrayMetod;

import java.sql.Array;
import java.util.Arrays;

public class ArrayMetod {
    public static <ArrayTopla> void main(String[] args) {
        //Soru 1- Verilen bir int array’in tum elemanlarini
        // 2 artirip bize donduren bir method
        //olusturun. Eski array’i yeni haliyle kaydedin.
        int [] arr={5,4,6,3,5};

        int [] yeniarry=ArrArttır(arr);
        System.out.println(Arrays.toString(yeniarry));
        ArayTopla.ArrElmnTopl(arr);

        StringTers obj= new StringTers();
        StringTers obj1=new StringTers();
        System.out.println("*****");



    }

    private static int [] ArrArttır(int [] arr) {
        //int []yeni=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
           arr [i]+=2;
        }
        return arr;
    }
}

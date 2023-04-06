package KendimArray.KendimArrayTekrar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C16_arrayLisSorularıMükerrerOlanıSil {
    public static void main(String[] args) {

        // Soru 1- Verilen bir array’de tekrar eden elementler icin,
        // mukerrer olanlari silip, tum
        // elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.


        int []arr={1,2,2,3,3,4,5,6,5,9,9};
        arr=mükerreriSil(arr);
        System.out.println(Arrays.toString(arr));


    }public static int[] mükerreriSil (int[] arr){

        List<Integer>list=new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            if (!list.contains(arr[i])){
                list.add(arr[i]);
            }

        }int []yeniArr=new int [list.size()];
        for (int i = 0; i <yeniArr.length ; i++) {

            yeniArr[i]=list.get(i);
        }


         return  yeniArr;
    }


}

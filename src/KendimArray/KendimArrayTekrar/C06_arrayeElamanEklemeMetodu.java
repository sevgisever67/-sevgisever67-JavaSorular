package KendimArray.KendimArrayTekrar;

import java.util.Arrays;

public class C06_arrayeElamanEklemeMetodu {
    public static void main(String[] args) {
        //Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
        //eski array’e yeni degeri atayin.

        int []arr={2,4,7,8,9,2};
        ArreyeElemanEkleme(arr,8);
        System.out.println(Arrays.toString(arr));


    }public  static int[] ArreyeElemanEkleme (int [] arr, int eklenecekElmn){
        int [] yeniArr=new int[arr.length+1];
        for (int i=0; i< arr.length; i++){
            yeniArr [i]=arr[i];

        }yeniArr[yeniArr.length-1]=eklenecekElmn;
        return yeniArr;

    }

}

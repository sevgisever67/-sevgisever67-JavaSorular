package passByValue;

import java.util.Arrays;

public class PassByValue1 {
    public static void main(String[] args) {

        int [] arr1={1,2,3,4};
        System.out.println("eleman arttır metodundan önce : "+Arrays.toString(arr1));
        elemanArttir(arr1,5);
        System.out.println("eleman arttir metodundan sonra : "+Arrays.toString(arr1));
        yeniElenaEkle(arr1,2,5,4);
        System.out.println("yeni elemanekle metodundan sonra"+Arrays.toString(arr1));







    }

    public static void elemanArttir(int[] arr1, int artisMiktari) {
        for (int i = 0; i < arr1.length ; i++) {
            arr1[i]+=artisMiktari;
        }
        System.out.println(Arrays.toString(arr1));

        }public  static void yeniElenaEkle(int [] arr1, int eklenecekElemanlar1, int eklenecekEleman2, int eklenecelEleman3){

        int [] yeniArr=new int[3+arr1.length];
        for (int i = 0; i <arr1.length ; i++) {
            yeniArr[i]+=arr1[i];

        }
        yeniArr[yeniArr.length-3]=eklenecekElemanlar1;
        yeniArr[yeniArr.length-2]=eklenecekEleman2;
        yeniArr[yeniArr.length-1]=eklenecelEleman3;
        System.out.println(Arrays.toString(yeniArr));

    }


}

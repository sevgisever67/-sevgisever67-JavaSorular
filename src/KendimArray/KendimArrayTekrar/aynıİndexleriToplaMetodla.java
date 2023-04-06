package KendimArray.KendimArrayTekrar;

import java.util.Arrays;

public class aynıİndexleriToplaMetodla {
    /*
      //  Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni
      //  olusturacagimiz tek katli bir array’e bu toplamlari atayin.
      //  input : int[][] arr = {{3,4,5}, {2,3,6,7}};
      //  output: [5, 7, 11]
     */
    public static void main(String[] args) {
        int[][] arr = {{3,4,5}, {2,3,6,7}};
        int[] yeniArr=arraynıİndexiTopla(arr);
        System.out.println(Arrays.toString(yeniArr));

    }

    public static int[] arraynıİndexiTopla(int[][] arr) {
        int enKısaarr=arr[0].length;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].length<enKısaarr){
                enKısaarr=arr[i].length;
            }
        }
        int[] yeniarr=new int[enKısaarr];
        for (int i = 0; i <enKısaarr ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                yeniarr[i]+=arr[j][i];
            }
        }return yeniarr;
    }
}

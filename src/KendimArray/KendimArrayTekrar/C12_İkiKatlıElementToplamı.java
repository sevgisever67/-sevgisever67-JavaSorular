package KendimArray.KendimArrayTekrar;

import java.util.Arrays;

public class C12_İkiKatlıElementToplamı {
    public static void main(String[] args) {
      // Soru 3- Verilen 2 katli bir array’de her bir ic array’deki elementleri toplayip, yeni
      // olusturacagimiz tek katli bir array’e bu toplamlari atayin.
      // input : int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
      // output: [10, 3, 12, 10, 9]

        int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};


        int []toplamlarArrayi=new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
           // int içToplam=0;
            for (int j = 0; j <arr[i].length ; j++) {
                toplamlarArrayi[i] +=arr[i][j];


            }
           // toplamlarArrayi[i]=içToplam;

        }
        System.out.println(Arrays.toString(toplamlarArrayi));



    }
}

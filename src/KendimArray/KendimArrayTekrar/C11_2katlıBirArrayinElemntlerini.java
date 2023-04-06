package KendimArray.KendimArrayTekrar;

import java.util.Arrays;

public class C11_2katlıBirArrayinElemntlerini {
    public static void main(String[] args) {
      //  Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni
      //  olusturacagimiz tek katli bir array’e bu toplamlari atayin.
      //  input : int[][] arr = {{3,4,5}, {2,3,6,7}};
      //  output: [5, 7, 11]

        int[][] arr = {{3,4,5}, {2,3,6,7}};

        int enKısaArrLength=arr[0].length;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].length<enKısaArrLength){
                enKısaArrLength=arr[i].length;
            }

        }
        int[]toplamlarArrayi=new int[enKısaArrLength];
        int indekElementlerToplamı=0;
        for (int i = 0; i <toplamlarArrayi.length ; i++) {
            for (int j = 0; j < arr.length; j++) {

                indekElementlerToplamı+=arr[j][i];
            }toplamlarArrayi[i]=indekElementlerToplamı;
            indekElementlerToplamı=0;

        }
        System.out.println(Arrays.toString(toplamlarArrayi));

    }
}

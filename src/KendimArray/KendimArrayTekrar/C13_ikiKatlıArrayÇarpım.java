package KendimArray.KendimArrayTekrar;

import java.util.Arrays;

public class C13_ikiKatlıArrayÇarpım {
    public static void main(String[] args) {
        //Soru 4- Verilen 2 katli bir array’de bulunan tum sayilarin carpinini bize donduren bir
        //method olusturun.

        //Çözüm 1:
        // soruyu Metodsuz ve sonucu iki katlı array  istersek:

        int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        int [][] çarpımArr= new int[arr.length][1];
        for (int i = 0; i < arr.length; i++) {
            int içÇarpım=1;
            for (int j = 0; j < arr[i].length; j++) {
                içÇarpım*=arr[i][j];
            }
            çarpımArr[i][0]=içÇarpım;

        }
        System.out.println(Arrays.deepToString(çarpımArr));
        //Çözüm 2:
        //soruyu metodla ve sonucu tek katlı array olarak çözmek istersek istersek
        System.out.println(Arrays.toString(ÇarpımlarArrayi(arr)));
    }

    public static int[] ÇarpımlarArrayi(int[][]  arr){
        //Soru 4- Verilen 2 katli bir array’de bulunan tum sayilarin carpinini bize donduren bir
        //method olusturun.

       int[] ÇarpımlarArrayi=new int[1];
        int içÇarpım=1;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                içÇarpım*=arr[i][j];

            }
            ÇarpımlarArrayi [0]=içÇarpım;

        }return ÇarpımlarArrayi;



    }
}

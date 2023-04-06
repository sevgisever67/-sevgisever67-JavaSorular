package KendimArray.KendimArrayTekrar;

public class C10_MDAÇiftSayılarıTopla {
    public static void main(String[] args) {
        // Soru 1- Verilen 2 katli bir array’de bulunan cift sayilari toplayip, sonucu yazdiran bir
        // method olusturun.
        int[][] arr = {{3, 1, 2}, {1, 2}, {3, 4, 5}, {10}};
        çiftSayıularıTopla(arr);

    }

    public static void çiftSayıularıTopla(int[][] arr) {
        int çiftSayıToplamı = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    çiftSayıToplamı += arr[i][j];
                }
            }

        }System.out.print(çiftSayıToplamı);
    }
}
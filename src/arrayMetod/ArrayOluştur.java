package arrayMetod;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOluştur {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan array’in
        // boyutunu ve elementlerini alip array’i olusturan ve bize
        //donduren bir method olusturun.
       // Scanner scan =new Scanner(System.in);

        Scanner scan=new Scanner(System.in);
        System.out.println("arayin uzunluğunu giriniz");
        int arrUzun=scan.nextInt();

      int [] array= ArrOluştur(arrUzun);
      System.out.println(Arrays.toString(array));

    }
    private static int[] ArrOluştur(int arrUzun) {

        Scanner scan=new Scanner(System.in);
        // System.out.println("arayin uzunluğunu giriniz");
        //  arrUzun=scan.nextInt();
        int []arr=new int[arrUzun];

        for (int i = 0; i <arrUzun ; i++) {
            System.out.println("Arr nin" + (i+1) + " . elementi giriniz");
            arr[i]=scan.nextInt();



        }
        return arr;
    }
}

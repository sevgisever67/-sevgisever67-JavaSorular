package studymyself.studyMyself;

import java.util.Scanner;

public class C05_FizzBuzzİnterviewSorusu {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir sayı giriniz");
        int sayi= scan.nextInt();

        for (int i =1; i<=sayi; i++){
            if (i%15==0){
                System.out.print(" fizzBuzz ");
            } else if (i%5==0){
                System.out.print(" buzz ");
            }else if (i%3==0){
                System.out.print(" fizz ");
            }else {
                System.out.print(i + " ");
            }
        }

    }
}

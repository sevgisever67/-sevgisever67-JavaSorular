package studymyself.studyMyself;

import java.util.Scanner;

public class KC03_ikiBasamaklıSayıyıYazıİleYazmak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki basamaklı sayı giriniz");
        int sayi = scan.nextInt();
        int birlerBasamağı = sayi % 10;
        int onlar = sayi / 10;

        if (sayi >= 10 && sayi <= 99) {

            switch (onlar) {
                case 1:
                    System.out.print("on");
                    break;
                case 2:
                    System.out.print("yirmi");
                    break;
                case 3:
                    System.out.print("otuz");
                    break;
                case 4:
                    System.out.print("kırk");
                    break;
                case 5:
                    System.out.print("elli");
                    break;
                case 6:
                    System.out.print("altmış");
                    break;
                case 7:
                    System.out.print("yetmiş");
                    break;
                case 8:
                    System.out.print("seksen");
                    break;
                case 9:
                    System.out.print("doksan");}
                    switch (birlerBasamağı) {

                        case 0:
                            System.out.print("");
                            break;
                        case 1:
                            System.out.print("bir");
                            break;
                        case 2:
                            System.out.print("iki");
                            break;
                        case 3:
                            System.out.print("dört");
                            break;
                        case 5:
                            System.out.print("beş");
                            break;
                        case 6:
                            System.out.print("altı");
                            break;
                        case 7:
                            System.out.print("yedi");
                            break;
                        case 8:
                            System.out.print("sekiz");
                            break;
                        case 9:
                            System.out.print("dokuz");
                        default:
                            System.out.println("yanlış sayı girişi");}
            }
        }

    }


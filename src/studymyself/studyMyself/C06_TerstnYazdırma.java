package studymyself.studyMyself;

import java.util.Scanner;

public class C06_TerstnYazdırma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
     /*   System.out.println("Lütfen adınızı giriniz");
       String isim= scan.nextLine();
       String tersYazım="";


      for (int i =isim.length()-1; i>=0; i--){
          tersYazım+=isim.charAt(i);

       }System.out.print(tersYazım);*/

      int sayı=5;
        int flag=0;
      for (int i =2; i<sayı; i++){

          if (sayı%i==0) {
              flag++;
          }
      }if (flag>0){
            System.out.println("sayı asal değil");
        }else {
            System.out.println("sayı asal");
        }


    }

}

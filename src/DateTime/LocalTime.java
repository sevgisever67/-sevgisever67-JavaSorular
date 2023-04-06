package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class LocalTime {
    public static void main(String[] args) {

        java.time.LocalTime saat1= java.time.LocalTime.now();
        System.out.println(saat1); //  14:15

        System.out.println(saat1.toNanoOfDay());
        System.out.println(saat1.getHour());
        saat1.plusMinutes(10);
        System.out.println(saat1.minusMinutes(1).withMinute(10));
        System.out.println(saat1.withMinute(0).withNano(0));
        System.out.println(saat1.isAfter(saat1));

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen isminizi girin");
        String isim=scan.nextLine();
        System.out.println("ikici kişinin adını girin");
        String isim2=scan.nextLine();
        System.out.println("ilk kişinin doğum tarihini  gün ay yıl olarak giriniz" );
        int gün=scan.nextInt();
        int ay=scan.nextInt();
        int yıl=scan.nextInt();
        System.out.println("ikinci kişinin doğum tarihini gün ay yıl olarak giriniz" );
        int gün2=scan.nextInt();
        int ay2=scan.nextInt();
        int yıl2=scan.nextInt();

        LocalDate tarih1=LocalDate.of(yıl,ay,gün);
        LocalDate tarih2=LocalDate.of(yıl2,ay2,gün2);
        System.out.println(tarih2.isBefore(tarih1));



    }
}

package KendimArray.KendimArrayTekrar;

public class C09_EnUzunKısaEleman {
    public static void main(String[] args) {

        // Soru 6- Verilen String bir array’deki
        // en uzun ve en kisa kelimeleri yazdiran bir method
        //olusturun.


        String[] str = {"Ayse", "elif", "eda"};
        EnUzunEnkısa(str);


    }

    public static void EnUzunEnkısa(String[] arr) {
        String enUzunKelime = arr[0];
        String enKısaKelime = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > enUzunKelime.length()) {
                enUzunKelime = arr[i];
            }
            if (enKısaKelime.length() > arr[i].length())
                enKısaKelime = arr[i];
        }
        System.out.println("En Uzun Kelime : " + enUzunKelime +
                "\n En Kısa Kelime : " + enKısaKelime);


    }
}

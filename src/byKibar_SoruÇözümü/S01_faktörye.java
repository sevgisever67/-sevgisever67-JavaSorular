package byKibar_SoruÇözümü;

public class S01_faktörye {
    public static void main(String[] args) {
        //20 den küçük bir sayının faktöryel değerini hesapla

        int sayı=3;
        int çarpım=1;

        for (int i=1; i<=sayı; i++){
            çarpım*=i;
            System.out.print(i);
        }
        System.out.println(çarpım);


    }
}

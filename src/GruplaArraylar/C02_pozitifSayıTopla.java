package GruplaArraylar;

public class C02_pozitifSayıTopla {
    public static void main(String[] args) {
        //Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
        //method yaziniz

        int []arr={2,8,4,5,-9,-6};
        System.out.println(pozitifTopla(arr));


    }public static int pozitifTopla (int [] arr){
        int toplam=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>0){
                toplam+=arr[i];
            }

        }
        return toplam;
    }



}

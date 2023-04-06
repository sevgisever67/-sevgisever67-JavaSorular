package GruplaArraylar;

public class C04_ElemanAra {
    public static void main(String[] args) {

        //Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
        //kullanildigini yazdiran bir method olusturun

        int []arr={1,2,3,4,5,2,2};
        ElemanVarMi(arr, 0);

    }public  static  void ElemanVarMi(int []arr, int arananEleman){
        int sayaç=0;
        for (int i = 0; i < arr.length ; i++) {

            if (arr[i]==arananEleman){
                sayaç++;

            }


        } if (sayaç>0){
            System.out.println("aranan eleman : "+ sayaç+ " kez kullanılmış");
        }else {
            System.out.println("aradığınız eleman kullanılmamış");
        }


    }


}

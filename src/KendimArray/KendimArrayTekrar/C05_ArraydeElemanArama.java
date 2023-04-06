package KendimArray.KendimArrayTekrar;

public class C05_ArraydeElemanArama {
    public static void main(String[] args) {
        //Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
        // kullanildigini yazdiran bir method olusturun.

        int []arr={1,2,3,4,5,6,5};

        ElemanArama(arr,5);


    }



    public static void ElemanArama ( int[] arr, int arananEleman){
        int sayaç=0;
        for (int i=0; i<arr.length; i++){

            if (arr[i]==arananEleman){
                sayaç++;
            }

        }if (sayaç>0){
            System.out.println("Aradığınız eleman "+ sayaç+ " kez kullanılmış");
        }else {
            System.out.println("Aradığınız eleman kullanılmamıştır");
        }

    }
}

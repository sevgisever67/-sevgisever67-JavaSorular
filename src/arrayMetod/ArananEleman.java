package arrayMetod;

public class ArananEleman {
    public static void main(String[] args) {

    //Soru 4- Verilen bir array’de
    //istenen bir elemanin var olup olmadigini ve varsa kac kere
    //kullanildigini yazdiran bir method olusturun.
    int []arr={2,7,8,7,2,2,3};
    TekarEden(arr,2);

}

    public static void TekarEden(int[] arr, int istenenEleman) {
    int sayaç=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==istenenEleman){
                sayaç++;
            }
            
        }
        System.out.println(istenenEleman + " "+ sayaç +" kez yazılmıştır." );
    }
}

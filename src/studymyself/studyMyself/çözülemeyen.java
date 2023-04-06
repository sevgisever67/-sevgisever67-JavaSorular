package studymyself.studyMyself;

public class çözülemeyen {
    public static void main(String[] args) {
        //Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
       // method yaziniz

        int[] arr1={1,2,-3,4,5, -8};
        //arr1=pozitifSayılarıtopla(arr1[]);


    }public static int pozitifSayılarıtopla(int [] arr, int toplam){

        for (int i=0; i< arr.length; i++){

            if (arr[i]>0){
                toplam +=arr[i];
            }

        }return toplam;






    }

    //  for (int i= arr.length-1;i>0; i--){
    //      arr[i]=arr[i-1];


    //  }
    //  arr[0]=temp;
    //  System.out.println(Arrays.toString(arr));
 //   arr=SağaKaydır(arr);
   //     System.out.println(Arrays.toString(arr));


}

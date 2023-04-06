package KendimArray.KendimArrayTekrar;

public class C09_MDA {
    public static void main(String[] args) {

        //Ornegin 2 katli asagidaki array’in tum elementlerini yazdirmak istedigimizde, ic ice 2
        //loop kullanmaliyiz

        int[][] arr={{3,1,2},{1,2},{3,4,5},{10}};

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
        }

    }
}

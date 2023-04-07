package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class mükerreriSil { /*
        Soru:
        Verilen bir arraydeki tekrar eden elementleri sadece 1 kere yazdıracak array'i kısaltan bir kod yazınız
        Hint: SET Kullanınız.
        int [] arr={1,2,1,3,4,5,1,2,6,2,3,4,5,1,3,2,6,5,7}
         */
    public static void main(String[] args) {
        int [] arr={1,2,1,3,9,5,1,2,6,2,3,4,5,1,3,2,6,5,7};
        Set<Integer> benzersizEleman=new HashSet<>();
        for (int eachArr:arr
             ) {
            benzersizEleman.add(eachArr);
        }
        System.out.println(benzersizEleman);//[1, 2, 3, 4, 5, 6, 7, 9]
        int[]yeniArr=new int[benzersizEleman.size()];
        int index=0;
        for (int eachBenzersiz:benzersizEleman
             ) {
            yeniArr[index]=eachBenzersiz;
            index++;
        }
        System.out.println(Arrays.toString(yeniArr));//[1, 2, 3, 4, 5, 6, 7, 9]

        }
    }


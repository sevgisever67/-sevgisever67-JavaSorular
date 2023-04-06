package KendimArray.KendimArrayTekrar;

import java.util.Arrays;

public class C07_ArreylerinEşitliği {
    public static void main(String[] args) {

        int []arr1={1,2,3,4,5,6,5};
        int []arr2={1,2,5,4,5,6,3};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1,arr2));
    }
}

package KendimArray.KendimArrayTekrar;

import java.util.Arrays;

public class C08_StringiArreyeÇevirmek {
    public static void main(String[] args) {
        //  str.split( StringAyirac ); bir
        //  String’i istedigimiz parcalara ayirarak bir array’e cevirir.
        String str="Ali Topu at Ali";
        String[]arrvirgül=str.split(",");
        System.out.println(Arrays.toString(arrvirgül));
    }
}

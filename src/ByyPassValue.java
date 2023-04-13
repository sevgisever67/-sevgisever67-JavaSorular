public class ByyPassValue {
    public static void main(String[] args) {
        String str="gül";
       // str=(degistir(str));
        System.out.println(degistir(str));
        System.out.println(str);
    }

    private static String degistir(String str1) {
        str1=str1.replace("ü","a");
        return str1;
    }
}

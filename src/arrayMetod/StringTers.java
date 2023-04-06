package arrayMetod;

public class StringTers {
     String  strİsim="abc";
    public static void main(String[] args) {
        String str="Ahmet Eren uyudu";
        System.out.println(TersineÇevir(str));
        String s=TersineÇevir(str);
        System.out.println(s + "bursa");
    }

    private static String TersineÇevir(String str) {
        String tersMetin="";
        for (int i = str.length()-1; i >=0 ; i--) {
            tersMetin+=str.charAt(i);
        }return tersMetin;
    }
}

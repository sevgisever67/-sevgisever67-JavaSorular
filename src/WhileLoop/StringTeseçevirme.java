package WhileLoop;

public class StringTeseçevirme {
    public static void main(String[] args) {
        // While loop kullanarak verilen bir String’i terse   cevirip, bu halini bize
        //donduren  bir  method ol usturun .
        String str="Java beni çok yordun  gerçekten  ";
        String s=(Tersmetin(str));
        System.out.println(s);


    }

    private static String Tersmetin(String str) {
        String tersMetin="";
        int mUzunluk=str.length()-1;
        while (mUzunluk>=0){
            tersMetin+=str.charAt(mUzunluk);
            mUzunluk--;
        }
        return tersMetin;
    }
}

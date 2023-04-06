package kendim_Constructor;

public class C05_DoktorRunner {
    public static void main(String[] args) {

        C04_Doktor  doktor1=new C04_Doktor();
        doktor1.yas=25;
        System.out.println(doktor1.tazminatHesapla(12,8000));
        System.out.println(doktor1.yas);

        C04_Doktor doktor2=new C04_Doktor();


    }


}

package kendim_Constructor;

public class C04_Doktor  {

    C04_Doktor (){
        System.out.println("parametresiz constructor çalıştı");

    }

    String isim;
    String soyisim;
    String telNo;
    int yas;
    boolean izindeM;
    char evliMi;
    int ekMesaiÜcreti=20;
    int tazminat;


    public int mesaiÜcretiHesapla (int mesaiSaati){
        return mesaiSaati*ekMesaiÜcreti;

    }
    public int tazminatHesapla (int çalıştığıYıl, int aylıkMaaş){

        return çalıştığıYıl*aylıkMaaş;
    }


}

package kendim_Constructor;

public class C07_ArabaRunner {
    public static void main(String[] args) {

        C06_Araba araba1=new C06_Araba("Honda",false,2022,5000,"jazz");
        System.out.println(araba1);
        C06_Araba araba2=new C06_Araba("toyota",false,2025,300,"korolla");

        System.out.println(araba2);

        C06_Araba araba3=new C06_Araba("Fiat",false,2023,500,"linea");
        System.out.println(araba3);

    }
}

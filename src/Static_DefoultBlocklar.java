import studymyself.studyMyself.C02_DataCasting;

public class Static_DefoultBlocklar {
    public static void main(String[] args) {
        Static_DefoultBlocklar obj1=new Static_DefoultBlocklar();
        System.out.println("main metod çalıştı");

    }
    static {
        System.out.println("static blok çalıştı");
    }
    {
        System.out.println("defoult block çalıştı");
    }
}

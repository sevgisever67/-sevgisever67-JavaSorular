import studymyself.studyMyself.C01_RakamlarToplamınestedWhile;
import studymyself.studyMyself.C02_DataCasting;

import java.util.Arrays;

public class Static_DefoultBlocklar {
    public static void main(String[] args) {
      //  C01_RakamlarToplamınestedWhile obj1=new C01_RakamlarToplamınestedWhile();
        System.out.println("main metod çalıştı");

    }
    static {
        System.out.println("static blok çalıştı");
    }
    {
        System.out.println("defoult block çalıştı");
    }
}

package studymyself.studyMyself;

public class nestetForLoop {
    public static void main(String[] args) {
       /* Soru – Asagidaki sekilleri yazdirin

                *             * * * * * * * *          * * * * * * * *
                * *           * * * * * * * *          * * * * * *
                * * *         * * * * * * * *          * * * *
                * * * *       * * * * * * * *          * *
        */

        int satırsayısı=4;
        int sütünSayısı=8;

        for (int i = 1; i <=satırsayısı; i++) {
            for (int j = 1; j<=i ; j++) {
                System.out.print("* ");

            }
            System.out.println("");

        }
        System.out.println("======================================");

        for (int i = 1; i <=satırsayısı ; i++) {
            for (int j = 1; j <=sütünSayısı ; j++) {
                System.out.print("* ");
            }
            System.out.println("");

        }

        System.out.println("======================================");

        int satırSayısı=4;
        int sütunSayısı=8;


        for (int i = 1; i <=satırsayısı; i++) {
            for (int j = 1; j <=sütunSayısı ; j++) {
                System.out.print("* ");

            }sütunSayısı-=2;
            System.out.println("");


        }


            }

}

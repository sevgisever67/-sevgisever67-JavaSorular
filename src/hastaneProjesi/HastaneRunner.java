package hastaneProjesi;

public class HastaneRunner {
        private static Hastane hastane=new Hastane();

        public static void main(String[] args) {
                String hastaDurumu;
                String unvan=doktorunvan("aktüelDurum");
                System.out.println("adınız ve soyadınız? ");

        }
        public static String doktorunvan (String aktuelDurum){
                if (aktuelDurum.equalsIgnoreCase("septom1")){
                   return "Bölüm1";
                }
                if (aktuelDurum.equalsIgnoreCase("septom2")){
                        return "Bölüm2";

                }
                if (aktuelDurum.equalsIgnoreCase("septom3")){
                        return "Bölüm3";

                }
                if (aktuelDurum.equalsIgnoreCase("septom4")){
                        return "Bölüm4";

                }
                if (aktuelDurum.equalsIgnoreCase("septom5")){
                        return "Bölüm5";

                }else {
                        return  "yanlış unvan";
                }
        }
        public static  Doktor doktorBul(String unvan){
                Doktor doktor=new Doktor();


                return doktor;
        }
        public  static Durum hastaDurumuBul(String aktüelDurum){
                Durum hastaDurumu=new Durum();
                switch (aktüelDurum){
                        case "septom1", "septom2", "septom3", "septom4": hastaDurumu.setAciliyet(false);break;
                        case  "septom5", "septom6":hastaDurumu.setAciliyet(true);break;
                        default:System.out.println("Geçerli durum değil");

                }
                return hastaDurumu;
        }
        public static Hastane hastaBul(String actualCase){
                Hastane hasta =new Hastane();
                for (String durum:hasta.durumlar) {

                }
                return hasta;
        }

}

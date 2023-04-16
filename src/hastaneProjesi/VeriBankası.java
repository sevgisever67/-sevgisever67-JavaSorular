package hastaneProjesi;

import java.util.ArrayList;
import java.util.List;

public class VeriBankası {
    String [] doctorİsimleri={"Anthony","Sanjay", "Mehmet", "Jane", "Jill", "Jesicca" };
    String [] doctorSoyisimler={"Facuci", "Gupta", "Oz", "Goodall", "Biden", "Tristen"};
    String [] unvanlar={"Immunology", "Neurosurgery", "Cardiothoracic", "Ortopedics", "Alergyst", "Cardiology"};
    String [] hastaisimleri={"Warren","Petanow", "Sophia","Emma", "Darian", "Peter"};
    String [] hastaSoyisimleri={"Traven", "William", "Gearge", "Tristan","Luis","Cole"};
    String []durumlar={"Allerji","Covid-19","Brian tumors", "Primate infectious","Migren", "Heart diseases"};
    int[] hastaIDleri={111,222,333,444,555,666};
    public  List<Doktor> doktorListesiOluştur()
        {
            List<Doktor>doktorlar=new ArrayList<>();
            for (int i = 0; i < doctorSoyisimler.length ; i++) {
                Doktor doktor=new Doktor(doctorİsimleri[i],doctorSoyisimler[i],unvanlar[i]);
                doktorlar.add(doktor);

            }return doktorlar;
    }
    public  List<Hasta> hastaListesiOluştur(){
        List<Hasta>hastalar=new ArrayList<>();
        for (int i = 0; i < hastaisimleri.length ; i++) {
            Hasta hasta=new Hasta(hastaisimleri[i],hastaSoyisimleri[i],hastaisimleri[i]);
            hastalar.add(hasta);
        }

    }
}

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        Sirket sirket = new Sirket();
        sirket.sirketId= 1234;
        sirket.sirketName="SigortamNet";

        Bayi bayi = new Bayi();
        bayi.bayiAdi="Yılmazlar";
        bayi.bayiAdress="istanbul";
        bayi.bayiId=2828;
        Bayi bayi2 = new Bayi();
        bayi2.bayiAdi="Yıldızlar";
        bayi2.bayiAdress="istanbul";
        bayi2.bayiId=2829;


        Calisan calisan = new Calisan();
        calisan.calisanId=1234;
        calisan.calisanName="Ali";
        calisan.calisanAge=25;
        Calisan calisan2 = new Calisan();
        calisan2.calisanId=1235;
        calisan2.calisanName="Can";
        calisan2.calisanAge=28;

        List<Bayi>bayiList= new ArrayList<Bayi>();
        bayiList.add(bayi);
        bayiList.add(bayi2);

        List<Calisan>calisanList= new ArrayList<Calisan>();
        calisanList.add(calisan);
        calisanList.add(calisan2);


        System.out.println(sirket.sirketName);
        System.out.println(bayiList.get(1).bayiAdi);
        System.out.println(bayi.bayiAdi);
        System.out.println(calisanList.get(0).calisanName);

    }
}

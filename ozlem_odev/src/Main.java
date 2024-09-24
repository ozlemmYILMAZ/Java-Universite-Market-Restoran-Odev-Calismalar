import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci();
        ogrenci.ogrenciName ="Özlem";
        ogrenci.ogrenciSurname ="Yılmaz";
        ogrenci.ogrenciId = 123;


        Ogrenci ogrenci2 = new Ogrenci();
        ogrenci2.ogrenciName="Ayşe";
        ogrenci2.ogrenciSurname="Yıldız";
        ogrenci2.ogrenciId = 456;

        Ogretmen ogretmen = new Ogretmen();
        ogretmen.ogretmenName ="Hümeyra";
        ogretmen.ogretmenSurname="Akdeniz";
        ogretmen.ogretmenId = 789;
        ogretmen.verdigiDers="Türkçe";

        List<Ogrenci>ogrenciler=new ArrayList<>();
        ogrenciler.add(ogrenci);
        ogrenciler.add(ogrenci2);


        Sinif sinif = new Sinif();
        sinif.sinifName="7/B";
        sinif.sinifId= 12345;
        sinif.ogretmen=ogretmen;
        sinif.ogrenciler=ogrenciler;

        Okul okul = new Okul();
        okul.okulId=123;
        okul.okulName="ORTA OKUL";

        sinif.ogrenciler=ogrenciler;
        System.out.println(ogrenci.ogrenciName);
        System.out.println(ogrenci.ogrenciSurname);
        System.out.println(sinif.ogrenciler.get(1).ogrenciName);


    }
}
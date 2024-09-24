import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args){
        Market market = new Market();
        market.marketId=123;
        market.marketName="Bim";
        market.marketAddress="İstanbul" ;
        market.marketNumber= 2140141;

        Market market2 = new Market();
        market2.marketId=456;
        market2.marketName="Şok";
        market2.marketAddress="Kocaeli";
        market2.marketNumber= 111111;

        Kategory bakliyat = new Kategory();
        bakliyat.kategoryName = "Bakliyat";

        Kategory içecek = new Kategory();
        içecek.kategoryName="İçecek";

        Kategory temizlik = new Kategory();
        temizlik.kategoryName="Temizlik";

        List<Kategory>kategoriler=new ArrayList<Kategory>();
        kategoriler.add(bakliyat);
        kategoriler.add(içecek);
        kategoriler.add(temizlik);

        System.out.println(market2.marketName);
        System.out.println(market.marketName);
        System.out.println(market2.marketId);
        System.out.println(market2.marketAddress);
        System.out.println(kategoriler.get(1).kategoryName);;





    }
}

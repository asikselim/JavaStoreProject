import java.util.ArrayList;
import java.util.Scanner;

public class Sepet {
    Scanner sc = new Scanner(System.in);
    ArrayList<SepetUrun> sepettekiler;
    double toplamtutar;
    public Sepet(){
        sepettekiler=new ArrayList<SepetUrun>();
        toplamtutar=0;
    }
    public void SepeteEkle(SepetUrun urun){
    toplamtutar+=urun.toplam;

    sepettekiler.add(urun);
    System.out.println(urun.isim+" Adli urun sepete eklendi.");
    }
    public void SepetGoruntule(){
        for (Urun urun:sepettekiler){
        System.out.println(urun.toString());
        }
        System.out.println("Toplam Urun Adeti: "+sepettekiler.size());
    }
    public void SepetSil(){
        System.out.println("Siparisiniz onaylandi. Kargoya verildi. Sepet Bosaltildi.\nOdediginiz Tutar: "+toplamtutar);
        toplamtutar=0;
        sepettekiler.clear();
    }
    public void UrunCikar(int no){
    for(SepetUrun u:sepettekiler){
        if (u.no==no){
            sepettekiler.remove(u);
            toplamtutar-=u.toplam;
            System.out.println("Urun sepetten cikarildi.");
            return;
        }
    }
    System.out.println("Urun bulunamadi.");
    }
}

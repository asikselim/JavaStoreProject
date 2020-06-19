import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MagazaUrun u= new MagazaUrun(1,"Laptop",2399.99);
        MagazaUrun u2 = new MagazaUrun(2,"Dizüstü",1500);
        MagazaUrun u3= new MagazaUrun(3,"Klavye",150.50);
        MagazaUrun u4=new MagazaUrun(4,"İphone",10000);
        MagazaUrun u5=new MagazaUrun(5,"Macbook",15000);
        MagazaUrun u6=new MagazaUrun(6,"ipad",5600);
        MagazaUrun u7=new MagazaUrun(7,"Zenbook",6500);
        MagazaUrun u9=new MagazaUrun(8,"XPS13",14950);

        Magaza m = new Magaza();
        m.UrunEkle(u);
        m.UrunEkle(u2);
        m.UrunEkle(u3);
        ArrayList<Kullanici> kullanicilar = new ArrayList<Kullanici>();
        kullanicilar.add(new Kullanici(1,"Selim","Aşık","İstanbul"));
        kullanicilar.add(new Kullanici(2,"Aleyna","Yıldırım","İzmir"));
        kullanicilar.add(new Kullanici(3,"Emre","Tekindemir","Ankara"));
        kullanicilar.add(new Kullanici(4,"Ömer","Aşık","Bursa"));
        kullanicilar.add(new Kullanici(5,"Sibel","Aşık","Konya"));



        Sepet sepet = new Sepet();
        System.out.println("Selim AŞIK Store'a Hosgeldiniz!");
        while(true){
            int secim;
            for (Kullanici k:kullanicilar){
                System.out.println(k.toString());
            }
            System.out.println("Kullanici seciniz:");
            secim=sc.nextInt();
            Kullanici aktif =null;
            for (Kullanici k:kullanicilar){
                if (secim==k.getNo()){
                    aktif=k;break;
                }
            }
            System.out.println("Hosgeldiniz "+aktif.getAd());
        while(true){
            System.out.println("1-Urunleri Listele\n2-Urun Sepete Ekle\n3-Urun Cikar\n4-Alisverisi Bitir\n5-Sepeti Goruntule\nSecim:");
            secim=sc.nextInt();
            int secim2;
            if (secim==1){
                m.Urunlistele();
            }
            else if(secim==2){
                System.out.println("Sepete eklemek istediginiz urun numarasini giriniz:");
                secim2=sc.nextInt();
                MagazaUrun murun = m.urunBul(secim2);
                System.out.println("Kac adet almak istiyorsunuz?>");
                int adet=sc.nextInt();
                if (murun!=null){
                    sepet.SepeteEkle(new SepetUrun(murun,adet));
                }
                else{
                    System.out.println("Bu numaraya ait urun bulunamadi");
                }
            }
            else if(secim==3){
                sepet.SepetGoruntule();
                System.out.println("Silmek istediginiz urun numarasini giriniz:");
                secim2=sc.nextInt();
                sepet.UrunCikar(secim2);
            }
            else if(secim==4){
                sepet.SepetSil();
                break;
            }
            else if(secim==5){
                sepet.SepetGoruntule();
            }
            else{
                System.out.println("Yanlis secim.");
            }
        }
        }
    }
}

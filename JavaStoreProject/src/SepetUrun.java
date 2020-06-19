public class SepetUrun extends Urun {
    int miktar;
    double toplam;
    public SepetUrun(int no,String isim,double fiyat, int miktar){
        this.isim=isim;
        this.fiyat=fiyat;
        this.miktar=miktar;
        this.toplam=miktar*fiyat;
        this.no=no;
    }
    public SepetUrun(MagazaUrun urun,int miktar){
        this.no=urun.no;
        this.isim=urun.isim;
        this.fiyat=urun.fiyat;
        this.miktar=miktar;
        this.toplam=miktar*urun.fiyat;
    }
    public String toString(){
        return no+"- Urun Adi: "+isim+" Fiyat: "+fiyat+ "TL Adet: "+miktar+" Toplam Tutar: "+toplam+"TL";
    }
}

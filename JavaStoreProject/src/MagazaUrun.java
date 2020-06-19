public class MagazaUrun extends Urun {
    public MagazaUrun(int no,String isim,double fiyat){
        this.isim=isim;
        this.no=no;
        this.fiyat=fiyat;
    }
    @Override
    public String toString(){
        return no+"- Urun Adi: "+isim+" Fiyati :"+fiyat+"TL";
    }
}

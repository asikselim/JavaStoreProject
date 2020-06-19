import java.util.ArrayList;

public class Magaza {
    ArrayList<MagazaUrun> Urunler = new ArrayList<MagazaUrun>();
    public void Urunlistele(){
        for(MagazaUrun mu:Urunler){
            System.out.println(mu.toString());
        }
    }
    public void UrunEkle(MagazaUrun u){
        this.Urunler.add(u);
    }
    public MagazaUrun urunBul(int no){
        for (MagazaUrun u:Urunler){
            if (u.no==no){
                return u;
            }
        }
        return null;
    }
}

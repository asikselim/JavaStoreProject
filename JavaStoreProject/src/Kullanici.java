public class Kullanici {
    private String ad;
    private String soyad;
    private String adres;
    private int no;
    public Kullanici(int no,String ad, String soyad, String adres) {
        this.no=no;
        this.ad = ad;
        this.soyad = soyad;
        this.adres = adres;
    }
    public String toString(){
        return no+"-"+ad+" "+soyad+" "+adres;
    }
    public int getNo(){
        return no;
    }
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}

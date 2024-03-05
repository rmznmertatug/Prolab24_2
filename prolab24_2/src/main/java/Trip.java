
public class Trip {
    String vh;
    Route rh;
    int tarih;
    int fiyat;

    public Trip(String vh, Route rh, int tarih) {
        this.vh = vh;
        this.rh = rh;
        this.tarih = tarih;
      
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }
    
    
}

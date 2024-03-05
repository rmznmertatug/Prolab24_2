import java.util.*;

public class Reservation {

    int koltuk;
    int[] dolu;
    Passenger[] p;

    public Reservation(int koltuk) {
        this.koltuk = koltuk;
        dolu = new int[koltuk];
        p = new Passenger[koltuk];
    }
    
    public void RandomDoldur(Route rr){
        Random r = new Random();
        for (int i = 0; i < koltuk; i++) {
            dolu[i] = r.nextInt(2);
        }
        for (int i = 0; i < koltuk; i++) {
            if(dolu[i]==1){
            p[i]= new Passenger(rr.sehirler.get(r.nextInt(rr.sehirler.size())),rr.sehirler.get(r.nextInt(rr.sehirler.size())),"A",Integer.toString(i),273828378);   
            }
            
        }
    }
    
}

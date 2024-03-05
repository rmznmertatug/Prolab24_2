
import java.util.*;


public abstract class Vehicle {
    String id;
    int koltuk;
    String fuel;
    int tr;
    Trip trip;
    ArrayList <Personel> personel ;      
    Reservation r;

    public Vehicle(String id, int koltuk, String fuel, int tr) {
        this.id = id;
        this.koltuk = koltuk;
        this.fuel = fuel;
        this.tr = tr;
       
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
        r = new Reservation(koltuk);
        r.RandomDoldur(trip.rh);
    }
    
    public int CalculateFuelCost(String a,String b,String ykt){
        
        int inc=0;
        if(("İstanbul".equals(a) && "Kocaeli".equals(b))||("Kocaeli".equals(a) && "İstanbul".equals(b))){
            inc = inc+100;
        }
        if(("İstanbul".equals(a) && "Ankara".equals(b))||("Ankara".equals(a) && "İstanbul".equals(b))){
            inc = inc+500;
        }
        if(("İstanbul".equals(a) && "Konya".equals(b))||("Konya".equals(a) && "İstanbul".equals(b))){
            inc = inc+600;
        }
        if(("İstanbul".equals(a) && "Eskişehir".equals(b))||("Eskişehir".equals(a) && "İstanbul".equals(b))){
            inc = inc+300;
        }
        if(("Ankara".equals(a) && "Kocaeli".equals(b))||("Kocaeli".equals(a) && "Ankara".equals(b))){
            inc = inc+400;
        }
        if(("Eskişehir".equals(a) && "Kocaeli".equals(b))||("Kocaeli".equals(a) && "Eskişehir".equals(b))){
            inc = inc+200;
        }
        if(("Konya".equals(a) && "Kocaeli".equals(b))||("Kocaeli".equals(a) && "Konya".equals(b))){
            inc = inc+500;
        }
        if(("Konya".equals(a) && "Eskişehir".equals(b))||("Eskişehir".equals(a) && "Konya".equals(b))){
            inc = inc+300;
        }
        
        
        return inc*0;
    }
    
    public int Income (String a,String b){
        int inc=0;
        if(("İstanbul".equals(a) && "Kocaeli".equals(b))||("Kocaeli".equals(a) && "İstanbul".equals(b))){
            inc = inc+50;
        }
        if(("İstanbul".equals(a) && "Ankara".equals(b))||("Ankara".equals(a) && "İstanbul".equals(b))){
            inc = inc+300;
        }
        if(("İstanbul".equals(a) && "Konya".equals(b))||("Konya".equals(a) && "İstanbul".equals(b))){
            inc = inc+300;
        }
        if(("İstanbul".equals(a) && "Eskişehir".equals(b))||("Eskişehir".equals(a) && "İstanbul".equals(b))){
            inc = inc+150;
        }
        if(("Ankara".equals(a) && "Kocaeli".equals(b))||("Kocaeli".equals(a) && "Ankara".equals(b))){
            inc = inc+400;
        }
        if(("Eskişehir".equals(a) && "Kocaeli".equals(b))||("Kocaeli".equals(a) && "Eskişehir".equals(b))){
            inc = inc+100;
        }
        if(("Konya".equals(a) && "Kocaeli".equals(b))||("Kocaeli".equals(a) && "Konya".equals(b))){
            inc = inc+250;
        }
        if(("Konya".equals(a) && "Eskişehir".equals(b))||("Eskişehir".equals(a) && "Konya".equals(b))){
            inc = inc+150;
        }
        return inc*0;
    }
    

   
    
    
}

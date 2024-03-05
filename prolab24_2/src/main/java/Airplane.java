
public class Airplane extends Vehicle {

    public Airplane(String id, int koltuk, String fuel, int tr) {
        super(id, koltuk, fuel, tr);
    }

    @Override
    public void setTrip(Trip trip) {
        super.setTrip(trip); 
    }

    @Override
    public int Income(String a, String b) {
        int inc=0;
        if(("İstanbul".equals(a) && "Ankara".equals(b))||("Ankara".equals(a) && "İstanbul".equals(b))){
            inc = inc+1000;
        }
        if(("İstanbul".equals(a) && "Konya".equals(b))||("Konya".equals(a) && "İstanbul".equals(b))){
            inc = inc+1200;
        }
        return inc;
    }

    @Override
    public int CalculateFuelCost(String a, String b, String ykt) {
      int inc=0;
        if(("İstanbul".equals(a) && "Ankara".equals(b))||("Ankara".equals(a) && "İstanbul".equals(b))){
            inc = inc+250;
        }
        if(("İstanbul".equals(a) && "Konya".equals(b))||("Konya".equals(a) && "İstanbul".equals(b))){
            inc = inc+300;
        }
        return inc*20; 
    }
    
}


public class Bus extends Vehicle {

   
    public Bus(String id, int koltuk, String fuel, int tr) {
        super(id, koltuk, fuel, tr);
    }

    @Override
    public void setTrip(Trip trip) {
        super.setTrip(trip); 
    }

  
    public int CalculateFuelCost(String a, String b,String ykt) {
        int km=0;
        if(("İstanbul".equals(a) && "Kocaeli".equals(b))||("Kocaeli".equals(a) && "İstanbul".equals(b))){
            km = km+100;
        }
        if(("İstanbul".equals(a) && "Ankara".equals(b))||("Ankara".equals(a) && "İstanbul".equals(b))){
            km = km+500;
        }
        if(("İstanbul".equals(a) && "Konya".equals(b))||("Konya".equals(a) && "İstanbul".equals(b))){
            km = km+600;
        }
        if(("İstanbul".equals(a) && "Eskişehir".equals(b))||("Eskişehir".equals(a) && "İstanbul".equals(b))){
            km = km+300;
        }
        if(("Ankara".equals(a) && "Kocaeli".equals(b))||("Kocaeli".equals(a) && "Ankara".equals(b))){
            km = km+400;
        }
        if(("Eskişehir".equals(a) && "Kocaeli".equals(b))||("Kocaeli".equals(a) && "Eskişehir".equals(b))){
            km = km+200;
        }
        if(("Konya".equals(a) && "Kocaeli".equals(b))||("Kocaeli".equals(a) && "Konya".equals(b))){
            km = km+500;
        }
        if(("Konya".equals(a) && "Eskişehir".equals(b))||("Eskişehir".equals(a) && "Konya".equals(b))){
            km = km+300;
        }
        
        if(ykt.equals("benzin")){
            return km*10;
        }
        else if(ykt.equals("motorin")){
            return km*5;
        }
        else{
            return km*0;
        }
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
        return inc;
    }
    
    

    
}


public class Train extends Vehicle {

    public Train(String id, int koltuk, String fuel, int tr) {
        super(id, koltuk, fuel, tr);
    }

    @Override
    public void setTrip(Trip trip) {
        super.setTrip(trip); 
    }

    @Override
    public int Income(String a, String b) {
        int inc=0;
        if(("İstanbul".equals(a) && "Kocaeli".equals(b))||("Kocaeli".equals(a) && "İstanbul".equals(b))){
            inc = inc+50;
        }
        if(("İstanbul".equals(a) && "Ankara".equals(b))||("Ankara".equals(a) && "İstanbul".equals(b))){
            inc = inc+250;
        }
        if(("İstanbul".equals(a) && "Konya".equals(b))||("Konya".equals(a) && "İstanbul".equals(b))){
            inc = inc+300;
        }
        if(("İstanbul".equals(a) && "Eskişehir".equals(b))||("Eskişehir".equals(a) && "İstanbul".equals(b))){
            inc = inc+200;
        }
        if(("İstanbul".equals(a) && "Bilecik".equals(b))||("Bilecik".equals(a) && "İstanbul".equals(b))){
            inc = inc+150;
        }
        if(("Kocaeli".equals(a) && "Bilecik".equals(b))||("Bilecik".equals(a) && "Kocaeli".equals(b))){
            inc = inc+50;
        }
        if(("Ankara".equals(a) && "Kocaeli".equals(b))||("Kocaeli".equals(a) && "Ankara".equals(b))){
            inc = inc+200;
        }
        if(("Eskişehir".equals(a) && "Kocaeli".equals(b))||("Kocaeli".equals(a) && "Eskişehir".equals(b))){
            inc = inc+100;
        }
        if(("Konya".equals(a) && "Kocaeli".equals(b))||("Kocaeli".equals(a) && "Konya".equals(b))){
            inc = inc+250;
        }
        if(("Ankara".equals(a) && "Bilecik".equals(b))||("Bilecik".equals(a) && "Ankara".equals(b))){
            inc = inc+150;
        }
        if(("Eskişehir".equals(a) && "Bilecik".equals(b))||("Bilecik".equals(a) && "Eskişehir".equals(b))){
            inc = inc+50;
        }
        if(("Konya".equals(a) && "Bilecik".equals(b))||("Bilecik".equals(a) && "Konya".equals(b))){
            inc = inc+200;
        }
        if(("Ankara".equals(a) && "Eskişehir".equals(b))||("Eskişehir".equals(a) && "Ankara".equals(b))){
            inc = inc+100;
        }
        if(("Konya".equals(a) && "Eskişehir".equals(b))||("Eskişehir".equals(a) && "Konya".equals(b))){
            inc = inc+150;
        }
        
        
        return inc;
    }

    @Override
    public int CalculateFuelCost(String a, String b, String ykt) {
        int inc=0;
        if(("İstanbul".equals(a) && "Kocaeli".equals(b))||("Kocaeli".equals(a) && "İstanbul".equals(b))){
            inc = inc+75;
        }
        if(("İstanbul".equals(a) && "Ankara".equals(b))||("Ankara".equals(a) && "İstanbul".equals(b))){
            inc = inc+375;
        }
        if(("İstanbul".equals(a) && "Konya".equals(b))||("Konya".equals(a) && "İstanbul".equals(b))){
            inc = inc+450;
        }
        if(("İstanbul".equals(a) && "Eskişehir".equals(b))||("Eskişehir".equals(a) && "İstanbul".equals(b))){
            inc = inc+300;
        }
        if(("İstanbul".equals(a) && "Bilecik".equals(b))||("Bilecik".equals(a) && "İstanbul".equals(b))){
            inc = inc+225;
        }
        if(("Kocaeli".equals(a) && "Bilecik".equals(b))||("Bilecik".equals(a) && "Kocaeli".equals(b))){
            inc = inc+75;
        }
        if(("Ankara".equals(a) && "Kocaeli".equals(b))||("Kocaeli".equals(a) && "Ankara".equals(b))){
            inc = inc+300;
        }
        if(("Eskişehir".equals(a) && "Kocaeli".equals(b))||("Kocaeli".equals(a) && "Eskişehir".equals(b))){
            inc = inc+150;
        }
        if(("Konya".equals(a) && "Kocaeli".equals(b))||("Kocaeli".equals(a) && "Konya".equals(b))){
            inc = inc+350;
        }
        if(("Ankara".equals(a) && "Bilecik".equals(b))||("Bilecik".equals(a) && "Ankara".equals(b))){
            inc = inc+225;
        }
        if(("Eskişehir".equals(a) && "Bilecik".equals(b))||("Bilecik".equals(a) && "Eskişehir".equals(b))){
            inc = inc+75;
        }
        if(("Konya".equals(a) && "Bilecik".equals(b))||("Bilecik".equals(a) && "Konya".equals(b))){
            inc = inc+300;
        }
        if(("Ankara".equals(a) && "Eskişehir".equals(b))||("Eskişehir".equals(a) && "Ankara".equals(b))){
            inc = inc+150;
        }
        if(("Konya".equals(a) && "Eskişehir".equals(b))||("Eskişehir".equals(a) && "Konya".equals(b))){
            inc = inc+225;
        }
        
        
        return inc*3;
    }
    
}

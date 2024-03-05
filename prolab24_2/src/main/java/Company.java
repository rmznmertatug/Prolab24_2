import java.util.*;

public class Company extends User implements IProfitable,ILoginable {
    
    ArrayList <Vehicle> araclar;
    public Company(String username, String password) {
        super(username, password);
        this.araclar = new ArrayList<>();
    }

    @Override
    public boolean LogInCheck(String un, String pw) {
        return (un.equals(username) && pw.equals(password));
    }
    
    
    
    public void AracEkle(Vehicle v){
        araclar.add(v);
    }
    public void AracKaldır (int i){
        araclar.remove(i);
    }

    @Override
    public int Kar(int hizmet) {
        int kar=0;
        for (int i = 0; i < araclar.size()-1; i++) {
            for (int j = 0; j < araclar.get(i).trip.rh.sehirler.size()-1; j++) {
                kar = kar - araclar.get(i).CalculateFuelCost(araclar.get(i).trip.rh.sehirler.get(j), araclar.get(i).trip.rh.sehirler.get(j+1), araclar.get(i).fuel);
            }
            
            
            
        }
        for (int i = 0; i < araclar.size() ; i++) {
            for (int j = 0; j < araclar.get(i).r.p.length; j++) {
                 if(araclar.get(i).r.p[i]!=null)
                kar = kar + araclar.get(i).Income(araclar.get(i).r.p[i].a, araclar.get(i).r.p[i].b);
            }
        }
       
        kar = kar - (hizmet*7);
        kar = kar - 14000*7;
        return kar;
    }

    
    

    
    
    

    
    
}

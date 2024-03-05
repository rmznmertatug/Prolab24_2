
public class Admin extends User implements ILoginable{
    
    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    public boolean LogInCheck(String un,String pw) {
        return (un.equals(username) && pw.equals(password));
    }
    
}

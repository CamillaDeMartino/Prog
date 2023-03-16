import java.util.ArrayList;
import java.util.List;
public class DBUsers {

    List<Users> user = new ArrayList<Users>();

    public DBUsers(){
        this.generateUserList();
    }
    public void generateUserList(){

        Users u1 = new Users("camilla", "camilla@gmail.com", "jrxik2" );
        Users u2 = new Users("assunta", "assunta@gmail.com", "jrxik2" );

        this.user.add(u1);
        this.user.add(u2);

    }
    public List<Users> getUtentiList()
    {
        return this.user;
    }

    public boolean checkUsername(String username){
        DBUsers db = new DBUsers();
        for(Users u : db.getUtentiList()){
            if(username.equals(u.getUsernameDB()))
                return true;
        }
        return false;
    }

    public boolean checkPassword(String password){
        DBUsers db = new DBUsers();
        for(Users u : db.getUtentiList()){
            if(password.equals(u.getPasswordDB()))
                return true;
        }
        return false;
    }

    public boolean checkEmail(String email){
        DBUsers db = new DBUsers();
        for(Users u : db.getUtentiList()){
            if(email.equals(u.getEmailDB()))
                return true;
        }
        return false;
    }

}

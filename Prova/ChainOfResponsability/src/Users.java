public class Users {
    private String username;
    private String email;
    private String password;

    public Users(){}

    public Users(String username, String email, String password)
    {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsernameDB()
    {
        return username;
    }

    public String getEmailDB()
    {
        return email;
    }

    public String getPasswordDB()
    {
        return password;
    }
}

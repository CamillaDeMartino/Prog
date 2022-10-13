public class Greeter {
    private String name;
    private String surname;

    public Greeter(String var1, String var2) {
        this.name = var1;
        this.surname = var2;
    }

    public String sayHello() {
        String var1 = "Hello, " + this.name + " " + this.surname + "!";
        return var1;
    }
}

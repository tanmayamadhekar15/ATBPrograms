package may18_encapsulationPoly.encapsulation.ex;

public class login {
    public static void main(String[] args) {
        vwoLogin v1 = new vwoLogin("admin", "admin123");
        System.out.println("Public var so direct access : " +v1.username);
        //System.out.println(v1.password); - private password
        //v1.setPassword("abc123"); //overwrite
        System.out.println("Encapsulation be like private variable and gettersetter methods ");
        System.out.println("Variable access through gettersetter : " +v1.getPassword()); //private var access through gettersetter methods
    }

}
class vwoLogin {
    public String username;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    public vwoLogin(String username, String password) {
        this.password = password;
        this.username = username;
    }

}
/*
Public var so direct access : admin
Encapsulation be like private variable and gettersetter methods
Variable access through gettersetter : admin123
 */

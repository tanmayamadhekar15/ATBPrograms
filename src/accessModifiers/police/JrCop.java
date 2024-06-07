package accessModifiers.police;

public class JrCop {

    public static void main(String[] args) {
        Cop cop = new Cop(10); //class from other package is imported
        System.out.println(cop.gun);
        int a= cop.a;
        cop.canIShoot();    //method protected so can be accessed
    }
}

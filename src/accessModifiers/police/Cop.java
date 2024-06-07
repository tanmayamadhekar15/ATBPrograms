package accessModifiers.police;

public class Cop {

    public int gun; // public access by anyone
    int a;  //default


    //private allows access within class
    private String idCard; // Private - only available to the cop class

    //public allows to access everyone (within/outside package)
    public Cop(int gun){
        this.gun = gun; // PC
    }

    // protected allows to access within folder/package
    protected void canIShoot(){
        System.out.println("Of-course, Shoot!");
    }

}

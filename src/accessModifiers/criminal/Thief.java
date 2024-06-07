package accessModifiers.criminal;

import accessModifiers.police.Cop;    // class is imported from other package to use

public class Thief {
    public static void main(String[] args) {
        Cop cop = new Cop(10); //class from other package is imported
        System.out.println(cop.gun);
        //cop.canIShoot();   ->method private so cant be accessed
    }
}

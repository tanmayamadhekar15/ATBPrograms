package may18_encapsulationPoly.polymorphism.overloading;

public class realEx {
    public static void main(String[] args) {
        BaseClass t1 = new Test1();  //dynamic dispatch / run time polymorphism
        t1.setBrowser("edge",true);
        t1.openBrowser();
        t1.closeBrowser();
    }
}
class Test1 extends BaseClass{  //single inheritance
    @Override
    public void setBrowser(String browser, boolean isAuth) {  //method overriding (super class)
//      super.setBrowser(browser, isAuth);  // refers to superclass
        System.out.println("I am done");
    }
}

class BaseClass {  // super class
    private String browser;  //instance variable

    public String getBrowser() {  //getter method
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) {  //setter method - encapsulation
        if (isAuth) {
            this.browser = browser;   //refers to instance class
        }else{
            System.out.println("Not Allowed");
        }
    }

    void openBrowser() {  //same method with no param no returntype
        System.out.println("Chrome Browser!!");
    }

    void openBrowser(String browserName) { //same method with 1 param no returntype i.e method overloading
        System.out.println("Open Browser!! -> " + browserName);
    }

    void closeBrowser() {  //normal method with no param no returntype
        System.out.println("Open Browser!!");
    }
}

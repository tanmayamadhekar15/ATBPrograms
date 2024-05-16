package may16_inheritance.multilevel.example;

public class Main {
    public static void main(String[] args) {
        //commonToall is base class, Basetest is derived class, test is derived from basetest class
      Test t1 = new Test();
        t1.openExcelFile();
        t1.openSQLConnection();
       int a = t1.API_VERSION;


        //dynamic dispatch-To access parent using object created
        //parentclass obj=new childclass - Allows to access method/var of parent class without creating parent object
        CommonToAll c = new Test();
        c.openExcelFile();
        c.openJSON();

    }
    }

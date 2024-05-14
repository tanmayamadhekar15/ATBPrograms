package may11_objClass;

public class AutomationSample {
    String name;

    AutomationSample(){
        dataBaseConnection();
        excelOpen();
    }

    public AutomationSample(String name) {
        this.name = name;
    }

    void dataBaseConnection(){
        System.out.println("Mysql Connection is created!");
    }

    void excelOpen(){
        System.out.println("Excel opened");
    }

    void testCase1(){
        System.out.println("testCase1" + this.name);

    }
    void testCase2(){
        System.out.println("testCase2" + this.name);
    }

    public static void main(String[] args) {
        AutomationSample tc1 = new AutomationSample("TC1");
        AutomationSample tc2 = new AutomationSample("TC2");
        System.out.println(tc1.name);
        tc1.testCase1();
        tc1.testCase2();

        System.out.println(tc2.name);
        tc2.testCase1();
        tc2.testCase2();

    }
}

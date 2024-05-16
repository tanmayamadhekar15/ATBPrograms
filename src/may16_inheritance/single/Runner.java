package may16_inheritance.single;

public class Runner {
    public static void main(String[] args) {
        Programming p = new Programming(12,"KO posan");
        Java j = new Java("lambda exp");

        p.printInfo();
        j.printInfo();

        Programming p1 = new Programming(12,"Van Russom");
        p1.printInfo();

        Python python = new Python();
        python.bhk3();
        python.printInfo();

    }
}

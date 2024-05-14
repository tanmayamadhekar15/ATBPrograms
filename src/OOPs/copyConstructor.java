package OOPs;

public class copyConstructor {
    //Copy constructor is used to copy object of another object
    String name;
    int age;

    // Parameterized constructor
    copyConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    copyConstructor(copyConstructor cp) {
        this.name = cp.name;
        this.age = cp.age;
    }

    public static void main(String[] args) {
        copyConstructor cp1 = new copyConstructor("John", 30);
        copyConstructor cp2 = new copyConstructor(cp1);
        copyConstructor cp3 = new copyConstructor(cp1);
        copyConstructor cp4 = new copyConstructor(cp1);
        System.out.println(cp2.name + " is " + cp2.age + " years old");
        System.out.println(cp3.name);
        System.out.println(cp4.age);

    }
}
/*
John is 30 years old
John
30
 */
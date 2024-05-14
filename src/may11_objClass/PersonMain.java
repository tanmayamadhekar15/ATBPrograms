package may11_objClass;

public class PersonMain {
    public static void main(String[] args) {
        Person p=new Person();
        System.out.println("Name is :"+(p.name="Jack") + " "+"whose age is :" +(p.age=21));
        p.walk();
        p.talk("Hello");
        p.eat("Mango Mastani");
        p.sleep();
    }
}
/*
Name is :Jack whose age is :21
I can walk
I will say ->Hello
 */
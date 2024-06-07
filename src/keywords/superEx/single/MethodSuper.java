package keywords.superEx.single;

public class MethodSuper {
    public static void main(String[] args) {
        Student s=new Student();
        s.message(); //class student message()  - Message is from derived student class
        s.display();  //Method overloaded - child class
                    // Message is from base person class
                    //Message is from derived student class
        s.message("Method overloaded : parent class");  //Method overloaded - parent class
    }
}

//base class
class Person{
    void message(){
        System.out.println("Message is from base person class");
    }

    void message(String msg){
        System.out.println(msg);
    }
}

class Student extends Person{  //single inheritance
    void message(){
        System.out.println("Message is from derived student class");
    }
    void display(){
        super.message("Method overloaded - child class");  //method overloading
        super.message();  //super - message() refers to parent message() - Message is from base person class

        this.message();  //this - message() refers to child message() - Message is from derived student class
    }
}

/*
Message is from derived student class
Method overloaded - child class
Message is from base person class
Message is from derived student class
Method overloaded : parent class
 */
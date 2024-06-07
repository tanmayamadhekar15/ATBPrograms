package constructorChaining;

public class methodChaining {
    public static void main(String[] args) {
    A a=new A();
    a.message("2","arguments");
    }
}

class A{
    String n,m;
    /*void display(){
        System.out.println("Method chaining");
    }

    void print(){
        display();  //method chaining
        System.out.println("One method is called in another method is called method chaining");
    }*/

    //Method overloading chaining
    void message(){
    }

    void message(String name){
        this.n=name;
        this.message();//method chaining
        System.out.println("Method overloading chaining :" +name);
    }

    void message(String sname,String msg){
        this.m=msg;
        this.message("One argument");  //method chaining
        System.out.println("Method overloading chaining :" +sname+ " "+msg);
    }
}

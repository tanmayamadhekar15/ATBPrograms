package may28_collectionFramework;

public class GenericClass {
    public static void main(String[] args) {
        GT<Integer> gi=new GT<Integer>(2);
        System.out.println(gi.getObject());  //2

        GT<String> gs=new GT<String>("A");
        System.out.println(gs.object); //A
    }
}

class GTest{  //normal class
    int var; // instance variable

    public int getVar() {  //getter method
        return var;
    }

    public void setVar(int var) {  //setter method
        this.var = var;
    }

    public GTest(int var) {  //constructor
        this.var = var;
    }
}

class GT<T>{
    T object;
    GT(T object){//constructor
        this.object=object;
    }
    public T getObject() {
        return object;
    }
}
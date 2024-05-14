package OOPs.constructor;

public class ParameterizedConstructor {
    String n;
    ParameterizedConstructor(String name){
        n=name;
    }

    void print(){
        System.out.println("Passing parameters in Constructor : "+n);
    }

    public static void main(String[] args) {
        ParameterizedConstructor pc=new ParameterizedConstructor("Jackie");
        pc.print();
    }
}


/*
Passing parameters in Constructor : Jackie
 */

package OOPs.constructor;

public class EmployeeMain {
    public static void main(String[] args) {

        //Constructor is invoked automatically at time of object creation
        Employee e=new Employee(01,"Stew");
        e.print();

        Employee e1=new Employee(03,"Maira");
        e1.print();

        Employee e2=new Employee(10,"Sara");
        e2.print();

        Employee e3=new Employee(20,"Tarun");
        e3.print();

    }
}

/*
Stew has employee code as : 1
Maira has employee code as : 3
Sara has employee code as : 10
Tarun has employee code as : 20
 */

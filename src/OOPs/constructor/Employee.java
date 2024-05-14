package OOPs.constructor;

public class Employee {

    String empName;
    byte age;
    int empCode;

    void print(){
        System.out.println(empName+ " has employee code as : " + empCode);
    }

    //using method
    void set(int eCode, String eName){
        empCode=eCode;
        empName=eName;
    }

    /* Constructor -> Same name as className
    Only Assigning values to variables
    Gets invoked at time of object creation
    No return value,
    No logic writing( no loops, no statements)
    When we create an object of the class using the new() keyword,
    at least one constructor is called, and it initializes the objects and allocates memory to them.
    */

    Employee(){   //default constructor
    }

    //using constructor , variables are assigned
    Employee(int eCode, String eName){  //parameterized constructor
        empCode=eCode;
        empName=eName;
    }
}

package keywords.staticEx;

public class StaticMethod {
    // Static loads when Class is loaded. It can be variable, method, class - can be accessed directly using className
    public static void main(String[] args) {

        ATB a=new ATB(897667763);
        ATB b=new ATB(788639200);  // whenever object creation is done, IIB block gets executed
        //static block gets executed only once when class is loaded for the first time but IIB executes at every object creation
        /*
        SIB -static initialization block -  Load one Time,when Class IS LOADED
        IIB - instance initialization block. Loaded when Object is created
        IIB - instance initialization block. Loaded when Object is created
        */

        ATB c=null;  //class gets loaded only static executes at once
        // only static executes when class gets loaded
        /*
        SIB -static initialization block -  Load one Time,when Class IS LOADED
         */
        a.printDetails();
        b.printDetails();
        System.out.println(ATB.courseName);   //ClassName.variable  -ATB
    }
}

class ATB {

    static {
        System.out.println("SIB -static initialization block -  Load one Time,when Class IS LOADED");
    }

    {
        System.out.println("IIB - instance initialization block. Loaded when Object is created");
    }
    static String courseName = "ATB"; // Static Variable
    int phoneNo; // Non static , Instance Variable

    public ATB(int phoneNo) {
        this.phoneNo = phoneNo;
    }
    public void printDetails(){
        System.out.println("Phone Details -> " +  this.phoneNo);
    }
}

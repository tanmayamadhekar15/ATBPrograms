package OOPs.UsingMethodAssignVariable;

public class Course {
    // instance variables
    String course;
    String name;
    int payment;

    void printDetails(){

        System.out.println(name + " has enrolled for " + course + " course");
    }

    //Using method
    void setDetails(String testingCourse,String sname,int fees){  //local variable with function
        course=testingCourse;
        name=sname;
        payment=fees;
    }
}

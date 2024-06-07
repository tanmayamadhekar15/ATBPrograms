package may28_collectionFramework.ArrayList.Example;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class MainUsingArrayList {
    public static void main(String[] args) {
        ArrayList<Employee> a=new ArrayList();
        //Type 1 : Object creation and adding
        Employee e=new Employee(1,"John");
        a.add(e);
        //Type 2 :add to list
        a.add(new Employee(2,"Mark"));
        a.add(new Employee(3,"Tan"));

        // rApproach 1: Read
        for(Employee emp:a){
            System.out.println(emp.getEmpName());
        }
        //Approach 2
        System.out.println("Using iterator");
        Iterator i=a.iterator();
        while(i.hasNext()){
            Employee employee=(Employee) i.next(); //Casting from Object to Employee as .next returns Object
            System.out.println(employee.getEmpName());
        }
        System.out.println("Using ListIterator");
        //Approach 3
        ListIterator li=a.listIterator();
        while(li.hasNext()){
            Employee employee1=(Employee) li.next(); //Casting from object to Employee type as .previous returns Object
            System.out.println(employee1.getEmpCode());
        }
        /*
        while(li.previous()){
            Employee employee1=(Employee) li.previous(); // previous is not working
            System.out.println(employee1.getEmpCode());
        }
         */


    }
}

package may28_collectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {
        //Declaration for heterogeneous data
        Collection clist=new ArrayList();  //root interface   - dynamic dispatch
        List mylist=new ArrayList();   //subroot interface   - runtime poly
        ArrayList al=new ArrayList();  // class  - child object creation

        //Declaration for homogeneous data using wrapper class,not primitive datatype
        ArrayList<String> a=new ArrayList<String>();  //non primitive datatype
        ArrayList<Integer> ai=new ArrayList<Integer>();  //wrapper class
        ArrayList<Double> ad=new ArrayList<Double>();
        ArrayList<Byte> ab=new ArrayList<Byte>();
        ArrayList<Short> as=new ArrayList<Short>();
        ArrayList<Boolean> abo=new ArrayList<Boolean>();
        ArrayList<Float> af=new ArrayList<Float>();

        //Adding data into arrayList -  duplicate, null
        al.add(100);  //  add() - adds at end of list
        al.add(true);   // add(index, element) -  adds element in middle of list i.e insertion
        al.add("Welcome");
        al.add(null);
        al.add(true);

        //size of arraylist
        System.out.println("Size of ArrayList : "+al.size());  //Size of ArrayList : 5
        al.add(2,100);  //insertion in middle of list using index

        //Printing
        System.out.println("Size of ArrayList after adding: "+al.size());  //6
        System.out.println("ArrayList : " +al); //ArrayList : [100, true, Welcome, null, true] - Indexing(Sequential insertion)

        //Remove element from list
        al.remove(true);  // object element
        al.remove(1);  //index
        System.out.println("ArrayList after removing element :" +al); //ArrayList after removing element :[100, Welcome, null, true]

        //Insert element in the middle of list
        al.add(1,"Manual");
        System.out.println("Arraylist after insertion :" +al); //Arraylist after insertion :[100, Manual, Welcome, null, true]

        //Modify/change element in the list
        al.set(1,"Automation");
        System.out.println("ArrayList after modifying : "+al); //ArrayList after modifying : [100, Automation, Welcome, null, true]

        //Retrieve specific element from list
        System.out.println(al.get(3));  //null
        System.out.println(al.getFirst());  //100
        System.out.println(al.getLast());  //true

        //reading elements from list
        //Approach 1 -  for loop
        System.out.println("--------Reading Using traditional for loop ------");
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));

        }
        System.out.println("--------Reading using For each loop-----------");
        //Approach 2- for each loop
        for(Object item:al){
            System.out.println(item);
        }

        //Approach 3 : Iterator used for reading elements from Collection
        // String s="Welcome";   // Here length is method of String class that returns int type
        // int length=s.length();
        Iterator it=al.iterator();
        //al.iterator is a method in arraylist class that returns Iterator type of variable
        System.out.println("-----Reading Using iterator :-------- ");
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}

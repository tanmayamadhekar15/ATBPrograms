package may28_collectionFramework.may30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayL2 {
    public static void main(String[] args) {
            List ttacourseList = new ArrayList();
            ttacourseList.add("Manual");
            ttacourseList.add("Automation");
            ttacourseList.add("Python");
            ttacourseList.add("SDET");
            ttacourseList.add("Java");
            ttacourseList.add(123);
            ttacourseList.add(true);
            ttacourseList.add(3.14f);

        //Approach 1
        System.out.println("\n Traverse from left to right using iterator");
        Iterator i=ttacourseList.iterator();
        while(i.hasNext()) {
            //ttacourseList.add("SQL");  //throws ConcurrentModificationException on addition so not allowed
            System.out.print(i.next() + " , ");
        }
        ttacourseList.add("SQL");
        System.out.println("\n" + ttacourseList);// [Manual, Automation, Python, SDET, Java, 123, true, 3.14, SQL]

        //Approach 2
       System.out.println("\n Traverse from left to right using for ");
        for(int i1=0;i1<ttacourseList.size();i1++){
            System.out.print(ttacourseList.get(i1) + " , " );
        }

        //Approach 3
        System.out.println("\n Traverse from left to right using enhanced for ");
        for(Object o:ttacourseList){
            System.out.print(o + " , ");
        }

        //Approach 4
        System.out.println("\n Traverse from right to left using listiterator");
        ListIterator lt2 = ttacourseList.listIterator(ttacourseList.size());
        while(lt2.hasPrevious()){
                System.out.print(lt2.previous() + " , ");
        }
  }
}



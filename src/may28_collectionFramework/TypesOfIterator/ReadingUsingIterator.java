package may28_collectionFramework.TypesOfIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReadingUsingIterator {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList();
        mylist.add("Testing");
        mylist.add("Manual");
        mylist.add("Automation");

        System.out.println(" - To Print Arraylist using for each loop- 1 ");
        for (String str : mylist) {
            System.out.println(str);
        }

        System.out.println(" - To Print Arraylist Using for loop - 2 ");
        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }

        System.out.println(" - To Print Arraylist using Iterator- 3 ");
        // Iterator is used to read elements from Collection
        Iterator<String> itr = mylist.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
/*
  - To Print Arraylist using for each loop- 1
Testing
Manual
Automation
 - To Print Arraylist Using for loop - 2
Testing
Manual
Automation
 - To Print Arraylist using Iterator- 3
Testing
Manual
Automation
 */
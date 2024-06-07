package may28_collectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        /*Queue is a interface which is implmented by class PriorityQueue
           Duplicates allowed
           No null allowed
            supports Iterator()
            homogeneous data
         */

        Queue q=new PriorityQueue();
        q.add("C");
        q.add("A");
        q.add("D");
        q.add("B");
        q.add("B");  //Duplicates allowed
        // q.add(null);  //Null pointer exception
        q.add("null");  //accepted as a string
        //q.add(1);   classCastException
        q.offer("E");
        q.offer("w");
        System.out.println(q); //[A, B, D, C, B, null, E, w]
        q.poll();   //removes first element
        System.out.println(q);  // [B, B, D, C, w, null, E]

        q.peek();  //retrieves but doesn't remove element
        System.out.println(q);  //[B, B, D, C, w, null, E]


    }
}

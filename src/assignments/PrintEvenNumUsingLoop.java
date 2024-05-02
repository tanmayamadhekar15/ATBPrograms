package assignments;

public class PrintEvenNumUsingLoop {
    public static void main(String[] args) {

        //Using while loop to find even numbers till 20
        int i=0; //initialization
        while ( i <= 20)  // condition
        {
            System.out.println(i);  // 0,2,4,6,8,10,12,14,16,18,20
            i+=2;  // increment
        }

        /*using while and if - to find even numbers till 10
        Here if condition filters data , where while repeats multiple times
        i.e Conditional can be used to sort date in loop statements
         */
        int i1=0;
        while(i1<=10){
            if(i1%2==0){
                System.out.println(i1);  // 0,2,4,6,8,10
            }
            i1+=2;
        }
    }
}

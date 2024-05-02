package assignments;

public class EvenOddUsingLoopConditional {
    public static void main(String[] args) {
        int i=0;
        while(i<=5) {
            if (i % 2 == 0) {
                System.out.println(i + " "+ "-Even");
            }
            else {
                System.out.println(i + " "+"-Odd");
            }
            i++;
        }
    }
}

/* Output :
0 -Even
1 -Odd
2 -Even
3 -Odd
4 -Even
5 -Odd

 */

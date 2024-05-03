package apr27_loops;

public class Ex87 {
    public static void main(String[] args) {
            // do while - initilaization, executes body, condition, increment/decrement
            //atleast statement executes once then condition is checked

            int i=0;
            do{
                System.out.println(i);   //0,-1,-2
                i--;
            }while(i>-3);

            // condition is checked last
            int a=1;
            do{
                System.out.println(10); // Executes first then condition is checked if false terminates
                a++;
            }while(a<1);

            //Condition is checked first
            while(a<1){
                System.out.println(10);
                i++;
            }

    }
}

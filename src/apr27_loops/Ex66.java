package apr27_loops;

public class Ex66 {
    public static void main(String[] args) {
        final boolean b=true;
        for(float f=1; b;){
            System.out.println("Prints infinite times as it is true");// need to stop manually or by using exit code
            System.exit(130);  //To stop infinite

            for( ; ;){
                //valid code -  infinite loop - kill it manually
            }

        }
    }
}

package may16_inheritance;

public class paramsToPassMain {
    public static void main(String[] args) {
        //String[] args - pass arguments to main method using command line or
        //Go to  -> Run (three dots beside)-> Edit -> Set program arguments by using comma(,) -> Apply -> Run

        System.out.println("Length of params passed : " +args.length);
        for(String mainParams:args) {
            System.out.print(mainParams);
        }
    }
}
/*
Length of params passed : 4
Welcometomainparams123456
 */

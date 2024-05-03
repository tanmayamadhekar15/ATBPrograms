package apr27_loops;

public class Ex70 {
    public static void main(String[] args) {
        //continue - It condition is true then go to loop and increment
        for(int i=1;i<=10;i++){
            if(i%2==0){
                System.out.println(i +" is an Even");
                continue;
            }
            System.out.println(i +" is a Odd");
        }
    }
}
/*
1 is a Odd
2 is an Even
3 is a Odd
4 is an Even
5 is a Odd
6 is an Even
7 is a Odd
8 is an Even
9 is a Odd
10 is an Even
 */

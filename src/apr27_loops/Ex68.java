package apr27_loops;

public class Ex68 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            if(i==3) {
                break; // 0,1,2
            }
            System.out.println(i);
        }

        //same
        for (int i=1;i<=5;i++){
            System.out.println(i); // 1,2,3,4,5
        }
    }
}

package apr27_loops;

public class Ex63 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            System.out.println(i); //1,2,3,4
            if (i == 4) {
                break;
            }
        }
        System.out.println("End"); //1,2,3,4,end
    }
}

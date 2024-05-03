package apr27_loops;

public class Ex84 {
    public static void main(String[] args) {
        for(int i=1; i<7;i=i*2){
            System.out.println(i);  //1,2,4
        }

        System.out.println("Even numbers by changing increment value");
        for(int i=0; i<10;i=i+2){
            System.out.println(i);  //0, 2, 4, 6, 8
        }

        System.out.println("Odd numbers by changing increment value");
        for(int i=1; i<10;i=i+2){
            System.out.println(i);  //1,3,5,7,9
        }
    }
}

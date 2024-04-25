package apr25;

public class Ex61 {
    public static void main(String[] args) {
        System.out.println((10 - 4) + 3 * 4); // 6 + 12 = 18
        System.out.println(200 / 50 + (3 * 4)); // 4 + 12 = 16


        //yield is returning something
        char code = 'A';
        int val = switch (code){
            case 'A':
                yield 65;
            case 'B':
                yield 66;
            default:
                System.out.println("Not able to find");
                throw  new IllegalStateException("Error");
        };
        char op='+';
        int result =switch(op){
            case '+' : int a=10,b=30 ;
                result=a+b;
                System.out.println(result);
                yield 1;
            default:
                throw new IllegalStateException("Unexpected operator: " + op);
        };
    }
}

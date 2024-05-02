package may02_array;

public class Ex79 {
    public static void main(String[] args) {
        System.out.println(args[0]); // throws array out of bound exception

        String[] s= new String[2]; //  default value is 0, only when used with new operator and unassigned
        System.out.println(s[1]); // 0
        s[1]="Academy";
        System.out.println(s[1]); // Academy - Assigned value to index
    }
}

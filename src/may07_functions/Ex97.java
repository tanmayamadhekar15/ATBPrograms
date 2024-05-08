package may07_functions;

public class Ex97 {
    public static void main(String[] args) {
        print(); // no param , no return

        String n=name();// no param, but return
        System.out.println(n);

        paramaters(" -type"); // param but no return

        String str=name_str("everyone"); // param and return
        System.out.println(str);
    }
    // Functions - block of code that does some task
    // 1. No parameters , no return
    static void print(){
        System.out.println("Function with No params, no return ");
    }
    // 2. No parameters, returns - eg. int len = s.length();
    static String name(){
        return "Function with return, but no params";
    }
    // 3. Take Parameters, no return
    static void paramaters(String param){
        System.out.println("Function with params but no return" +param);
    }
    // 4. Take parameters, returns
    static String name_str(String name1){
        return "Hello "+name1;
    }
}
/*
Function with No params, no return
Function with return, but no params
Function with params but no return -type
Hello everyone
 */

package may07_functions;

import java.util.Arrays;

public class Ex96 {
    public static void main(String[] args) {
        // built in String methods
        String s= "Welcome";
        String s1= " welcome ";
        String s2="Welcome to Testing course";

         //length - returns number of characters
        System.out.println(s.length()); // 7
        System.out.println("testing".length()); // 7

        //concat - joins strings +, concat
        System.out.println(s.concat(s1)); //Welcome welcome
        System.out.println(s+s1); // Welcome welcome
        System.out.println(s.concat(s2).concat(s2));
        System.out.println(s.concat(s1+s2));

        //toUppercase, tolowercase
        System.out.println(s.toLowerCase()); // welcome
        System.out.println(s1.toUpperCase()); // WELCOME

        //trim -remove spaces from left and right
        System.out.println(s1.trim()); //welcome

        //equals -compares strings
        System.out.println(s.equals(s1)); //false
        System.out.println(s==s1);  //false

        //replace - replace single /multiple characters
        System.out.println(s.replace('W','h')); // helcome

        //split - split strings  , After spliting stores in 1D array
        String email = "xyz@gmail.com";
        String array[]=email.split("@");  // xyz gmail.com
        System.out.println(array[0]); // xyz
        System.out.println(Arrays.toString(array)); // [xyz, gmail.com]

        //substring - finds string from main string
        System.out.println(s.substring(0,4)); // Welc

        //contains
        System.out.println(s.contains("com"));  //true









    }
}

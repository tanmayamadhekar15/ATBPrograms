package assignments;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        String str[]={"abc", "testing", "automation", "manual"};
        for(int i= str.length-1; i>=0; i--){
            System.out.print(str[i]+ ",");
        }
    }
}
/*
manual,automation,testing,abc
 */
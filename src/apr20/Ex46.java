package apr20;

public class Ex46 {
    public static void main(String[] args) {
        String str="Hi";
        String str1="Guys";
        String str2="hi guys";
        // 3 strings with 3 reference
        String str3=str.concat(str1);


        //SCP creates same references for same string,
        // but Heap area creates different refs for same string
        String name="Testing";
        String name1="Testing";
        String name2=new String("TestinG"); //HA
        // name ref - SCP, name1 ref - SCP, name2 ref - HA
        System.out.println(name == name1); // only checks reference -true
        System.out.println(name.equals(name1)); // only Checks value - true

        System.out.println(name == name2); // false
        System.out.println(name.equals(name2)); // false

    }
}

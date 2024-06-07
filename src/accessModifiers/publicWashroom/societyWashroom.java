package accessModifiers.publicWashroom;

import accessModifiers.flatWashroom.attachedWashroom;

public class societyWashroom {
    // available to everyone residing in society
    public static void main(String[] args) {
        attachedWashroom a=new attachedWashroom();
        //a.str; no access
        String s=a.str;
        System.out.println(s);
    }

}

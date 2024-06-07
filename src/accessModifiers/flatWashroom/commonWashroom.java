package accessModifiers.flatWashroom;

public class commonWashroom {

    public static void main(String[] args) {
        //can be accessed by family member as it is protected for family
        attachedWashroom a=new attachedWashroom();
        a.bath();
    }
}

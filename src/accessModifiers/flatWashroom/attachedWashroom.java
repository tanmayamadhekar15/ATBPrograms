package accessModifiers.flatWashroom;

public class attachedWashroom
{
    //Can be accessed only by couple as it is private for bedroom
    public String str="bathTub";
    protected void bath(){
        System.out.println("Couple");
    }
}

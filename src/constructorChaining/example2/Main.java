package constructorChaining.example2;

public class Main {
    public static void main(String[] args) {
       // Child c=new Child();// by default super is hidden
        Child c1=new Child("Name","Surname","Middlename");


    }
}
/*o/p:
Default Constructor
Called default constructor
Constructor chaining :T
Constructor chaining : Name Surname Middlename
*/
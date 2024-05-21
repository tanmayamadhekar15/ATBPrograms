package may21_abstraction.abstractBook;

public class PrintMyBook extends Book {  // extends abstract class
    String bookName;
    String authorName;
    int bookPrice;

    // Abstract method
    @Override
    void getDetails(String name, String author, int price) //parameterized
    {
        //this - to access current instance variable
        this.bookName=name;
        this.authorName=author;
        this.bookPrice=price;
        System.out.println("Book " +name+ " has author " +author+ " costs " +price);

    }
}

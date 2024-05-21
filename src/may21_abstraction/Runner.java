package may21_abstraction;

public class Runner {
    public static void main(String[] args) {
        PrintMyBook pb=new PrintMyBook();
        pb.getDetails("Harry Potter","J.K.Rowling",150);
    }
}

/*
O/p :
Book Harry Potter has author J.K.Rowling costs 150
 */
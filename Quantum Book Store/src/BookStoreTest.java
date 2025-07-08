import java.util.ArrayList;

public class BookStoreTest {
    public static void main(String[] args) {
        System.out.println("== Welcome to our BookStore ==");
        System.out.println("==============================\n");

        PaperBook paperBook = new PaperBook("ISBN1", "Designing Data Intensive Applications", 2001, 300,7);
        PaperBook paperBook2 = new PaperBook("ISBN2", "Clean Code", 2015, 150,3);
        EBook eBook = new EBook("ISBN3", "Operating Systems: Three Easy Pieces", 2018, 500, "PDF");
        DemoBook demoBook = new DemoBook("ISBN4", "Cracking the Coding Interview", 2020, 350);

        BookStore bookStore = new BookStore();
        try {
            bookStore.addBookToInventory(paperBook);
            bookStore.addBookToInventory(paperBook2);
            bookStore.addBookToInventory(eBook);
            bookStore.addBookToInventory(demoBook);
            System.out.println("==============================\n");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        ArrayList<Book> outdatedBooks = bookStore.removeOutdatedBooks(20);
        for(Book book: outdatedBooks){
            System.out.println(book.getTitle() + " is outdated and removed");
        }
        if(outdatedBooks.isEmpty()) System.out.println("There's no any outdated books!");
        System.out.println("==============================\n");

        double totalAmount = 0;

        try {
            double paidAmount = bookStore.buyABook("ISBN1", 3, "ahmedelhadary.cs@gmail.com", "Alexandria, Egypt");
            System.out.println();
            totalAmount += paidAmount;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("==============================\n");

        try {
            double paidAmount = bookStore.buyABook("ISBN2", 2, "ahmedelhadary.cs@gmail.com", "Alexandria, Egypt");
            System.out.println();
            totalAmount += paidAmount;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("==============================\n");

        try {
            double paidAmount = bookStore.buyABook("ISBN3", 1, "ahmedelhadary.cs@gmail.com", "Alexandria, Egypt");
            System.out.println();
            totalAmount += paidAmount;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("==============================\n");

        try {
            double paidAmount = bookStore.buyABook("ISBN4", 3, "ahmedelhadary.cs@gmail.com", "Alexandria, Egypt");
            System.out.println();
            totalAmount += paidAmount;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("==============================\n");

        if(totalAmount != 0)
            System.out.println("Total Paid Amount = " + totalAmount);

        System.out.println("Thanks for buying from our store.");
    }
}
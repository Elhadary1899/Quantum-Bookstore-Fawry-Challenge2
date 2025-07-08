import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BookStore {
    private HashMap<String, Book> inventory = new HashMap<>();

    public void addBookToInventory(Book book) throws Exception {
        if(book != null)
            inventory.put(book.ISBN, book);
        else
            throw new Exception("inventory can't accept a null value!");

        System.out.println(book.getTitle() + " is added to the inventory successfully.");
    }

    public ArrayList<Book> removeOutdatedBooks(int period){
        ArrayList<Book> outdatedBooks = new ArrayList<>();

        Iterator<Map.Entry<String, Book>> iterator = inventory.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Book> entry = iterator.next();
            if (entry.getValue().isOutdated(period)) {
                outdatedBooks.add(entry.getValue());
                iterator.remove();
            }
        }
        return outdatedBooks;
    }

    public double buyABook(String bookISBN, int quantity, String email, String address) throws Exception {
        if(!inventory.containsKey(bookISBN))
            throw new Exception("Book is not available!");

        double paidAmount = 0;
        try {
            paidAmount = inventory.get(bookISBN).buy(quantity, email, address);
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        }
        return paidAmount;
    }

}

public class DemoBook extends Book{
    DemoBook(){};
    public DemoBook(String ISBN, String title, int publishYear, double price) {
        super(ISBN, title, publishYear, price);
    }

    @Override
    public double buy(int quantity, String email, String address) throws Exception {
        throw new Exception("Demo book aren't for sale");
    }
}

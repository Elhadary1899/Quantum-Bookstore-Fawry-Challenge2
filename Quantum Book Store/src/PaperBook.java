public class PaperBook extends Book{
    private int stock;

    PaperBook(){}
    public PaperBook(String ISBN, String title, int publishYear, double price, int stock) {
        super(ISBN, title, publishYear, price);
        this.setStock(stock);
    }

    public void setStock(int stock){
        if(stock >= 0)
            this.stock = stock;
        else
            System.out.println("Invalid Stock");
    }
    public int getStock(){
        return stock;
    }

    @Override
    public double buy(int quantity, String email, String address) throws Exception {
        if(quantity > stock){
            throw new OutOfStockException("We are sorry, the book is out of Stock!");
        }

        this.setStock(this.getStock() - quantity);
        System.out.println("Successful Transaction!\nBook is being shipped to the address: " + address);

        return quantity * this.getPrice();
    }
}

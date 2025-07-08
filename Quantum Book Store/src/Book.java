import java.time.Year;

public abstract class Book {
    protected String ISBN;
    protected String title;
    protected int publishYear;
    protected double price;

    Book(){}
    public Book(String ISBN, String title, int publishYear, double price) {
        this.setISBN(ISBN);
        this.setTitle(title);
        this.setPublishYear(publishYear);
        this.setPrice(price);
    }

    public void setISBN(String ISBN) {
        if(!ISBN.isEmpty())
            this.ISBN = ISBN;
        else
            System.out.println("Book's ISBN Can't be Empty!");
    }
    public String getISBN() {
        return ISBN;
    }

    public void setTitle(String title) {
        if(!title.isEmpty())
            this.title = title;
        else
            System.out.println("Book's Title Can't be Empty!");
    }
    public String getTitle() {
        return this.title;
    }


    public void setPublishYear(int publishYear) {
        if(publishYear >= 1)
            this.publishYear = publishYear;
        else
            System.out.println("Invalid Publish Year!");
    }
    public int getPublishYear() {
        return publishYear;
    }


    public void setPrice(double price) {
        if(price > 0)
            this.price = price;
        else
            System.out.println("Invalid Price!");
    }
    public double getPrice() {
        return price;
    }

    public abstract double buy(int quantity, String email, String address) throws Exception;

    public boolean isOutdated(int numOfYears){
        return (Year.now().getValue() - this.publishYear) > numOfYears;
    }
}

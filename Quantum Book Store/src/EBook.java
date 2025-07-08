public class EBook extends Book{
    public String fileType;

    EBook(){};
    public EBook(String ISBN, String title, int publishYear, double price, String fileType) {
        super(ISBN, title, publishYear, price);
        this.setFileType(fileType);
    }

    public void setFileType(String fileType){
        if(!fileType.isEmpty())
            this.fileType = fileType;
        else
            System.out.println("Invalid file type");
    }
    public String getFileType(){
        return this.fileType;
    }

    @Override
    public double buy(int quantity, String email, String address){
        System.out.println("Successful Transaction!\nBook is being sent to the email: " + email);
        return quantity * this.getPrice();
    }
}

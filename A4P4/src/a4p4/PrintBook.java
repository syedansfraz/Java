package a4p4;
public class PrintBook extends Book
{
    private String publisher;
    private String ISBN;

    public PrintBook(String publisher, String ISBN, Object title, Object year, Object author) {
        super(title, year, author);
        this.publisher = publisher;
        this.ISBN = ISBN;
    }
    
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public String toString()
    {
        return String.format("%s\nPublisher:%s\nISBN No:%s",super.toString(),this.getPublisher(),this.getISBN());
    }
}

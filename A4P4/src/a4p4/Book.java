package a4p4;
public class Book <T1,T2,T3>
{
    private T1 title;
    private T2 year;
    private T3 author;

    public Book(T1 title, T2 year, T3 author) {
        this.title = title;
        this.year = year;
        this.author = author;
    }
    
    public T1 getTitle() {
        return title;
    }

    public void setTitle(T1 title) {
        this.title = title;
    }

    public T2 getYear() {
        return year;
    }

    public void setYear(T2 year) {
        this.year = year;
    }

    public T3 getAuthor() {
        return author;
    }

    public void setAuthor(T3 author) {
        this.author = author;
    }
    public String toString()
    {
        return String.format("Title:%s\nAuthor:%s\nYear of Pubication:%s",this.getTitle(),this.getAuthor(),this.getYear());
    }
}

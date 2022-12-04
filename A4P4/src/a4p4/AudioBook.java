package a4p4;
public class AudioBook extends Book
{
    private String size;
    private String lenght;
    private String artish;

    public AudioBook(String size, String lenght, String artish, Object title, Object year, Object author) {
        super(title, year, author);
        this.size = size;
        this.lenght = lenght;
        this.artish = artish;
    }
    
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getLenght() {
        return lenght;
    }

    public void setLenght(String lenght) {
        this.lenght = lenght;
    }

    public String getArtish() {
        return artish;
    }

    public void setArtish(String artish) {
        this.artish = artish;
    }
    public String toString()
    {
        return String.format("%s\nSize of Audio:%s\nDuration:%s\nArtist:%s",super.toString(),this.getSize(),this.getLenght(),this.getArtish());
    }
}

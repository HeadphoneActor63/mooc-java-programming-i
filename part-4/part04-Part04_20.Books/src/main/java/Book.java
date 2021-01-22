public class Book {
    
    private String title;
    private int pages;
    private int pubYear;
    
    public Book(String title, int pages, int pubYear) {
        this.title = title;
        this.pages = pages;
        this.pubYear = pubYear;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.pubYear;
    }
}

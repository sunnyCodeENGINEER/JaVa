public class Book {
    private String title;
    private String author;
    private int pageCount;

    // constructor method
    Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }
    // getter
    public String getTitle() {
        return this.title;
    }

    // getter
    public String getAuthor() {
        return this.author;
    }


    public String toString() {
        return String.format("%s by %s", this.title, this.author);
    }
}

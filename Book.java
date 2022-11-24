public class Book {
    private String title;
    private String author;

    // constructor method
    Book(String title, String author) {
        this.title = title;
        this.author = author;
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

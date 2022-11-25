public class EBook extends Book {
    private String format;

    EBook(String title, String author, int pageCount, String format) {
        super(title, author, 0);
        this.format = format;
    }
}

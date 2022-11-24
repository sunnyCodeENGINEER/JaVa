import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
    private String name;
    private LocalDate birthday;
    private ArrayList<Book> books = new ArrayList<Book>();

    // constructor method
    User(String name, String birthday) {
        this.name = name;
        this.birthday = LocalDate.parse(birthday);
    }

    // getter
    public String getName() {
        return this.name;
    }
    // getter
    public String getBirthday() {
        return this.birthday.toString();
    }

    public String borrowedBooks() {
        return this.books.toString();
    }

    public void borrow(Book book) {
        this.books.add(book);
    }

    public int age() {
        Period age = Period.between(this.birthday, LocalDate.now());

        return age.getYears();
    }
}


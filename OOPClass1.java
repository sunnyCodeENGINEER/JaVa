public class OOPClass1 {
    public static void main(String[] args) {
        User user = new User("Emmanuel", "2002-05-31");
        Book book = new Book("My Sweet Life.", "Emmanuel");

        User olderUser = new User("Kofi", "2002-05-31");

        System.out.println(String.format("%s was born back in %s and he is now %d years old", user.getName(), user.getBirthday(), user.age()));
        System.out.println(String.format("%s was born back in %s and he is now %d years old", olderUser.getName(), olderUser.getBirthday(), olderUser.age()));

        user.borrow(book);

        System.out.println(String.format("%s has borrowed these books: %s \n", user.getName(), user.borrowedBooks()));
    }
}

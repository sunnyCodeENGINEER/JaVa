public class OOPClass1 {
    public static void main(String[] args) {
        User user = new User("Emmanuel", "2002-05-31");
        Book sweetLifeBook = new Book("My Sweet Life.", "Emmanuel", 240);
        AudioBook rac = new AudioBook("Drac", "Me", 300000);
        EBook laws = new EBook("48 laws of wer-Po", "Power", 185, "pdf");

        User olderUser = new User("Kofi", "2002-05-31");

        System.out.println(String.format("%s was born back in %s and he is now %d years old", user.getName(), user.getBirthday(), user.age()));
        System.out.println(String.format("%s was born back in %s and he is now %d years old", olderUser.getName(), olderUser.getBirthday(), olderUser.age()));

        user.borrow(sweetLifeBook);

        System.out.println(String.format("%s has borrowed these books: %s \n", user.getName(), user.borrowedBooks()));

        System.out.println(rac.toString());
        System.out.println(laws.toString());
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a library
        Library lib = new Library(100);
        // Adding some books by Pakistani authors to the library
        Book book1 = new Book("Moth Smoke", "Mohsin Hamid", 2000,247,59 );
        Book book2 = new Book("The Reluctant Fundamentalist", "Mohsin ", 2007,184,60 );
        Magzine magazine1 = new Magzine("Dastaan-e-Pakistan", "History Dept", 2022, 5, 2);
        lib.addItem(book1);
        lib.addItem(book2);
        lib.addItem(magazine1);
        // Borrowing a book
        lib.borrowItem(book1);
        // Displaying available and borrowed items
        System.out.println("Available Items:");
        lib.displayAvailableItems();
        System.out.println("\nBorrowed Items:");
        lib.displayBorrowedItems();
        // Returning a book
        lib.returnItem(book1);
        System.out.println("\nAfter returning 'Moth Smoke':");
        System.out.println("Available Items:");
        lib.displayAvailableItems();
        System.out.println("\nBorrowed Items:");
        lib.displayBorrowedItems();

    }
}

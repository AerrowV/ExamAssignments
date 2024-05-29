import java.util.ArrayList;

class User {
    private String name;
    private int usernumber;
    private ArrayList<Book> borrowedBooks;

    public User(String name, int userNumber) {
        this.name = name;
        this.usernumber = userNumber;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getUserNumber() {
        return usernumber;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        if (!book.isBorrowed()) {
            getBorrowedBooks().add(book);
        }
    }

    public void returnBook(Book book) {
        if (getBorrowedBooks().remove(book)) {
            book.setBorrowed(false);
        }
    }

    @Override
    public String toString() {
        return "Number: " + getUserNumber() + ", Name: " + getName();
    }
}
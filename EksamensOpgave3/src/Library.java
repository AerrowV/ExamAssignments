import java.util.ArrayList;

class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void borrowBook(Book book, User user) {
        if (books.contains(book) && !book.isBorrowed()) {
            user.borrowBook(book);
        }
    }

    public void returnBook(Book book, User user) {
        user.returnBook(book);
    }

    public ArrayList<Book> searchBook(String keyword) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }

    public ArrayList<Book> searchBookByAuthor(String author) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }

}

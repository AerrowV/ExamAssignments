import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Bo med en ko 1","Bo"));
        library.addBook(new Book("Bo med en ko 2","Bo"));
        library.addBook(new Book("so","Sang"));
        library.addBook(new Book("Bo med en ko 4","Bo"));


        User user = new User("Asim Kilic", 6699);
        System.out.println(user);

        Book bookToBorrow = library.getBooks().getFirst();
        Book bookToBorrow2 = library.getBooks().getLast();
        library.borrowBook(bookToBorrow, user);
        library.borrowBook(bookToBorrow2, user);
        System.out.println(bookToBorrow);
        System.out.println(bookToBorrow2);

        System.out.println("\n" + user + "\nborrowed books: ");
        for (Book book : user.getBorrowedBooks()){
            System.out.println(book);
        }



        System.out.println("\nlibary books: ");
        for (Book book : library.getBooks()){
            System.out.println(book);
        }

         library.returnBook(bookToBorrow, user);
         System.out.println("\n Returned: " + bookToBorrow);

         ArrayList<Book> search = library.searchBook("Bo");

        System.out.println("\nSearch by title: ");
         for (Book book : search){
             System.out.println(book);
         }

        System.out.println("\nBooks by this author: ");
         ArrayList<Book> search2 = library.searchBookByAuthor("Sang");
         for (Book book : search2){
             System.out.println(book);
         }

    }
}
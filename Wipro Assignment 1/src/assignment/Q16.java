package assignment;

public class Q16 {
    public static void main(String[] args) {
        // Array of 5 books
        Book[] books = new Book[5];

        books[0] = new Book(101, "Wings of Fire", "A.P.J. Abdul Kalam");
        books[1] = new Book(102, "The Alchemist", "Paulo Coelho");
        books[2] = new Book(103, "Clean Code", "Robert C. Martin");
        books[3] = new Book(104, "Atomic Habits", "James Clear");
        books[4] = new Book(105, "Rich Dad Poor Dad", "Robert Kiyosaki");

        // Display all books
        System.out.println("Book Details:\n");
        for (Book b : books) {
            b.display();
        }
    }
}

class Book {
    private int bookId;
    private String title;
    private String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println("Book ID : " + bookId);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.println("---------------------------");
    }
}

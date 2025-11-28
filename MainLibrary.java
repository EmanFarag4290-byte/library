// Book Class
class Book {
    String title, author;
    int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
}

// Library Class
class Library {
    Book[] library; // Array to store books
    int count = 0; // Number of books added

    public Library(int capacity) {
        library = new Book[capacity];
    }

    public void addBook(Book book) {
        if (count < library.length) {
            library[count] = book;
            count++;
        } else {
            System.out.println("Library is full!");
        }
    }

    public void displayBooks() {
        System.out.println("Library Books:");
        for (int i = 0; i < count; i++) {
            System.out.println(library[i].title + " by " + library[i].author + " (" + library[i].year + ")");
        }
    }
}

// Main Class
public class MainLibrary {
    public static void main(String[] args) {
        Library library = new Library(3);

        library.addBook(new Book("Thorns and Cloves", "Yahia Al-Sinwar", 2019));
        library.addBook(new Book("Enjoy Your Life", "Mohammed Al-Urify", 2008));
        library.addBook(new Book("Profitable Deals", "Khaled Abo Shady", 2010));

        library.displayBooks();
    }
}
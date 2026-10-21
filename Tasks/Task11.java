class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    public Book(String title, String author, int yearPublished,  double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    @Override
    public String toString() {
        return  """
                Title: %s
                Author: %s
                Year Published: %d
                Price: $%.2f %n""".formatted(title, author, yearPublished, price);
    }
}

public class Task11 {
    static void main(String[] args) {
        Book[] books = new Book[] {
                new Book("Java Programming", "John Smith", 2021, 39.99),
                new Book("Python Basics", "Jane Doe", 2020, 29.99),
                new Book("C++ Essentials", "Michael Johnson", 2019, 49.99)
        };

        int count = 1;
        for (Book book : books ) {
            System.out.printf("Book %d: %n", count);
            System.out.println(book.toString());
            count++;
        }
    }
}
public class Book {
    String bookID, title, author;

    public Book(String bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
    }

    public String getBookDetails() {
        return "Book ID : " + this.bookID + 
                "\n Book Title : " + this.title + 
                "\n Book Author : " + this.author + "\n";
    }
}
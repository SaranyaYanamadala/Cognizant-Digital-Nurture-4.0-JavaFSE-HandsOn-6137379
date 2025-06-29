public class LibraryManagement {
    public static void main(String[] args) {

        // Creating a list of books
        Book[] books = {
                        new Book("BK1023", "Clean Code", "Robert C. Martin"),
                        new Book("BK5408", "Design Patterns", "Erich Gamma"),
                        new Book("BK3876", "Effective Java", "Joshua Bloch"),
                        new Book("BK7642", "Introduction to Algorithms", "Thomas H. Cormen"),
                        new Book("BK2194", "The Pragmatic Programmer", "Andy Hunt")
        };

        // Using Linear Search
        LinearSearch linear_search = new LinearSearch();
        System.out.println("Using Linear Search...");
        System.out.println(linear_search.linearSearchAlgorithm(books, "Effective Java"));

        // Using Binary Search
        BinarySearch binary_search = new BinarySearch();
        System.out.println("Using Binary Search...");
        System.out.println(binary_search.binarySearchAlgorithm(books, "Clean Code"));
    }
}
public class LinearSearch {
    public String linearSearchAlgorithm(Book[] books, String title) {
        for(Book book : books) {
            if(book.title.equalsIgnoreCase(title)) {
                return title + " is found. \n";
            }
        }

        return title + " is not found. \n";
    }
}
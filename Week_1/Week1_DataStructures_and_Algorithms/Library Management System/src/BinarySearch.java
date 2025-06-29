import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public String binarySearchAlgorithm(Book[] books, String title) {
        Arrays.sort(books, Comparator.comparing(book -> book.title.toLowerCase()));
        int low = 0, high = books.length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;
            int compare = books[mid].title.compareToIgnoreCase(title);

            if(compare == 0) {
                return title + " is found. \n";
            } else if(compare < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return title + " is not found. \n";
    }
}

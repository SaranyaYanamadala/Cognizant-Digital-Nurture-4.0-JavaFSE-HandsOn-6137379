public class SortingImplementation {
    public static void main(String[] args) {
        // Creating some orders first
        Order[] bubble_orders = {
                            new Order("ORD826315", "Devi Saranya", 60000.0),
                            new Order("ORD103472", "Akshaya", 2500.0),
                            new Order("ORD592380", "Harshitha", 1000.0),
                            new Order("ORD774911", "Tejaswi", 750.0),
                            new Order("ORD449027", "Deepika", 2050.0)
                        };

        System.out.println("Bubble Sort Algorithm...");
        BubbleSortImpl bubble_sort = new BubbleSortImpl();
        bubble_sort.bubbleSort(bubble_orders);
        printSortedArray(bubble_orders);

        Order[] quick_orders = {
                            new Order("ORD501637", "Devi Saranya", 60000.0),
                            new Order("ORD680153", "Akshaya", 2500.0),
                            new Order("ORD218934", "Harshitha", 1000.0),
                            new Order("ORD375840", "Tejaswi", 750.0),
                            new Order("ORD960721", "Deepika", 2050.0)
                        };
        
        System.out.println("Quick Sort Algorithm...");
        QuickSortImpl quick_sort = new QuickSortImpl();
        quick_sort.quickSort(quick_orders, 0, quick_orders.length-1);
        printSortedArray(quick_orders);
    }

    public static void printSortedArray(Order[] orders) {
        for(Order order : orders) {
            System.out.println(order.getDetails());
        }
    }
}
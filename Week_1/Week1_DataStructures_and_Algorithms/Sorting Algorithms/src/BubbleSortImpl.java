public class BubbleSortImpl {
    public void bubbleSort(Order[] orders) {
        int N = orders.length;
        boolean swapped;

        for(int i = 0; i < N; i++) {
            swapped = false;

            for(int j = 0; j < N - i - 1; j++) {
                if(orders[j].totalPrice > orders[j+1].totalPrice) {
                    // swapping
                    Order temp = orders[j];
                    orders[j] = orders[j+1];
                    orders[j+1] = temp;

                    swapped = true;
                }
            }

            if(!swapped) {
                break;
            }
        }
    }
}

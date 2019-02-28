import sorting.BubbleSort;
import sorting.QuickSort;

public class Main {
    public static void main(String[] args) {

        int array[] = {94, 321, 2, 234, 11, 92, -7, 17, 48, 56};
        int arrays[] = {54, 432, 43, 0, -84, 11, 99, 189, 174, 151, 64, 83};

        System.out.println();
        System.out.println("BubbleSort:");
        System.out.println();

        BubbleSort bubbleSort = new BubbleSort(array);

        for (int x :
                bubbleSort.getArray()) {
            System.out.println(x);
        }

        System.out.println();
        System.out.println("QuickSort:");
        System.out.println();

        QuickSort quickSort = new QuickSort(arrays, 0 , arrays.length);

        for (int x :
                quickSort.getArray()) {
            System.out.println(x);
        }
    }
}

package sorting;

public class BubbleSort {

    private int[] array;

    public BubbleSort(int[] array) {
        this.array = array;
        for (int i = 0; i < array.length - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int a = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = a;
                    swap = true;
                }
            }
            if (swap == false) {
                break;
            }
        }
    }

    public int[] getArray() {
        return array;
    }
}
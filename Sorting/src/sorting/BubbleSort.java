
public class ArrayBubble {


    private int array[];
    private static int length = 0;

    public ArrayBubble(int size) {
        array = new int[size];
    }

    public void put(int value) {
        array[length] = value;
        length++;
    }

    private void change(int one, int two){
        int a = array[one];
        array[one] = array[two];
        array[two] = a;
    }

    public void sortingBubble() {
        for (int i = length - 1; i >= 1 ; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    change(j,j+1);
                }
            }
        }
    }

    public int[] getArray() {
        return array;
    }
}
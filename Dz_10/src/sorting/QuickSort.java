package sorting;

import java.util.Random;

public class QuickSort {

    private int array[];
    private int left, right;
    Random rnd = new Random();

    public QuickSort(int[] array, int left, int right) {
        this.array = array;
        this.left = left;
        this.right = right;
        sortingQuick(array, left, right);
    }

    private void sortingQuick(int[] array, int left, int right) {

        int l = left;
        int r = right - 1;
        int size = right - left;
        if(size > 1) {
            int pivot = array[rnd.nextInt(size) + l];
            while (l < r) {
                while (array[r] > pivot && r > l) {
                    r--;
                }
                while (array[l] < pivot && r >= l) {
                    l++;
                }
                if (l < r) {
                    int save = array[l];
                    array[l] = array[r];
                    array[r] = save;
                    l++;
                }
            }
            sortingQuick(array,left,l);
            sortingQuick(array,r,right);
        }
    }

    public int[] getArray() {
        return array;
    }
}

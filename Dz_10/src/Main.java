import sorting.BubbleSort;
import sorting.QuickSort;
import tree.TreeRedBlack;

public class Main {
    public static void main(String[] args) {

        int arrayOne[] = {94, 321, 2, 234, 11, 92, -7, 17, 48, 56};
        int arrayTwo[] = {54, 432, 43, 0, -84, 11, 99, 189, 174, 151, 64, 83};

        System.out.println();
        System.out.println("BubbleSort:");
        System.out.println();

        BubbleSort bubbleSort = new BubbleSort(arrayOne);

        for (int x :
                bubbleSort.getArray()) {
            System.out.println(x);
        }

        System.out.println();
        System.out.println("QuickSort:");
        System.out.println();

        QuickSort quickSort = new QuickSort(arrayTwo, 0 , arrayTwo.length);

        for (int x :
                quickSort.getArray()) {
            System.out.println(x);
        }

        System.out.println();
        System.out.println("Tree:");
        System.out.println();

        TreeRedBlack tree = new TreeRedBlack();

        tree.add(21);
        tree.add(16);
        tree.add(29);
        tree.add(11);
        tree.add(8);
        tree.add(31);
        tree.add(21);
        tree.add(22);

        tree.check(tree.node, 31);
        tree.check(tree.node, 17);
    }
}

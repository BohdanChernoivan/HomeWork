import sorting.BubbleSort;
import sorting.QuickSort;
import tree.MyTree;

public class Main {
    public static void main(String[] args) {

        int arrayOne[] = {94, 321, 2, 234, 11, 92, -7, 17, 48, 56};
        int arrayTwo[] = {54, 432, 43, 0, -84, 11, 99, 189, 174, 151, 64, 83 , -84};

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

        MyTree tree = new MyTree();

        tree.add(12);
        tree.add(8);
        tree.add(10);
        tree.add(11);
        tree.add(7);
        tree.add(15);
        tree.add(14);
        tree.add(4);

        tree.printValues(tree.node);
        System.out.println();

        tree.check(tree.node, 11);
        tree.check(tree.node, 9);

    }
}

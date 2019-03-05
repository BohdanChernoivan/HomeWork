package tree;


public class MyTree {

    protected class Node {
        private Node left, right;
        private int value, height;

        Node(int value) {
            this.value = value;
            height = 1;
        }
    }

    public Node node;

    private int height(Node myTree) {
        if (myTree == null) {
            return 0;
        }
        return myTree.height;
    }

    private int maxValue(int right, int left) {
        return (right > left) ? right : left;
    }

    private Node shiftRight(Node myTree) {

        Node newTree = myTree.left;
        myTree.left = newTree.right;
        newTree.right = myTree;

        newTree.height = maxValue(height(newTree.left), height(newTree.right)) + 1;
        this.node = newTree;

        return newTree;
    }

    private Node shiftLeft(Node myTree) {

        Node newTree = myTree.right;
        myTree.right = newTree.left;
        newTree.left = myTree;

        newTree.height = maxValue(height(newTree.left), height(newTree.right)) + 1;
        this.node = newTree;

        return newTree;
    }

    private int balance(Node myTree) {
        if (myTree == null) {
            return 0;
        }
        return height(myTree.left) - height(myTree.right);
    }

    public void add(int value) {
        node = insert(node,value);
    }

    private Node insert(Node myTree, int value) {

        if (myTree == null) {
            myTree = new Node(value);
            return myTree;
        }

        if (value > myTree.value) {
            myTree.right = insert(myTree.right, value);
        } else {
            myTree.left = insert(myTree.left, value);
        }

        myTree.height = 1 + maxValue(height(myTree.left), height(myTree.right));


        int balance = balance(myTree);

        //  if balance != 1 then the tree get balanced
        if (balance > 1 && value < myTree.left.value) {
            return shiftRight(myTree);
        } else if (balance < -1 && value > myTree.right.value) {
            return shiftLeft(myTree);
        }

        if (balance > 1 && value > myTree.left.value) { // left-right
            myTree.left = shiftLeft(myTree.left);
            return shiftRight(myTree);
        }

        if (balance < -1 && value < myTree.right.value) { // right-left
            myTree.right = shiftRight(myTree.right);
            return shiftLeft(myTree);
        }

        return myTree;
    }


    public Node check(Node node, int value) {

        if (node == null) {
            System.out.println("Don't found " + value);
            return null;
        }
        if (value == node.value) {
            System.out.println("Found = " + node.value);
            return node;
        }
        return value > node.value
                ? check(node.right, value)
                : check(node.left, value);

    }

    public void printValues(Node myTree) {

        if (myTree != null) {
            System.out.print(myTree.value + " ");
            printValues(myTree.left);
            printValues(myTree.right);
        }
    }

    public boolean checkBalance(Node node) {

        if (node.left != null) {
            if (node.value >= node.left.value) {
                checkBalance(node.left);
            }
            else return false;

        }
        if (node.right != null) {
            if (node.value <= node.right.value) {
                checkBalance(node.right);
            }
            else return false;
        }
        return true;
    }
}
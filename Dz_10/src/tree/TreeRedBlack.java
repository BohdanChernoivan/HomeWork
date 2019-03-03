package tree;

public class TreeRedBlack {

    private class Node {
        Node left, right;
        int value;

        private Node(int data) {
            value = data;
            left = right = null;
        }
    }

    public Node node = null;

    public void add(int value) {
        node = addValue(node, value);
    }

    private Node addValue(Node node, int value) {
        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (value > node.value) {
            node.right = addValue(node.right, value);
        } else {
            node.left = addValue(node.left, value);
        }

        return node;
    }

    public Node check(Node node, int value) {

        if (node == null) {
            System.out.println("Don't found " + value);
            System.out.println("Node = " + null);
            return null;
        }
        if (value == node.value) {
            System.out.println("Found = " + node.value + " in this tree");
            return node;
        }
        return value > node.value
                ? check(node.right, value)
                : check(node.left, value);

    }

    public void printElements(Node node) {

       if(node != null) {
           System.out.print(" " + node.value);
           printElements(node.left);
           printElements(node.right);
       }
    }


    public Node shiftLeft(Node node) {

        Node node1 = node.right;
        node.right = node1.left;
        node1.left = node;
        this.node = node1;
        return node1;

    }

    public Node shiftRight(Node node) {

        Node node1 = node.left;
        node.left = node1.right;
        node1.right = node;
        this.node = node1;
        return node1;

    }

    public boolean checkBalance(Node node) {

        if (node.left != null) {
            if (node.value > node.left.value) {
                checkBalance(node.left);
            }
            else return false;

        }
        if (node.right != null) {
            if (node.value < node.right.value) {
                checkBalance(node.right);
            }
            else return false;
        }
        return true;
    }
}
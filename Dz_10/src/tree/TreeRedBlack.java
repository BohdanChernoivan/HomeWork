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
        if (value > node.value) {
            return check(node.right, value);
        } else {
            return check(node.left, value);
        }

    }

//    public Node balance(Node node) {
//
//        if (node);
//    }

}

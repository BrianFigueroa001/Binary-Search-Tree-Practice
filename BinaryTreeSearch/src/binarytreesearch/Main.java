package binarytreesearch;

public class main {
    //Binary Tree 1

    public static void main(String[] args) {
        BinaryNode node8 = new BinaryNode(8);
        BinaryNode node5 = new BinaryNode(5);
        BinaryNode node9 = new BinaryNode(9);
        BinaryNode node7 = new BinaryNode(7);
        BinaryNode node1 = new BinaryNode(1);
        BinaryNode node12 = new BinaryNode(12);
        BinaryNode node2 = new BinaryNode(2);
        BinaryNode node4 = new BinaryNode(4);
        BinaryNode node11 = new BinaryNode(11);
        BinaryNode node3 = new BinaryNode(3);
        node8.setLeft(node5);
        node8.getLeft().setLeft(node9);
        node8.getLeft().setRight(node7);
        node8.getLeft().getRight().setLeft(node1);
        node8.getLeft().getRight().setRight(node12);
        node8.getLeft().getRight().getRight().setLeft(node2);
        node8.setRight(node4);
        node8.getRight().setRight(node11);
        node8.getRight().getRight().setLeft(node3);
        
        BinaryTree bt = new BinaryTree();
        bt.setRoot(node8);
        
        bt.printInOrder();
    }
}

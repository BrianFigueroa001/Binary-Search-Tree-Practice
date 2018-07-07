package binarytreesearch;

public class main {
    //Binary Tree 1

    public static void main(String[] args) {
        BinaryNode node8 = new BinaryNode(8);
        BinaryNode node3 = new BinaryNode(3);
        BinaryNode node1 = new BinaryNode(1);
        BinaryNode node6 = new BinaryNode(6);
        BinaryNode node4 = new BinaryNode(4);
        BinaryNode node7 = new BinaryNode(7);
        BinaryNode node10 = new BinaryNode(10);
        BinaryNode node14 = new BinaryNode(14);
        BinaryNode node13 = new BinaryNode(13);
        node8.setLeft(node3);
        node8.getLeft().setLeft(node1);
        node8.getLeft().setRight(node6);
        node8.getLeft().getRight().setLeft(node4);
        node8.getLeft().getRight().setRight(node7);
        node8.setRight(node10);
        node8.getRight().setRight(node14);
        node8.getRight().getRight().setLeft(node13);
        
        BinaryTree bt = new BinaryTree();
        bt.setRoot(node8);
        bt.printInOrder();
        
        BinaryNode node15 = new BinaryNode(15);
        bt.insert(node15, bt.getRoot());
        System.out.print("\n");
        bt.printInOrder();
        bt.delete(15);
        System.out.print("\n");
        bt.printInOrder();
        bt.delete(14); 
        System.out.print("\n");
        bt.printInOrder();
    }
}

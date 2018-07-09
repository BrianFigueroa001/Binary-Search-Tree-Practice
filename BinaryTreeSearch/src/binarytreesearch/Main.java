package binarytreesearch;

public class main {
    //Binary Tree 1

    public static void main(String[] args) {
        BinarySearchTree bt = new BinarySearchTree();

// Tree 1:
//        BinaryNode node8 = new BinaryNode(8);
//        BinaryNode node3 = new BinaryNode(3);
//        BinaryNode node1 = new BinaryNode(1);
//        BinaryNode node6 = new BinaryNode(6);
//        BinaryNode node4 = new BinaryNode(4);
//        BinaryNode node7 = new BinaryNode(7);
//        BinaryNode node10 = new BinaryNode(10);
//        BinaryNode node14 = new BinaryNode(14);
//        BinaryNode node13 = new BinaryNode(13);
//        node8.setLeft(node3);
//        node8.getLeft().setLeft(node1);
//        node8.getLeft().setRight(node6);
//        node8.getLeft().getRight().setLeft(node4);
//        node8.getLeft().getRight().setRight(node7);
//        node8.setRight(node10);
//        node8.getRight().setRight(node14);
//        node8.getRight().getRight().setLeft(node13);
//        
//        bt.setRoot(node8);
//        bt.printInOrder();
//        
//        BinaryNode node15 = new BinaryNode(15);
//        bt.ins(node15, bt.getRoot());
//        System.out.print("\n");
//        bt.printInOrder();
//        bt.delete(15);
//        System.out.print("\n");
//        bt.printInOrder();
//        bt.delete(6);
//        System.out.print("\n");
//        bt.printInOrder();

//Tree 2
          BinaryNode node7 = new BinaryNode(7);
          BinaryNode node5 = new BinaryNode(5);
          BinaryNode node3 = new BinaryNode(3);
          BinaryNode node1 = new BinaryNode(1);
          BinaryNode node4 = new BinaryNode(4);
          BinaryNode node6 = new BinaryNode(6);
          BinaryNode node12 = new BinaryNode(12);
          BinaryNode node9 = new BinaryNode(9);
          BinaryNode node8 = new BinaryNode(8);
          BinaryNode node10 = new BinaryNode(10);
          BinaryNode node15 = new BinaryNode(15);
          BinaryNode node13 = new BinaryNode(13);
          BinaryNode node17 = new BinaryNode(17);
          
          node7.setLeft(node5);
          node7.getLeft().setRight(node6);
          node7.getLeft().setLeft(node3);
          node7.getLeft().getLeft().setLeft(node1);
          node7.getLeft().getLeft().setRight(node4);
          node7.setRight(node12);
          node7.getRight().setLeft(node9);
          node7.getRight().setRight(node15);
          node7.getRight().getLeft().setLeft(node8);
          node7.getRight().getLeft().setRight(node10);
          node7.getRight().getRight().setLeft(node13);
          node7.getRight().getRight().setRight(node17);
          
          bt.setRoot(node7);
          bt.printInOrder();
          
//          bt.delete(12);
//          System.out.print("\n");
//          bt.printInOrder();
//          
     
          bt.insert(14);
          bt.insert(11);
          bt.insert(16);
          System.out.print("\n");
          bt.printInOrder();
          
          
    }
}

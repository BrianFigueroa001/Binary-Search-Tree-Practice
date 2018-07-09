package binarytreesearch;

public class BinarySearchTree {

    private BinaryNode root;

    public void setRoot(BinaryNode root) {
        this.root = root;
    }

    public BinaryNode find(int valueToFind) { //iterative search
        BinaryNode tempNode = root;
        
        while (tempNode.getValue() != valueToFind) {
            if (tempNode.getValue() > valueToFind) {
                if (tempNode.getLeft() == null) {
                    break;
                }
                tempNode = tempNode.getLeft();
            } else {
                if (tempNode.getRight() == null) {
                    break;
                }
                tempNode = tempNode.getRight();
            }
        }

        if (tempNode.getValue() == valueToFind) {
            return tempNode;
        }
        System.out.print("Node not in the tree. Null returned.");
        return null;
    }
    
    //ToDo: Check code
    //Remember: Purpose is to put nodeToInsert at "bottom of the tree"
    public void insert(int valueToInsert){
        if (root == null){ //Checks if tree is empty
            root = new BinaryNode(valueToInsert);
        }
        else {
            ins(valueToInsert, root);
        }
    }
    
    private void ins(int valueToInsert, BinaryNode node){
        BinaryNode nodeToInsert = new BinaryNode(valueToInsert);
        
        if (nodeToInsert.getValue() < node.getValue()){
            if (node.getLeft() == null){ //base case
                node.setLeft(nodeToInsert);
                return;
            }
            else {
                ins(valueToInsert, node.getLeft());
            }
        }
        
        if (nodeToInsert.getValue() > node.getValue()){
            if (node.getRight() == null){ //base case
                node.setRight(nodeToInsert);
            }
            else {
                ins(valueToInsert, node.getRight());
            }
        }    
    }

    public void delete(int valueToDelete) {  //Part 1: Check if tree is empty
        if (root == null){
            System.out.print("Tree is empty.");
        }
        else {
            root = del(valueToDelete, root);
        }
    }
    
    private BinaryNode del(int valueToDelete, BinaryNode currentNode){ //Part 2: Recursively find node to delete.
        //Recursively traverses left/right subtree if the deletion value is less/greater than the currentNode's value
        if (valueToDelete < currentNode.getValue()){
            currentNode.setLeft(del(valueToDelete, currentNode.getLeft()));
        }
        else if (valueToDelete > currentNode.getValue()){
            currentNode.setRight(del(valueToDelete, currentNode.getRight()));
        }
        //Statement runs if currentNode's value is equal to the deletion value
        else {
            if (currentNode.getLeft() == null && currentNode.getRight() == null){ //If node has no children
                return null;
            }
            //If node has one child.
            else if (currentNode.getLeft() == null){
                return currentNode.getRight();
            }
            else if (currentNode.getRight() == null){
                return currentNode.getLeft();
            }
            //If currentNode has 2 children
            else {
                //Set current node's value to its in order successor (the next smallest node in its right subtree);
                currentNode.setValue(inOrderSuccessor(currentNode.getRight()));
                //delete duplicate node
                currentNode.setRight(del(currentNode.getValue(), currentNode.getRight()));
            }
        }
        return currentNode;
    }
    
    private int inOrderSuccessor(BinaryNode node){
        int minimunValue = node.getValue();
        while (node.getLeft() != null){
            node = node.getLeft();
            minimunValue = node.getValue();
        }
        return minimunValue;
    }
    
    public void printInOrder(){
        print(root);
    }
    
    private void print(BinaryNode node){         
        if (node == null){
            return;
        }
        print(node.getLeft());
        System.out.print(node.getValue() + " ");
        print(node.getRight());
    }
}

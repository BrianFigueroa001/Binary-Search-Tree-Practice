package binarytreesearch;

public class BinaryTree {

    private BinaryNode root;

    public void setRoot(BinaryNode root) {
        this.root = root;
    }

    public BinaryNode find(int valueToFind) {
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
        return null;
    }
    
    //ToDo: Check code
    //Remember: Purpose is to put nodeToInsert at "bottom of the tree"
    public void insert(BinaryNode nodeToInsert, BinaryNode node){
        if (node == null){ //If tree is empty
            node = nodeToInsert;
            return;
        }
        if (nodeToInsert.getValue() < node.getValue()){
            if (node.getLeft() == null){ //base case
                node.setLeft(nodeToInsert);
                return;
            }
            else {
                insert(nodeToInsert, node.getLeft());
            }
        }
        
        if (nodeToInsert.getValue() > node.getValue()){
            if (node.getRight() == null){ //base case
                node.setRight(nodeToInsert);
            }
            else {
                insert(nodeToInsert, node.getRight());
            }
        }    
    }

    public void delete(int valueToDelete, BinaryNode node) { //Recursion
        if (valueToDelete == node.getValue()){
            
        }
    }
}

package binarytreesearch;

public class BinaryNode {
    private int value;
    private BinaryNode left;
    private BinaryNode right;
    
    public BinaryNode(int value){
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }
    
}

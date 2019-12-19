package hw.task2;

public class BTreeNode {

    private BTreeNode left;

    private BTreeNode right;

    private int value;

    private int level;

    public BTreeNode(int value, int level) {
        this.value = value;
        this.level = level;
    }

    public BTreeNode getLeft() {
        return left;
    }

    public void setLeft(BTreeNode left) {
        this.left = left;
    }

    public BTreeNode getRight() {
        return right;
    }

    public void setRight(BTreeNode right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

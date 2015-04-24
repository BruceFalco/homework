public class Node {
    private int data;
    private Node left, right;

    public Node() {
    }

    public Node(int i) {
	data = i;
    }

    public void setData(int i) {
	data = i;
    }

    public void setLeft(Node left) {
	left = left;
    }
    
    public void setRight(Node right) {
	right = right;
    }

    public Node getLeft() {
	return left;
    }
    public Node getRight() {
	return right;
    }
    public int getData() {
	return data;
    }

}

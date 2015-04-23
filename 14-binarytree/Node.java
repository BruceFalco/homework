public class Node {
    private int data;
    private Node left, right;

    public Node() {
	data = null;
	left,right= null;
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

}

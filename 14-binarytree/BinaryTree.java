public class BinaryTree {
    private Node root;

    public BinaryTree() {
	
    }

    public BinaryTree(Node root) {
	root = root;
    }

    public Node search(Node T, int i) {
	
	while (T! = null) {
	    int c = T.getData().compareTo(i);
	    if (c > 0) {
		

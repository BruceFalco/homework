public class BinaryTree {
    private Node root;

    public BinaryTree() {
	
    }

    public BinaryTree(Node root) {
	root = root;
    }

    public Node search(Node T, int i) {
	Node T2 = T;
	while (T != null) {
	    T2 = T;
	    int c = T.getData() - i ;
	    if (c > 0) {
		T = T.getRight();
	    }
	    else if (c < 0) {
		T = T.getLeft();
	    }
	    else {
		return T;
	    }
	}
	return T2;
    }

    public void insert(Node t, int i) {
	Node base;
	// from which new leaf springs

	if (root == null) {
	    root = t;
	}
	base = search(t, i);

	int c = base.getData() - i;
	Node enter = new Node(i);

	if (c > 0) {
	    base.setRight(enter);
	}
	else if (c < 0) {
	    base.setLeft(enter);
	}
	
	

	// print it

    }

}

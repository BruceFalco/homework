import java.io.*;
import java.util.*;

public class BinaryTree {
    Node root;

    public BinaryTree() {
	
    }

    public BinaryTree(Node root) {
	this.root = root;
    }

    public void setRoot(Node root) {
	root = root;
    }
    public Node getRoot(){
	return root;
    }

    public Node search(Node t, int i) {
	if (t==null || t.getData()==i){
	    return t;
	}
	else if (i < t.getData() ) {
	    return search(t.getLeft(),i);
	}
	else {
	    return search(t.getRight(),i);
	}
    }
    
    
    public String search(int i) {
	Node n = search(root,i);
	if (n == null) {
	    return "NOT FOUND";
	}
	else {
	    return n.toString();
	}
    }

    public void insert(int i) {
	Node n = new Node(i);
	Node t2 = null;
	Node t=root;
	// piggyback t2 and leaf pointer t
	if (root == null) {
	    root=n;
	    //if root is empty, set root;
	    return;
	}
	while (t!=null) {
	    t2 = t;
	    // while the leaf pointer is not null/there is a root/
	    // t is pointingto SOMETHING, a leaf, etc.
	    // set piggyback t2 to t, since t is substantial

	    if (t.getData() == i) {
		return;
	    }
	    else if (t.getData() > i) {
		t = t.getLeft();
	    }
	    else {
		t = t.getRight();
	    }
	}
	if (i < t2.getData()) {
	    t2.setLeft(n);
	}
	else {
	    t2.setRight(n);
	}
    }
	    // finish insert

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


    public int maxValue(Node r) {
	if (root.getRight() == null) {
	    return r.getData();
	}
	else {
	    return  maxValue(r.getRight());
	}
    }

    public int numNodes (Node r) {
	if (r == null) {
	    return 0;
	}
	else {
	    return 1 + numNodes(r.getLeft()) + numNodes(r.getRight());
	}
    }

    public int height(Node r) {
	if (r == null) {
	    return 0;
	}
	else {
	    return 1 + Math.max(height(r.getLeft()), height(r.getRight()));
	}
    }

  
    
}

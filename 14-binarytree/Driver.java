public class Driver {


    public static void main(String[] args) {
	BinaryTree tr = new BinaryTree(new Node(20));
	Node r = tr.getRoot();
	
	tr.insert(r,5);
	tr.insert(r,21);
	tr.insert(r,6);
	tr.insert(r,3);
	tr.insert(r,2);
	tr.insert(r,19);
	System.out.println(r.getLeft());
	//	System.out.println(r.getRight().getLeft());
    }

}

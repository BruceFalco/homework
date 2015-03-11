import java.util.*;
import java.io.*;


public class Qsort{

    private int[] a,b;
    Random rnd = new Random();
    
    public Qsort(){
	this(20);
    }
    // by default, array size 20
    public Qsort(int n){
	Random r = new Random();
	a = new int[n];
	for (int i = 0; i < a.length; i++) {
	    a[i] = r.nextInt(100);
	}
    }
    // constructors
    // array of n random ints
    
    public String toString(){
	return Arrays.toString(a);
    }
    //toString


    
    public int partition(int[] a, int l, int r) {
	int tmp;
	int pivotIndex=l;
	int pivot = a[pivotIndex];
	// first element in list is made pivot
	tmp = a[r];

	a[r] = a[pivotIndex];
	a[pivotIndex]=tmp;

	// pivot,...,...,last --> last,...,...,pivot
	
	int wall=l;
	int pcount=1;
	for (int i=l;i<r;i++) {
	    if (a[i]<pivot) {
		tmp = a[i];
		a[i]=a[wall];
		a[wall]=tmp;
		wall++;
	    }
	    if (a[i]==pivot)
		pcount++;
	}

	int rwall=wall;

	tmp = a[rwall];
	a[wall]=a[r];
	a[r]=tmp;

	rwall++;

	for (int i=rwall+1;i<=r;i++) {
	    if (a[i]==pivot) {
		tmp = a[rwall];
		a[rwall]=a[i];
		a[i]=tmp;
		rwall++;
	    }
	}


	return (wall+rwall)/2;

    }
    public void qsort(int[] a, int l, int h){
	int pi,pval;

	if (l == h) {
	    return;
	}
	
	pi = partition(a,l,h);
	// returns index of the pivot value after running the entire list
	// through partition
	pval = a[pi];
	// pval is pivot value essentially; calls value of index of pivot value

	//if (k==pi)
	/*
	    return pval;
	    //else if (k > pi)
	    return qselect(a,k,pi+1,h);
	    //else
	    return qselect(a,k,l,pi-1);
	*/   

	// PROBLEM HERE
	if (h < a.length) {
	qsort(a,pi+1,h);
	}
	if (l > 0) {
	qsort(a,l,pi-1);
	}
    }
    // evaluating a smaller and smaller range

  

    public void sort() {
	qsort(a,0,a.length-1);
    }

    public static void main(String[] args) {
	Qsort q = new Qsort();
	System.out.println(q);
	q.sort();
	System.out.println(q);
    }
}

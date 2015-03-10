import java.util.*;
import java.io.*;


public class Qselect{

    private int[] a,b;
    Random rnd = new Random();
    
    public Qselect(){
	this(20);
    }
    // by default, array size 20
    public Qselect(int n){
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
	//int pivotIndex = l+rnd.nextInt(r-l);
	int pivotIndex=l;
	// l is lower index
	int pivot = a[pivotIndex];
	// first element in list is made pivot
	tmp = a[r];
	//last element of our scope of elements
	a[r] = a[pivotIndex];
	a[pivotIndex]=tmp;
	//switching first and last elements; pivot is switched to last
	// pivot,...,...,last --> last,...,...,pivot
	
	int wall=l;
	int pcount=1;
	for (int i=l;i<r;i++) {
	    if (a[i]<pivot) {
		tmp = a[i];
		a[i]=a[wall];
		a[wall]=tmp;
		//for each element from low to r, if element is less than
		// pivot, then it switches with the earliest element l
		wall++;
		// throws the element behind the wall, wall advances
	    }
	    if (a[i]==pivot)
		pcount++;
	    //  how many pivots you have -- how many values equal to pivot
	}
	// now copy over all the pivots
	int rwall=wall;
	// the wall is now dividing the elements lower than pivot (left of wall
	// ) and values equal to or higher than pivot (right of wall)
	// less,less,less, WALL, pivot, higher, pivot, The Pivot
	// wall is on a value either equal to or higher than pivot
	tmp = a[rwall];
	a[wall]=a[r];
	a[r]=tmp;
	// the wall switches with the latest element, which was presumably
	// the pivot
	// so the value of WALL switched with the pivot value
	rwall++;
	// rightwall advances; is now the value after the pivot that has been 
	// placed smackdab in middle of list


	for (int i=rwall+1;i<=r;i++) {
	    if (a[i]==pivot) {
		tmp = a[rwall];
		a[rwall]=a[i];
		a[i]=tmp;
		rwall++;
	    }
	}

	// by now the list is organized thus:
	// [lower, lower, lower, PIVOT (formerly wall), ??pivot, ??higher??,..]
	// so running over remaining elements, that is, elements whose values
	// are higher than or equal to the pivot's,
	// if the element IS equal to the pivot, then swap value of rwall
	// and the element i in question

	// this way, while the list is not sorted completely accurately,
	// the list looks something like this:
	// [lower, lower, lower, pivot, pivot, pivot, higher, higher, higher]


	return (wall+rwall)/2;
	// wall and rwall are max/min locations of the pivots;
	// this essentially returns index/position of the pivot
    }
    public int[] qselect(int[] a, int k, int l, int h){
	int pi,pval;
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

	//?????

 }
    // evaluating a smaller and smaller range


    public int select(int k){
	b = Arrays.copyOf(a,a.length);
	return qselect(b,k,0,b.length-1);
    }
    public static void main(String[] args) {
	Qselect q = new Qselect();
	System.out.println(q);
	for (int i=0;i<5;i++) {
	    System.out.print(q.select(i)+" ");
	}
	System.out.println();
	Arrays.sort(q.a);
	System.out.println(q);
    }
}

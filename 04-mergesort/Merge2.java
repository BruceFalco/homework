import java.util.*;

public class Merge2 {
    
    /*    public int[] one, two;
    public int[] merge;

    public int[] MSort(int[] front, int[] back) {
	int[] ret = new int[front.length() + b.length()];
    */

    public int[] Mergesort(int[] a ){
	if(a.length  == 1){
	    return a;
	}
	else{
	    int[] front = new int[a.length / 2];
	    for(int i = 0; i < front.length ; i ++){
		front[i] = a[i];
	    }
	    int[] back = new int[a.length - front.length];
	    for(int i = 0; i < a.length - front.length; i ++){
		back[i] = a[front.length + i];
	    }
	    return Merge(Mergesort(front),Mergesort(back));
	}
    }

    public int[] Merge(int[] a, int [] b){
	int[] result = new int[a.length + b.length];
	int indA = 0;
	int indB = 0;
	while(indA < a.length && indB < b.length){
	    if(a[indA] < b[indB]){
		result[indA + indB] = a[indA];
		indA ++;
	    }
	    else{
		result[indA + indB] = b[indB];
		indB ++;
	    }
	        
	}
	while(indA < a.length){
	    result[indA + indB] = a[indA];
	    indA ++;
	}
	while(indB < b.length){
	    result[indA + indB] = b[indB];
	    indB ++;
	}
	return result;

    }
    public String printArray(int[] a){
	String result = "";
	for(int i = 0; i < a.length; i ++){
	    result += a[i] + " ";
	}
	return result;
    }

    // placeholder code; must test later -- help from Aaron J

}
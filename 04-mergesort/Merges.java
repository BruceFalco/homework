import java.util.*;

public class Merges {
    
    private ArrayList<Integer> data = new ArrayList<Integer>();
    

    public Merges (ArrayList<Integer> input ) {
	this.data = input;
    }
    //constructor

    public String toString() {
	String s = "[" + data.get(0);
	for ( int i = 1 ; i < data.size() ; i ++ ) {
	    s = s + ", " +  data.get(i);
	}
	s = s + "]";
	return s;
    }

    public ArrayList<Integer> merge(ArrayList<Integer> stuff,
				    ArrayList<Integer> stuff2){
	ArrayList<Integer> newData = new ArrayList<Integer>();
	int i = 0;
	int i2 = 0;
	while ( i < stuff.size() && i2 < stuff2.size() ){
	    if (stuff.get(i) <= stuff2.get(i2)){
		newData.add( stuff.get(i) );
		i++;
	    }
	    else if (stuff2.get(i2) < stuff.get(i)){
		newData.add( stuff2.get(i2) );
		i2++;
	    }
	}
	while ( i < stuff.size() ){
	    newData.add( stuff.get(i) );
	    i++;
	}
	while ( i2 < stuff2.size() ){
	    newData.add( stuff2.get(i2) );
	    i2++;
	}
	return newData;
    }


    public ArrayList<Integer> split(ArrayList<Integer> stuff, int start, int stop){
	ArrayList<Integer> A = new ArrayList<Integer>();
	int i = start;
	int j = stop;
        while (i < j){
	    A.add( stuff.get(i) );
	    i++;
	}
	return A;
    }

    public ArrayList<Integer> mergeSort(ArrayList<Integer> stuff){
	ArrayList<Integer> result = new ArrayList<Integer>();
	if (stuff.size() <= 1){
	    return stuff;
	}
	else {
	    ArrayList<Integer> A = split(stuff, 0, stuff.size()/2);
	    ArrayList<Integer> B = split(stuff, stuff.size()/2, stuff.size() );
	    A = mergeSort(A);
	    B = mergeSort(B);
	    result = merge(A,B);
	}
	return result;
    }

    public ArrayList<Integer> mergeSort(){
	ArrayList<Integer> result = mergeSort( data );
	data = result;
	return data;
    }


    public static void main(String[] args){
	ArrayList<Integer> stuff = new ArrayList<Integer>();
	Random r = new Random();
	for (int i = 0; i < 10; i++){
	    int randomInt = r.nextInt(10);
	    stuff.add(randomInt);
	}
	Merges m = new Merges(stuff);
	System.out.println( m );
	m.mergeSort();
	System.out.println( m );
    }
    // partner: Johnny So
}
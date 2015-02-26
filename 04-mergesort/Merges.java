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
				    ArrayList<Integer> stuff2) {
	/*	ArrayList<Integer> result = new ArrayList<Integer>();
	
	ArrayList<Integer> Ap, Bp;
	
	if (parte.size() > 0 && parte2.size() > 0) {
	    if (parte.get(0) > parte2.get(0) ) {
		Bp = parte;
		Ap = parte2;
		
	    }
	    else {
		Ap = parte;
		Bp = parte2;
	    }

	    for (int i = 0 ; i < Ap.size() ; i++) {
		result.add(Ap.get(i));
	    }
	    for (int i = 0 ; i < Bp.size() ; i ++ ) {
		result.add(Bp.get(i));
	    }
	}
	return result;
	
    } */
		
	
	
	ArrayList<Integer> newData = new ArrayList<Integer>();
	int i = 0;
	int i2 = 0;

	
	while ( i < stuff.size() && i2 < stuff2.size() ){
	    //   while there is still more elements in the stuffs (indices
	    // i and i2)
	    if (stuff.get(i) <= stuff2.get(i2)){
		newData.add( stuff.get(i) );
		i++;
	    }
	    // if i element is less than i2 element, then add i first
	    // repeat
	    else if (stuff2.get(i2) < stuff.get(i)){
		newData.add( stuff2.get(i2) );
		i2++;
	    }
	    // conversely, repeat
	    // like cards, pile on top of each other in order
	}
	while ( i < stuff.size() ){
	    newData.add( stuff.get(i) );
	    i++;
	}
	while ( i2 < stuff2.size() ){
	    newData.add( stuff2.get(i2) );
	    i2++;
	}
	// add rest, other deck
	return newData;
    }
    


    public ArrayList<Integer> split(ArrayList<Integer> stuff,
				    int start, int stop){
	ArrayList<Integer> A = new ArrayList<Integer>();
	int i = start;
	int j = stop;
        while (i < j){
	    A.add( stuff.get(i) );
	    i++;
	}
	return A;
    }

    public ArrayList<Integer> mergeSort(ArrayList<Integer> liste){
	ArrayList<Integer> result = new ArrayList<Integer>();
	if (liste.size() <= 1){
	    return liste;
	}
	else {
	    ArrayList<Integer> A = split(liste, 0, liste.size()/2);
	    ArrayList<Integer> B = split(liste, liste.size()/2, liste.size() );
	    A = mergeSort(A);
	    B = mergeSort(B);
	    result = merge(A,B);
	}
	return result;
    }

    public ArrayList<Integer> mergeSort(){
	data = mergeSort( data );
	return data;
    }


    public static void main(String[] args){
	ArrayList<Integer> list = new ArrayList<Integer>();
	Random r = new Random();
	for (int i = 0; i < 10; i++){
	    int randomInt = r.nextInt(10);
	    list.add(randomInt);
	}
	// random arraylist of ints
	Merges m = new Merges(list);
	System.out.println( m );
	m.mergeSort();
	System.out.println( m );
    }
    // partner: Johnny So
}

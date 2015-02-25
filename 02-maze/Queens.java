import java.io.*;
import java.util.*;

public class Queens {
    
    private char[][] board;
    private int length;
    

    private char empty = '#';
    private char queenie = 'q';
    private char danger = '.';
    // danger = all squares in danger of the placed queenies

    public void delay(int n) {
	try {
	    Thread.sleep(n);
	}
	catch (Exception e) {}
    }

    
    public Queens(int length) {
	this.length = length;
	board = new char[length][length];

	for (int i = 0; i < length; i++) {
	    for (int j = 0; j < length; j++) {
		board[i][j] = empty;
	    }
	}
    }


    public String toString() {
	String s = "\n";
	for (int i = 0; i < length; i++) {
	    for (int j=0 ; j< length; j++) {
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }

    public void solve () {
	int numdot = 0;
	// number of squares that are in danger
	int numq = 0;
	// number of queens on board

	if (numdot + numq == length * length) {
	    System.out.println(this);
	    return;
	}
	
	ArrayList<Integer> badrow = new ArrayList<Integer>();

	//for (
	
    }	


}
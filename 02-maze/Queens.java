import java.io.*;
import java.util.*;

public class Queens {
    
    private char[][] board;
    private int length;
    

    private char empty = '#';
    private char queenie = 'q';
    private char danger = '.';
    // danger = all squares in danger of the placed queenies

    private int numq = 0;
    // num of queens on board
    private int numdot = 0;
    // num of squares in danger

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

	boolean placing = true;
	boolean morespace = true;


	if (numdot + numq == length*length) {
	    placing = false;
	}

	if (placing == false) {
	    System.out.println(this);
	    return;
	}

	// if all squares are filled, return
	for (int i = 0; i < length && placing == true ; i ++ ) {
	    for (int j = 0 ; j < length && placing == true ; j ++ ) {
		if (board[i][j] == empty) {
		    board[i][j] = queenie;
		    placing = false;
		    makebad(i,j);
		    numq = numq + 1;
		}
	    }
	}

	solve();
	
	//	if (placing == false) {
	//  System.out.println(this);
	//  return;
    }
   
	
	
   	

    public void makebad(int h, int k) {
	for (int i = 0 ; i < length; i ++ ) {
	    for (int j = 0 ; j < length; j ++) {
		if ((i == h || k==j || h-k==i-j || h+k == i+j )
		    && board[i][j] == empty ) {
		    board[i][j] = danger;
		    numdot = numdot + 1;
		}
	    }
	}
    }


    public static void main(String[] args) {
	Queens q = new Queens(5);
	System.out.println(q);
	q.solve();
	System.out.println(q);
    }


}
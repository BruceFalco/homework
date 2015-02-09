import java.io.*;
import java.util.*;

public class Recur {
    
    public int fib(int n) {
	if (n <= 1) {
	    return n;
	}
	else {
	    return fib(n-1) + fib(n-2);
	}
    }

    // adapted from Scheme

    public int len(String s) {
	if (s.equals("")) {
	    return 0;
	}
	else {
	    return 1 + len(s.substring(1));
	}
    }

    public int count(String s, char c) {
	if (s.equals("")) {
	    return 0;
	}
	else {
	    if (s.charAt(0) == (c)) {
		return 1+ count(s.substring(1),c);
	    }
	    else {
		return count(s.substring(1),c);
	    }
	}
    }

    public static void main(String[] str) {
	Recur r = new Recur();
	
	System.out.println(r.fib(2));
	System.out.println(r.fib(3));
	System.out.println(r.fib(4));
	System.out.println(r.fib(5) + "\n");

	System.out.println(r.len("four") + "four");
	System.out.println(r.len("abcdef") + "oughtta be six");

	System.out.println(r.count("",'c'));
	System.out.println(r.count("four",'n'));
	System.out.println(r.count("impeccable",'e'));
    }
}
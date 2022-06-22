package com.test.programs;

public class Main {

    int m,n;

    public static int gcd (int m, int n) {
        int r;
        if (n > m) {
            r = m;
            m = n;
            n = r;
        }
        r = m % n;
        while (r != 0) {
            m = n;
            n = r;
            r = m % n;
        }
        return n;
    }
    public static void main(String[] args) {
	// write your code here
        while ()
        gcd()

    }
}

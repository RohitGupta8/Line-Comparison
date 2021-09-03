package com.bridgelabz.linecomparison;

public class Main {

    public static void main ( String[] args ) {
        LineComparison lineComparison = new LineComparison ();
        System.out.println ( "*********************************************\n    Welcome To Line Comparison Computation \n*********************************************" );
        System.out.println ( "\nEnter line 1 coordinates" );
        int line1 = lineComparison.comparison ();
        System.out.println ( "\nEnter line 2 coordinates" );
        int line2 = lineComparison.comparison ();
        lineComparison.equal ( line1,line2 );
        lineComparison.compare ( line1,line2 );
    }
}

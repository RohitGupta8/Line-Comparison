package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {
    public int comparison () {
        double x1, x2, y1, y2;

        double dis;

        Scanner sc = new Scanner ( System.in );

        System.out.print ( "enter x1 point: " );

        x1 = sc.nextInt ();

        System.out.print ( "enter y1 point: " );

        y1 = sc.nextInt ();

        System.out.print ( "enter x2 point: " );

        x2 = sc.nextInt ();

        System.out.print ( "enter y2 point: " );

        y2 = sc.nextInt ();

        dis = Math.sqrt ( (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) );

        System.out.println ( "distance between" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")===>" + dis );

        return (int) dis;
    }

    public void equal ( double line1, double line2 ) {
        if (line1 == line2) {
            System.out.println ( "\nBoth lines are Equal" );
        } else {
            System.out.println ("\nLines are Not Equal");
        }
    }

}

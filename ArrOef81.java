package be.vdab;

import java.util.Scanner;

public class ArrOef81 {
    public static void main(String[] args) {
        /*
        Write a method that returns the sum of all the elements
        in a specified row in a matrix using the following header:
        Write a test program that reads a 3-by-4 matrix and displays
        the sum of each row.
        Here is a sample run:
        Enter a 3−by−4 matrix row by row:
        1.5 2 3 4
        5.5 6 7 8
        9.5 1 3 1
        Sum of the elements at row 0 is 10.5
        Sum of the elements at row 1 is 26.5
        Sum of the elements at row 2 is 14.5
         */
        System.out.println("Enter a 3 by 4 matrix row by row :");
        Scanner input = new Scanner(System.in);

        double[][] arr2D = new double[3][4];

        // Fill array
        for (int i = 0; i < arr2D.length ; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                arr2D[i][j] = input.nextDouble();
            }
        }

        // display sums
        double sumrows = 0;
        for (int i = 0; i < arr2D.length ; i++) {
            sumrows = sumRow(arr2D,i);
            System.out.println("Sum of the elements at row " + i + " is " + sumrows);
        }
    }

    public static double sumRow(double[][] m, int rowIndex){
        double sumrw = 0;

        for (int i = 0; i < m[rowIndex].length ; i++) {
            sumrw += m[rowIndex][i];
        }
        return sumrw;
    }
}

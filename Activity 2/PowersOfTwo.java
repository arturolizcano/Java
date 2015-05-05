package paquetedemo1;

/*************************************************************************
 *  Compilation:  javac PowersOfTwo.java
 *  Execution:    java PowersOfTwo N
 *  
 *  This program takes a command-line argument N and prints a table of
 *  the powers of 2 that are less than or equal to 2^N.
 *
 *  % java PowersOfTwo 5
 *  0 1
 *  1 2
 *  2 4
 *  3 8
 *  4 16
 *  5 32
 *
 *  % java PowersOfTwo 6
 *  0 1
 *  1 2
 *  2 4
 *  3 8
 *  4 16
 *  5 32
 *  6 64
 *
 *  Remarks
 *  ------------
 *  Only works if 0 <= N < 31 since 2^31 overflows an int.
 *
 *************************************************************************/

public class PowersOfTwo {
    public static void main(String[] args) {

        int N = 50;
        int i = 0;                // count from 0 to N
        long powerOfTwo = 1;       // change int to long for support long integers
        // repeat until i equals N
        while (i <= N) {
            System.out.println(i + " " + powerOfTwo);   // print out the power of two
            powerOfTwo = 2 * powerOfTwo;                // double to get the next one
            i = i + 1;
        }

    }
}
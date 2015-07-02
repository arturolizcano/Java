package paquetedemo1;

/*************************************************************************
 *  Compilation:  javac Dedup.java
 *  Execution:    java Dedup < input.txt
 *
 *  Reads a sequence of strings from standard input and print them
 *  to standard output with all duplicates removed (in sorted order).
 *
 *  %  java Dedup < itwas.txt 
 *  best
 *  it
 *  of
 *  the
 *  times
 *  was
 *
 *************************************************************************/

import java.util.Arrays;

public class Dedup {


    public static void main(String[] args) {
    	  In obj = new In(args[0]);
        String s = obj.readAll();
        String[] words = s.split("\\s+");

        Arrays.sort(words);

        for (int i = 0; i < words.length; i++) {
            if (i == 0 || !words[i].equals(words[i-1]))
                StdOut.println(words[i]);
        }
    }
}
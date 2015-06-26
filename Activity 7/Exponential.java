package paquetedemo1;

/*************************************************************************
 *  Compilation:  javac Exponential.java
 *  Execution:    java Exponential N
 *
 *  A program with exponential running time. Read in N long integers
 *  and find the subset whose sum is closest to 0.
 *
 *  Limitations
 *  -----------
 *     - we assume no sum of N integers will overflow a long
 *
 *************************************************************************/

public class Exponential {

    public static void main(String[] args) { 
        int N =3;// Integer.parseInt(args[0]);

        // read in input data
        long[] a = new long[N];
        for (int i = 0; i < N; i++)
            a[i] = StdIn.readLong();

        // find subset closest to 0
        long best = Long.MAX_VALUE;
        for (int n = 1; n < (1 << N); n++)  {
            long sum = 0;
            for (int i = 0; i < N; i++) 
                if (((n >> i) & 1) == 1) sum = sum + a[i];
            if (Math.abs(sum) < Math.abs(best)) best = sum;
        }
        System.out.println(best);


    }

}


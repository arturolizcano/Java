package paquetedemo1;

/*************************************************************************
 *  Compilation:  javac GoldenRatio.java
 *  Execution:    java GoldenRatio N
 *  
 *  Computes an approximation to the golden ratio using the recursive
 *  formula f(0) = 1, f(n) = 1 + 1 / f(n-1) if n > 0.
 *
 *  % java GoldenRatio 5
 *  1.625
 *
 *  % java GoldenRatio 10
 *  1.6179775280898876
 *
 *  % java GoldenRatio 20
 *  1.618033985017358
 *
 *  % java GoldenRatio 30
 *  1.6180339887496482
 *
 *************************************************************************/

class GoldenRatio {
	
   public static double golden(int n) {
       if (n == 0) return 1;
       return 1.0 + 1.0 / golden(n-1);
   }

   private static int loop(int n) {

       if(n < 2) return n;

       int previous = 0;
       int next = 1;
       for(int i = 1; i < n; i++) {

          int save = next; 
          next += previous;
          previous = save;
      }
       return next;

   }
   public static void main(String[] args) {
	   
	   for(int N = 1; N<15; N++){
      System.out.println(golden(N));
	   }   

	   System.out.println("---");
	   int prev = 0;
	   for(int n = 0; n < 15; n++) {
           int f = loop(n);
           System.out.println();
           if(prev != 0) System.out.print( Double.valueOf(f)/Double.valueOf(prev));
           prev = f;
       }
   }

}




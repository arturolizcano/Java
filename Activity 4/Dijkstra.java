package paquetedemo1;

public class Dijkstra {
   
    
    public static double Dijkstras (double n)
    {
         if( n < 2 )
              return n;

         double half = ( n % 2 == 0 ) ? n / 2 : ( n / 2 ) + 1;

         double p1 = Dijkstras( half );
         double p2 = Dijkstras( half - 1 );
         double result = 0;

         if( n % 2 == 0 )
              result = ( 2 * p2 + p1 ) * p1;
         else
              result = Math.pow( p2, 2 ) + Math.pow( p1, 2 );

         return result;
    } 
    
    
   public static void main(String[] args) {    		
       int N = 5;//Integer.parseInt(args[0]);
       for (int i = 0; i <= N; i++){        	 
           System.out.println(i + ": " + Dijkstras(i));
       
       }
         
   }

}


package paquetedemo1;


public class Tribonacci {
    public static long fib(int n) {
    	 if (n <= 1) return 0;
    	if (n <= 2) return 1;
        else return fib(n-1) + fib(n-2) + fib(n-3);
    }

    public static void main(String[] args) {    	
    	
    	long tini=0; //tiempo inicial
        double ttot=0; // tiempo total
        tini=System.nanoTime();
		
        int N = 12;//Integer.parseInt(args[0]);
        for (int i = 0; i <= N; i++){        	 
            System.out.print(i + ": " + fib(i));
            ttot=Double.valueOf(System.nanoTime()-tini)*0.000000001;
            System.out.println(" -  "+ttot+" segundos.");
        }
          
    }

}


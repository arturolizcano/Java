package paquetedemo1;

public class Point2 {
	 
	     private final double x;    // x-coordinate 
	     private final double y;    // y-coordinate 
	     
	     // random point 
	     public Point2() { 
	         x = Math.random(); 
	         y = Math.random(); 
	     } 
	 
	
	     // point initialized from parameters 
	     public Point2(double x, double y) { 
	         this.x = x; 
	         this.y = y; 
	     } 
	 
		     // accessor methods 
	     public double x() { return x; } 
	     public double y() { return y; } 
	     public double r() { return Math.sqrt(x*x + y*y); } 
	     public double theta() { return Math.atan2(y, x); } 
	 
	 
	     // Euclidean distance between this point and that point 
	     public double distanceTo(Point2 that) { 
	         double dx = this.x - that.x; 
	         double dy = this.y - that.y; 
	         return Math.sqrt(dx*dx + dy*dy); 
	     } 
	 
	 
	     // return a string representation of this point 
	     public String toString() { 
	         return "(" + x + ", " + y + ")"; 
	     }  
	 
	 
	 
	 
	 
	 
	     // test client 
	     public static void main(String[] args) { 
	         Point2 p = new Point2(); 
	         System.out.println("p  = " + p); 
	         System.out.println("   x     = " + p.x()); 
	         System.out.println("   y     = " + p.y()); 
	         System.out.println("   r     = " + p.r()); 
	         System.out.println("   theta = " + p.theta()); 
	         System.out.println(); 
	 
	 
	         Point2 q = new Point2(0.5, 0.5); 
	         System.out.println("q  = " + q); 
	         System.out.println("dist(p, q) = " + p.distanceTo(q)); 
	     } 
	 } 



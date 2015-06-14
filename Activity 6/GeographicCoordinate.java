package paquetedemo1;

public class GeographicCoordinate { 
 	 private int degrees; 
     private int minutes; 
     private int seconds;  
     private boolean sign; 
      
     public GeographicCoordinate(int degrees, int minutes, int seconds, boolean sign) {         
        if (sign) 
         	this.degrees = degrees * -1; 
     	 
         this.minutes = minutes; 
         this.seconds = seconds;        
     } 
      
     public String toString() {        

     	if (sign) {
     		degrees = degrees * -1; 
     	}
     	return "(" + degrees + "° " + minutes + "' " + seconds + "'')"; 
     } 
      
     public static void main(String[] args) {    
     	GeographicCoordinate gc1 = new GeographicCoordinate(107, 15, 30, false); 
     	System.out.println("Geographic location 1: " + gc1.toString()); 
     	 
     	GeographicCoordinate gc2 = new GeographicCoordinate(107, 15, 30, true); 
     	System.out.println("Geographic location 2: " + gc2.toString()); 
     } 
 } 

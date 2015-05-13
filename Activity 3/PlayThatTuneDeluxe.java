package paquetedemo1;

/*************************************************************************
 *  Compilation:  javac PlayThatTuneDeluxe.java
 *  Execution:    java PlayThatTuneDeluxe < data.txt
 *
 *  % java PlayThatTuneDeluxe 0.5 < elise.txt
 *
 *  Data files
 *  ----------
 *  http://www.cs.princeton.edu/introcs/21function/elise.txt
 *  http://www.cs.princeton.edu/introcs/21function/freebird.txt
 *  http://www.cs.princeton.edu/introcs/21function/Ascale.txt
 *  http://www.cs.princeton.edu/introcs/21function/National_Anthem.txt
 *  http://www.cs.princeton.edu/introcs/21function/looney.txt
 *  http://www.cs.princeton.edu/introcs/21function/StairwayToHeaven.txt
 *  http://www.cs.princeton.edu/introcs/21function/entertainer.txt
 *  http://www.cs.princeton.edu/introcs/21function/old-nassau.txt
 *  http://www.cs.princeton.edu/introcs/21function/arabesque.txt
 *  http://www.cs.princeton.edu/introcs/21function/firstcut.txt
 *  http://www.cs.princeton.edu/introcs/21function/tomsdiner.txt
 *  http://www.cs.princeton.edu/introcs/21function/portal.txt
 *
 *************************************************************************/

public class PlayThatTuneDeluxe {

    // take weighted sum of two arrays
    public static double[] sum(double[] a, double[] b, double awt, double bwt) {

        // precondition: arrays have the same length
        assert (a.length == b.length);

        // compute the weighted sum
        double[] c = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i]*awt + b[i]*bwt;
        }
        return c;
    } 

    // create a pure tone of the given frequency for the given duration
    public static double[] tone(double hz, double duration) { 
        int N = (int) (StdAudio.SAMPLE_RATE * duration);
        double[] a = new double[N+1];
        for (int i = 0; i <= N; i++) {
            a[i] = Math.sin(2 * Math.PI * i * hz / StdAudio.SAMPLE_RATE);
        }
        return a; 
    } 

    // create a note with harmonics of of the given pitch, where 0 = concert A
    public static double[] note(int pitch, double t) {
        double hz = 440.0 * Math.pow(2, pitch / 12.0);
        double[] a  = tone(hz, t);
        double[] hi = tone(2*hz, t);
        double[] lo = tone(hz/2, t);
        double[] n14 = tone(hz/4, t);
        double[] n18 = tone(hz/8, t);
        double[] h  = sum(hi, lo, .5, .5);
        double[] n  = sum(n14, n18, .5, .5);
        double[] nt  = sum(h, n, .5, .5);
        return sum(a, nt, .5, .5);
    }


    // read in notes from standard input and play them on standard audio
    public static void main(String[] args) {
    	
        // read in pitch-duration pairs from standard input
    	int i = 0;
        while (args[i]!=null) {
        	try{
        	System.out.println(args[i]+ " - "+args[i+1]);
            double[] a = note(Integer.parseInt(args[i]), Double.parseDouble(args[i+1]));
            StdAudio.play(a);         
            i=i+2;
            }        	
        	catch(ArrayIndexOutOfBoundsException excepcion)
        	{System.exit(0);
        	}
        
        }
        // needed to terminate program - known Java bug
        
    } 
} 

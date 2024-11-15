// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int num = Integer.parseInt(args[0]);
		int hunds = num/100 ;
		int tens = (num-hunds*100)/10;
		int ones = (num-hunds*100 -tens*10);
		System.out.println(hunds+" hundreds, "+tens+" tens, and "+ones+" ones.");
	}
}

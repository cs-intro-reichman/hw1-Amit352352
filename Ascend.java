// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a = (int) (lim* Math.random());
		int b = (int) (lim* Math.random());
		int c = (int) (lim* Math.random());
		int min = Math.min(c, Math.min(a,b));
		int max = Math.max(c, Math.max(a,b));
		int mid = a + b + c - min -max;a
		System.out.println(a+" "+b+" "+c+" min is "+min);
	}
}
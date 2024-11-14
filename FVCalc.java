
public class FVCalc {
	public static void main(String[] args){
		int curretValue = Integer.parseInt(args[0])  ;
		int annualinterest = Integer.parseInt(args[1]);
		int yearn =Integer.parseInt(args[2]);
		double rate = (1+ (double) annualinterest/100);
		double x = Math.pow(rate, (double) yearn);
		double futurevalue  =  (curretValue*x); 

		System.out.println("After "+yearn+" years, $"+curretValue+" saved at "+annualinterest+"% will yield $"+(int) futurevalue);


	}
}
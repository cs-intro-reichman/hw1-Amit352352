
public class FVCalc {
	public static void main(String[] args){
		int curretValue = Integer.parseInt(args[0])  ;
		double annualinterest = Double.parseDouble(args[1]);
		int yearn =Integer.parseInt(args[2]);
		int annualinterest2 = (int) annualinterest ;
		double rate = (1+ (double) annualinterest2/100);
		double x = Math.pow(rate, (double) yearn);
		double futurevalue  =  (curretValue*x); 

		System.out.println("After "+yearn+" years, $"+curretValue+" saved at "+annualinterest2+"% will yield $"+(int) futurevalue);


	}
}

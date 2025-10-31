// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		
	
		
		int investedSum = Integer.parseInt(args[0]);
		String annualinterestRate = args[1];
		int years = Integer.parseInt(args[2]);

		double rate = Double.parseDouble(annualinterestRate) / 100;
		double floatingPointDoubleRate = Double.parseDouble(annualinterestRate);


		double futureValue = investedSum * Math.pow(1 + rate,years);


		System.out.println("After " + years + " years, " + "$" + investedSum + " saved at " + floatingPointDoubleRate + "%" + " will yield " + "$" + ((int) futureValue) );

	}
}
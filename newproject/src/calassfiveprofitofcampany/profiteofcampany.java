package calassfiveprofitofcampany;

public class profiteofcampany {

	public static void main(String[] args) {
		
		profitofcompany(10000, 6000, " january");
		profitofcompany(90000,  60000,  " february");
		profitofcompany(80000,  28000,  " march");
		profitofcompany(70000,  25000,  " april");
		profitofcompany(60000,  40000,  " may");
		profitofcompany(50000,  25000,  " june");
		profitofcompany(40000,  20000,  " july");
		profitofcompany(30000,  9000,  " august");
		profitofcompany(20000,  8000,  " september");
		profitofcompany(10000,  6000,  " october");
		profitofcompany(9000,  3000,  " november");
		profitofcompany(8000,  4000,  " december");
		
	
	}
		
		public static void profitofcompany (int income, int expense, String month) {
			int profit= income-expense;
			int netprofit= profit-1000;
			
			System.out.println("this is the profit of the company per month " + month + " = " + profit);
			System.out.println("this is the net profit"+netprofit);
		}

	}



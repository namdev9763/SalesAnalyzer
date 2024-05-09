package salesAnalysis;

public class SalesAnalyzer 
{
	private double [] sales;
	public SalesAnalyzer(int numberOfDays)
	{
		this.sales=new double[numberOfDays];
	}
	// For Add Sales With days
	public void addSale(double amount, int day)
	{
		if(day<0)
		{
			throw new IllegalArgumentException("Error: Invalid Day");
		}
		if(amount<0)
		{
			throw new IllegalArgumentException("Error: Invalid Amount");
		}
		sales[day]=amount;	
	}
	
	// For calculate total Salary
	public double calculateTotalSales()
	{
		double totalSalary=0.0;
		for(double sale: sales)
		{
			totalSalary+=sale;
		}
		return totalSalary;
	}
	// For calculate Average Daily Sales
	public double calculateAverageDailySales()
	{
		double averageSales=calculateTotalSales()/sales.length;
		return averageSales;
	}
	// Finding  in which day highest sales is happen 
	public String findBestSalesDay()
	{
		int bestDayIndex=0;
		double bestSales=Double.MIN_VALUE;
		for(int i=0;i<sales.length;i++)
		{
			if(sales[i]>bestSales)
			{
				bestSales=sales[i];
				bestDayIndex=i;
			}
		}
		System.out.println("Best Sales Amount "+bestSales);
		switch (bestDayIndex%8) 
		{
		case 0: return "Monday";
        case 1: return "Tuesday";
        case 2: return "Wednesday";
        case 3: return "Thursday";
        case 4: return "Friday";
        case 5: return "Saturday";
        case 6: return "Sunday";
        default: throw new IllegalArgumentException("Error: The Day is No Present");
		}
		
	}
	// Finding  in which day lowest sales is happen 
	public String findWorstSalesDay()
	{
		int worstSalesIndex=0;
		double worstSales=Double.MAX_VALUE;
		for(int i=0;i<sales.length;i++)
		{
			if(sales[i]<worstSales)
			{
				worstSales=sales[i];
				worstSalesIndex=i;
			}
		}
		System.out.println("Worst Sales Amount: "+worstSales);
		switch (worstSalesIndex%8) 
		{
		case 0: return "Monday";
        case 1: return "Tuesday";
        case 2: return "Wednesday";
        case 3: return "Thursday";
        case 4: return "Friday";
        case 5: return "Saturday";
        case 6: return "Sunday";
        default: throw new IllegalArgumentException("Error: The Day is No Present");
		}
	}
	
}

package salesAnalysis;

public class DisplayReport
{
	public void displaySalesReport(SalesAnalyzer analyzer)
	{
		 	System.out.println("Total Sales: $" +analyzer.calculateTotalSales());
	        System.out.println("Average Daily Sales: $" + analyzer.calculateAverageDailySales());
	        System.out.println("Best Sales Day: " +analyzer.findBestSalesDay());
	        System.out.println("Worst Sales Day: " +analyzer.findWorstSalesDay());
	}

}

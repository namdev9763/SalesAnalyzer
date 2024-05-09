package salesAnalysis;

public class Sales
{
	public static void main(String[] args) 
	{
		//Making Object For Set Days and Set Amount as well as Index Days
		SalesAnalyzer salesAnalyzer=new SalesAnalyzer(3);
		salesAnalyzer.addSale(1000.0 ,0);
		salesAnalyzer.addSale(500.0 ,1);
		salesAnalyzer.addSale(100.0 ,2);

		// Making Object for Calling All Method
		DisplayReport displayReport=new DisplayReport();
		displayReport.displaySalesReport(salesAnalyzer);
	}
}

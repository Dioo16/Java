
public class currencyCorverter {
	private static int quantity;
	private static double price;
	
	
	public double Conversion(int quantity, double price){
		
		return quantity * price;
		
	}
	
	public double withIOF(int quantity, double price) {
		
		return (quantity * price * 0.06) + quantity * price;
	}

	
	
	
}

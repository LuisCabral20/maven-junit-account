package accountingSystem;

/**
 * Methods that calculate equity, income and inventory
 */
public class AccountCalculations {
	
	/**
	 * Default no argument constructor  
	 */
	public AccountCalculations() {
		
	}
	
	/**
	 * Calculates the equity by subtracting liabilities from assets.
	 * @param account : Object of the Account class
	 * @return double variable representing the equity
	 */
	public double calculateEquity(Account account) {
		return account.getAssets() - account.getLiabilities();
	}
	
	/**
	 * Calculates the income by subtracting the expenses from the revenue
	 * @param account : Object of the Account class
	 * @return double variable representing the income
	 */
	public double calculateIncome(Account account) {
		return account.getRevenue() - account.getExpenses();
	}
	
	/**
	 * Calculates the total inventory by adding the beginning inventory and purchases, then subtracting
	 * the cost of sale from that total
	 * @param account : Object of the Account class
	 * @return double variable representing the total inventory
	 */
	public double calculateInvertory(Account account) {
		return (account.getBeginningInventory() + account.getPurchases()) - account.getCostOfSales();
	}
}

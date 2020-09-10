package accountingSystem;

/**
 *Methods that return String information about a businesses account
 */
public class AccountReturnStrings {
	
	// Object of the AccountCalculations class
	AccountCalculations cal = new AccountCalculations();
	
	/**
	 * Default no argument constructor
	 */
	public AccountReturnStrings() {
		
	}
	
	/**
	 * Creates a string holding the businessName, assets, liabilities, revenue, expenses, beginningInventory,
	 * purchases and costOfSales.
	 * @param account : Object of the Account class
	 * @return A string holding basic account information
	 */
	public String printBasicAccountInformation(Account account) {
		return "|| " + account.getBusinessName() + " || " + account.getAssets() + 
			   " || " + account.getLiabilities() + " || " + account.getRevenue() +
			   " || " + account.getExpenses() + " || " + account.getBeginningInventory() +
			   " || " + account.getPurchases() + " || " + account.getCostOfSales() +
			   " ||" ;
	}
	
	/**
	 * Creates a string holding the equity, income and inventory
	 * @param account : Object of the account class
	 * @return String holding advanced account information
	 */
	public String printCalculationInformation(Account account) {		
		return  "|| " + cal.calculateEquity(account) 
				+ " || " + cal.calculateIncome(account) 
				+ " || " + cal.calculateInvertory(account) + " ||";
	}
	
	/**
	 * Creates a string holding all the account information
	 * @param account : Object of the Account class
	 * @return String holding all the account information
	 */
	public String printAllAccountInformation(Account account) {
		String stringOne = "|| " + account.getBusinessName() + " || " + account.getAssets() + 
				   " || " + account.getLiabilities() + " || " + account.getRevenue() +
				   " || " + account.getExpenses() + " || " + account.getBeginningInventory() +
				   " || " + account.getPurchases() + " || " + account.getCostOfSales();
		String stringTwo = " || " + cal.calculateEquity(account) 
		+ " || " + cal.calculateIncome(account) 
		+ " || " + cal.calculateInvertory(account) + " ||";
		return stringOne + stringTwo;
	}
}

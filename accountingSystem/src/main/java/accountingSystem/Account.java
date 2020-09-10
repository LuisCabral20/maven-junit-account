package accountingSystem;
/**************************************************************
* Name        : Maven and JUnit Accounting
* Author      : Luis Cabral
* Created     : 09/09/2020
* Course      : CIS 175 Java 2
* Version     : 1.0
* OS          : Windows 10
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description : This  project calculates an accounts equity, income and inventory/profit based on accounting variables like assets and revenue. 
* 				The project also utilizes Maven and JUnit Testing by creating multiple JunitTestCases and one JUnitTestSuit; that test the methods used to calculate the 
* 				equity, income and inventory/profit and the methods to return Strings holding account information.
*               Input:  assets				-Total of all owned assets
*						liabilities			-Total of all debt or financial obligations
*						revenue				-Total amount of sales
*						expenses			-Total of all money spent on business
*						beginningInventory	-Book value of a company's inventory at the start of an accounting period
*						purchases			-Total spent on merchandise for resale
*						costOfSales			-Total spent on producing the goods
*               Output: equity				-The money value of a property
*               		profit				-Total amount after revenue exceeds the expenses
*               		inventory			-Total price of goods available for sale 
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
***************************************************************/
public class Account {

	// Variables
	private String businessName;
	private double assets;
	private double liabilities;
	private double revenue;
	private double expenses;
	private double beginningInventory;
	private double purchases;
	private double costOfSales;
	
	/**
	 * Default constructor that takes no arguments.
	 */
	public Account() {
		
	}
	
	/**
	 * Constructor that takes in a string holding the name of a business and sets it
	 * to businessName.
	 * @param businessName - name of the business
	 */
	public Account(String businessName) {
		this.businessName = businessName;
	}
	
	/**
	 * Gets the businessName variable
	 * @return businessName
	 */
	public String getBusinessName() {
		return businessName;
	}

	/**
	 * Sets the businessName variable
	 * @param businessName : String that businessName will be set to
	 */
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	/**
	 * Gets the assets variable
	 * @return assets
	 */
	public double getAssets() {
		return assets;
	}

	/**
	 * Sets the assets
	 * @param assets : new double for assets variable
	 */
	public void setAssets(double assets) {
		this.assets = assets;
	}

	/**
	 * Gets the liabilities variable
	 * @return liabilities
	 */
	public double getLiabilities() {
		return liabilities;
	}

	/**
	 * Sets the liabilities variable
	 * @param liabilities : new double value for liabilities variable 
	 */
	public void setLiabilities(double liabilities) {
		this.liabilities = liabilities;
	}

	/**
	 * Gets the revenue variable
	 * @return revenue 
	 */
	public double getRevenue() {
		return revenue;
	}
	
	/**
	 * Sets the revenue variable
	 * @param revenue : new value of the revenue variable
	 */
	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}

	/**
	 * Gets the expenses variable
	 * @return expenses
	 */
	public double getExpenses() {
		return expenses;
	}

	/**
	 * Sets the expenses variable
	 * @param expenses : double holding the new value of the expenses
	 */
	public void setExpenses(double expenses) {
		this.expenses = expenses;
	}

	/**
	 * Gets the beginningInventory variable
	 * @return beginningInventory
	 */
	public double getBeginningInventory() {
		return beginningInventory;
	}

	/**
	 * Sets the beginningInventory variable
	 * @param beginningInventory : double holding the value of beginningInventory
	 */
	public void setBeginningInventory(double beginningInventory) {
		this.beginningInventory = beginningInventory;
	}

	/**
	 * Gets the purchases variable
	 * @return purchases
	 */ 
	public double getPurchases() {
		return purchases;
	}

	/**
	 * Sets the purchases variable
	 * @param purchases : double holding the new value of purchases
	 */
	public void setPurchases(double purchases) {
		this.purchases = purchases;
	}

	/**
	 * Returns the costOfSales variable
	 * @return costOfSales
	 */
	public double getCostOfSales() {
		return costOfSales;
	}

	/**
	 * Sets the costOfSales variable
	 * @param costOfSales : double holding the new value of costOfSales
	 */
	public void setCostOfSales(double costOfSales) {
		this.costOfSales = costOfSales;
	}
	
}

package accountingSystem;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Testing the calculation methods from the AccountCalculations class
 */
public class TestAccountingCalculations {
	Account account = new Account("Fisher");
	AccountCalculations calculations = new AccountCalculations();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateEquity() {
		System.out.println("Inside testCalculateEquity");
		account.setAssets(55000);
		account.setLiabilities(22000);
		double equity = calculations.calculateEquity(account);
		assertEquals(33000, equity, 0.0);
	}
	
	@Test
	public void testCalculateIncome() {
		System.out.println("Inside testCalculateIncome");
		account.setRevenue(75000);
		account.setExpenses(67438);
		double income = calculations.calculateIncome(account);
		assertEquals(7562, income, 0.0);
	}
	
	@Test
	public void testCalculateInventory() {
		System.out.println("Inside testCalculateInventory");
		account.setBeginningInventory(650);
		account.setPurchases(155);
		account.setCostOfSales(600);
		double inventory = calculations.calculateInvertory(account);
		assertTrue(inventory == 205);
	}

}

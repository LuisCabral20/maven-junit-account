package accountingSystem;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

/**
*Testing the string functions from AccountReturnStrings class
 */
public class TestAccountReturnStrings {
	Account account = new Account("Mikes");
	AccountReturnStrings returnStrings = new AccountReturnStrings();

	@Before
	public void setUp() throws Exception {
		account.setBusinessName("Mike Fishing");
		account.setAssets(350);
		account.setLiabilities(200);
		account.setRevenue(2000);
		account.setExpenses(1589);
		account.setBeginningInventory(469);
		account.setPurchases(75);
		account.setCostOfSales(325);
	}

	@Test
	public void testPrintBasicAccountInformation() {
		System.out.println("Inside testPrintBasicAccountInformation()");
		String stringOne = "|| Mike Fishing || 350.0 || 200.0 || 2000.0 " +
						   "|| 1589.0 || 469.0 || 75.0 || 325.0 ||";
		String stringTwo = returnStrings.printBasicAccountInformation(account);
		assertTrue(stringOne.equals(stringTwo));
		assertNotNull(stringTwo);
	}
	
	@Test
	public void testPrintCalculationInformation() {
		System.out.println("Inside testPrintCalculationInformation()");
		String stringOne = "|| 150.0 || 411.0 || 219.0 ||";
		String stringTwo = returnStrings.printCalculationInformation(account);
		assertFalse(!stringOne.equals(stringTwo));
	}
	
	@Test
	public void testPrintAllAccountInformation() {
		System.out.println("Inside testPrintAllAccountInformation()");
		String stringOne = "|| Mike Fishing || 350.0 || 200.0 || 2000.0 || 1589.0 " +
						   "|| 469.0 || 75.0 || 325.0 || 150.0 || 411.0 || 219.0 ||";
		String stringTwo = returnStrings.printAllAccountInformation(account);
		assertThat(stringOne, is(stringTwo));
	}

}

package accountingSystem;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
* Test Suit that runs both the TestAccountReturnStrings and TestAccountingCalculations classes
 */
@RunWith(Suite.class)
@SuiteClasses({ TestAccountingCalculations.class, TestAccountReturnStrings.class })
public class AllTests {

}

package runners;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.BookingCurrencyTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({BookingCurrencyTest.class})
public class JUnitTestRunner{

}
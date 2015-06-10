import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSavingsAccount {
	private SavingsAccount savings;

	@Before
	public void createSavingsAccount() throws DodgyNameException {
		savings = new SavingsAccount("Bradley", 10);
	}

	@Test
	public void testThatAddInterestGivesCorrectAmount() {
		savings.addInterest();
		assertEquals(14, savings.getBalance(), 0.001);

	}

	@Test
	public void testThatWithdrawRemovesMoneyFromAccount() {
		savings.withdraw(5);
		assertEquals(5, savings.getBalance(), 0.001);
	}
	
	@Test(expected=DodgyNameException.class)
	public void testThatFingersCannotOpenAnAccount() throws Exception {
		new SavingsAccount("Fingers", 500);
	}
	
	@Test(expected=DodgyNameException.class)
	public void testThatAnAccountCannotHaveItsNameChangedToFingers() throws Exception {
		savings.setAccountName("Fingers");
	}

}
import java.util.ArrayList;
import java.util.List;

public class TestInterfaces {
	static List<Account> accounts = new ArrayList<>();

	public static void main(String[] args) throws DodgyNameException {
		accounts.add(new SavingsAccount("Alex", 4));
		accounts.add(new CurrentAccount("Abigail", 6));
		accounts.add(new SavingsAccount("Bradley", 400));
		accounts.add(new SavingsAccount("Mannan", 600));
		accounts.add(new SavingsAccount("Tarran", 200));
		accounts.add(new SavingsAccount("Konstantinos", 100));

		for (Account account : accounts) {
			System.out.println(account.getDetails());
		}
	}

}
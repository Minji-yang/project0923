package project0923;

class Account{
	int balance;
	int deposit(int amount) {
		balance= balance+amount;
		return balance;
	}
}

public class Application0923 {
	static Account account1;

	public static void main(String[] args) {
		
		account1=new Account();
		account1.balance=5000;
		account1.deposit(5000);
		System.out.println("Balance="+account1.balance);

	}

}

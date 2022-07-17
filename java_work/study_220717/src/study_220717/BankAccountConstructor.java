package study_220717;
class BankAccount{
	String accNumber;
	String ssNumber;
	int balance = 0;
	
	public BankAccount (String acc, String ss, int bal) {
		accNumber = acc;
		ssNumber = ss;
		balance = bal;
	}
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public int checkMyBalance() {
		System.out.println("계좌번호: "+accNumber);
		System.out.println("주민번호: "+ssNumber);
		System.out.println("잔액: "+ balance +'\n' );
		return balance;
	}
}

public class BankAccountConstructor {
	public static void main(String[] args) {
		BankAccount Yoon = new BankAccount("12-34-56", "990990-9000009", 10000);
		BankAccount Park = new BankAccount("23-45-67","880880-8000008", 10000);
		
		Yoon.deposit(5000);
		Yoon.withdraw(2000);
		Yoon.checkMyBalance();
		Park.deposit(3000);
		Park.withdraw(2000);
		Park.checkMyBalance();
	}

}

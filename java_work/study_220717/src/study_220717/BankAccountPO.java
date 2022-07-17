package study_220717;

public class BankAccountPO {
	static int balance = 0;
	public static void main(String[] args) {
		deposit(10000); //입금
		checkMyBalance();//잔액확인
		withdraw(3000);//출금진행
		checkMyBalance();//잔액확인
	}
	public static int deposit(int amount) {
		balance += amount;
		return balance;
	}
	public static int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public static int checkMyBalance() {
		System.out.println("잔액: "+balance);
		return balance;
	}

}

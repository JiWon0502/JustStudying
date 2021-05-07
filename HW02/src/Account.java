//2071032_computer science and engineering_Jiwon Yoon
public class Account {
	String owner;
	int balance;
	double rate;
	public Account(String name, int balance, double rate){
		
	}
	public Account(String name, double rate){
		this(name, 0, rate);
	}
	public Account(String name, int balance){
		this(name, balance, 0);
	}
	public void deposit(int balance) {
		this.balance+=balance;
	}
	public void withdraw(int balance) {
		this.balance-=balance;
	}
	public void computeTotal(int year) {// 고칠 것
		
	}
	public void showBalance() {
		System.out.println("Balance = "+balance);
	}
	public void showOwner() {
		System.out.println("Owner = "+owner);
	}
	public void showAll() {
		System.out.println("Owner = "+owner);
		System.out.println("Balance = "+balance);
		System.out.println("Rate = "+rate);
	}
}
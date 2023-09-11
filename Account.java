import java.util.Date;

public class Account {
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	Account(){
		
	}
	
	Account(int id, double balance, double interest){
		id = 0;
		balance = 0.0;
		interest = 0.0;
	}
	
  	public int getID(){
		return id;
	}
	
	public void setID(int idnum){
		id = idnum;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double bal) {
		balance = bal;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualRate) {
		annualInterestRate = annualRate;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public double getMonthlyInterestRate(double monthlyInterestRate) {
		return monthlyInterestRate;
	}
	public double withdraw(double amount) {
		balance -= amount;
		return balance;
	}
	public double deposit(double amount) {
		balance += amount;
		return balance;
	}
	
}

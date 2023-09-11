/*
David Mengele
*/
public class BankOperations {
	public static void main(String[] args) {
		Account myAcc = new Account();
		myAcc.setID(1122);
		myAcc.setBalance(20000);
		myAcc.setAnnualInterestRate(4.5);
		myAcc.withdraw(2500);
		myAcc.deposit(3000);
		
		System.out.println("Balance: " + myAcc.getBalance());
		System.out.println("Monthly Interest Rate: " + myAcc.getMonthlyInterestRate(.375));
		java.util.Date date = new java.util.Date();
		System.out.println("Date: " + date.toString());
	}
}

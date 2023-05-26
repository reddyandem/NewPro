class bankAccount{
	double deposit;
	double withdraw;
	double balance;
	
	
	void deposit(double deposit){
		this.deposit = deposit;
		this.balance = balance + deposit;
		System.out.println("Amoount deposited: " + deposit);
	}
	void withDraw(double withdraw){
		this.withdraw = withdraw;
		this.balance = balance - withdraw;
		System.out.println("Amount is withdrawn");
		
	}
	void balance(){
		System.out.println(balance);
	}
	
	
}
class savingsAcc extends bankAccount{
	
	void withDraw(double withdraw){
		if(balance - withdraw < 100){
			System.out.println("Youcannot withdraw as balance is less than 100");
		}
		else{
			super.withDraw(deposit);
		}
		
	}
}



public class testBank {
	public static void main(String [] args){
		bankAccount ba = new bankAccount();
		savingsAcc sa = new savingsAcc();
		sa.deposit(101);
		sa.withDraw(1);
		sa.balance();
		
	}

}

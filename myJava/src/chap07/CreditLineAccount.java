package chap07;

public class CreditLineAccount extends Account{

	int creditLine;
	
	CreditLineAccount(int creditLine){
		this.creditLine = creditLine;
	}
	
	int withdraw(int amount) {
		if(amount > balance + creditLine) {
			amount = -1;
		}else {
			balance -= amount;
		}
		return amount;
	}
}

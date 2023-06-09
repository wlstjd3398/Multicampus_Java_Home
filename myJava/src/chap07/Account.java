package chap07;

public class Account {

	String accountNo; // °èÁÂ¹øÈ£
	String name;
	int balance; // ÀÜ¾×
	
	// amount Ãâ±Ý¾×
	void deposit(int amount) {
		balance += amount;
	}

	int withdraw(int amount) {
		if(amount > balance) {
			amount = -1;
		}else {
			balance -= amount;
		}
		return amount;
	}
}

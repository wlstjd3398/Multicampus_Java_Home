package chap07;

public class Account {

	String accountNo; // ���¹�ȣ
	String name;
	int balance; // �ܾ�
	
	// amount ��ݾ�
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

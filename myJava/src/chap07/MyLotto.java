package chap07;

public class MyLotto {

	// lotto�� �ܺο��� ����Ҽ�������
// private���� ���� ������ �߸��� �ζ� ��ȣ�� �� �� ����
	private int[] lotto;

	// ��ǻ�� ���忡��
	public MyLotto() {
		this.lotto = new int[6];
		this.setLotto();
		this.sortLotto();
	}

	// �ζ� ��ȣ �ߺ� �˻� �޼��� (num���� �ζǹ�ȣ�� �ϳ��� �޾Ƽ�)
	boolean isUnique(int num) {
		// �ߺ������ʴ´ٶ�� ����
		boolean result = true;

		for (int i = 0; i < this.lotto.length; i++) {
			if (this.lotto[i] == num) {
				result = false;
				break;
			}
		}
		return result;
	}

	// �ζ� �迭 �ʱ�ȭ �޼��� (���������ڸ� �ȳ��� -> �ߺ��� �߻������ʴ� �ζǹ�ȣ�϶� �׶��� i���� ����)
	void setLotto() {
		int temp;

		for (int i = 0; i < this.lotto.length;) {
			// ��� �ζǹ�ȣ�� �����ؾ� �ߺ������ʴ¹�ȣ�� �������ֳ� �� -> �׷��� ���ѹݺ� ���
			while (true) {
				temp = (int) (Math.random() * 45) + 1;

				// �ߺ����� �ʴ� = ������ ���̴�
				if (this.isUnique(temp)) {
					lotto[i] = temp;
					i++;
					break;
				}
			}
		}
	}

	// ������ �����ϴ� �޼���
	void sortLotto() {
		int temp;

//		�ڵ����� ������ ���� ���� �ʿ䰡 ���⿡ -1, 
		for (int i = 0; i < this.lotto.length - 1; i++) {
			// ���� ���� i+1���� �����ϴϱ� ������������ �����
			for (int j = i + 1; j < this.lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
	}

	// �ܺο��� �������� �ζǹ�ȣ �迭�� get���� ����������
	int[] getLotto() {
		return lotto;
	}

	// ����� ȣ��
	public String toString() {
		String result = "";

		for (int num : lotto) {
			result += num + " ";
		}
		return result;
	}

}
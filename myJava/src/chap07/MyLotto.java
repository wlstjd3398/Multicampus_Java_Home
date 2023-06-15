package chap07;

public class MyLotto {

	// lotto를 외부에서 사용할수없게함
// private으로 쓰지 않으면 잘못된 로또 번호가 들어갈 수 있음
	private int[] lotto;

	// 컴퓨터 입장에서
	public MyLotto() {
		this.lotto = new int[6];
		this.setLotto();
		this.sortLotto();
	}

	// 로또 번호 중복 검사 메서드 (num으로 로또번호를 하나씩 받아서)
	boolean isUnique(int num) {
		// 중복되지않는다라고 가정
		boolean result = true;

		for (int i = 0; i < this.lotto.length; i++) {
			if (this.lotto[i] == num) {
				result = false;
				break;
			}
		}
		return result;
	}

	// 로또 배열 초기화 메서드 (증감연산자를 안넣음 -> 중복이 발생하지않는 로또번호일때 그때만 i값을 증가)
	void setLotto() {
		int temp;

		for (int i = 0; i < this.lotto.length;) {
			// 몇번 로또번호를 생성해야 중복되지않는번호를 받을수있냐 모름 -> 그래서 무한반복 사용
			while (true) {
				temp = (int) (Math.random() * 45) + 1;

				// 중복되지 않는 = 유일한 수이다
				if (this.isUnique(temp)) {
					lotto[i] = temp;
					i++;
					break;
				}
			}
		}
	}

	// 정렬을 수행하는 메서드
	void sortLotto() {
		int temp;

//		자동으로 마지막 값은 비교할 필요가 없기에 -1, 
		for (int i = 0; i < this.lotto.length - 1; i++) {
			// 비교할 값은 i+1부터 시작하니까 마지막까지가 대상임
			for (int j = i + 1; j < this.lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
	}

	// 외부에서 못가져온 로또번호 배열을 get으로 가져오게함
	int[] getLotto() {
		return lotto;
	}

	// 결과만 호출
	public String toString() {
		String result = "";

		for (int num : lotto) {
			result += num + " ";
		}
		return result;
	}

}
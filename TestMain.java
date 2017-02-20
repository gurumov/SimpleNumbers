
public class TestMain {

	public static void main(String[] args) {
		for (int i = 99; i > 0; i--) {
			if (i % 2 == 0) {
				if (i / 2 == 1) {
					System.out.println(i);
				}
			}
		}
		for (int i = 99; i > 0; i--) {
			if (i % 2 != 0) {
				if (i % 3 == 1 || i / 3 == 1 || i % 3 == 2) {
					System.out.println(i);

				}
			}
		}
	}

}

package in.com.exception;

public class TestPropogation {
	public static void main(String[] args) {
		dad();
	}

	public static void dad() {
		try {
			mom();
		} catch (MistakException e) {
			System.out.println(e);;
		}
	}

	public static void mom() throws MistakException {
		son();

	}

	public static void son() throws MistakException {
		throw new MistakException();
	}
}

package uniqueIDs;

public class UniqueIDsDemo {
	public static void main(String[] args) {

		UniqueIDsInterface unique = new UniqueIDsImplementation(123456789L, 123456789L);
		System.out.println("value: " + unique.toString());
		unique = UniqueIDsInterface.fromString("38400000-8cf0-11bd-b23e-10b96e4ef00d");
		System.out.println("value: " + unique.toString());
		System.out.println("Clock sequence value: " + unique.clockSequence());
	}
}

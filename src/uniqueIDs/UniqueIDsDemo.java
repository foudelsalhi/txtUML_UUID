package uniqueIDs;

public class UniqueIDsDemo {
	public static void main(String[] args) {
		UniqueIDsInterface uuid = UniqueIDsInterface.randomUUID();

		uuid.clockSequence();
	}
}

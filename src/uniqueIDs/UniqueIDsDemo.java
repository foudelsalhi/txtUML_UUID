package uniqueIDs;

import java.util.UUID;

public class UniqueIDsDemo {
	public static void main(String[] args) {

		// fromString
		UniqueIDsInterface uuid1 = new UniqueIDsImplementation(123456789L, 123456789L);
		System.out.println("UUID value: " + UniqueIDsInterface.fromString(uuid1.toString()));

		// toString
		UniqueIDsImplementation uuid2 = new UniqueIDsImplementation(123456789L, 123456789L);
		System.out.println("String value: " + uuid2.toString());

		// compareTo
		UniqueIDsImplementation uuid3 = new UniqueIDsImplementation(123456789L, 123456789L);
		UUID uuid4 = UUID.fromString("38400000-8cf0-11bd-b23e-10b96e4ef00d");
		System.out.println("Comparing two UUIDs: " + uuid3.compareTo(uuid4));

		// clockSequence
		UniqueIDsImplementation uuid5 = new UniqueIDsImplementation(uuid4);
		System.out.println("Clock sequence value: " + uuid5.clockSequence());

		// equals
		UniqueIDsImplementation uuid6 = new UniqueIDsImplementation(uuid4);
		System.out.println("Is two UUIDs equal: " + uuid6.equals(uuid4));

		// getLeastSignificantBits
		UniqueIDsImplementation uuid7 = new UniqueIDsImplementation(uuid4);
		System.out.println("Least significant bits: " + uuid7.getLeastSignificantBits());

		// getLeastSignificantBits
		UniqueIDsImplementation uuid8 = new UniqueIDsImplementation(uuid4);
		System.out.println("Most significant bits: " + uuid8.getMostSignificantBits());

		// hashCode
		UniqueIDsImplementation uuid9 = new UniqueIDsImplementation(uuid4);
		System.out.println("Hash code value: " + uuid9.hashCode());

		// nameUUIDFromBytes
		byte[] nbyte = { 10, 20, 30 };
		UniqueIDsInterface uuid10 = UniqueIDsInterface.nameUUIDFromBytes(nbyte);
		System.out.println("UUID value from byte: " + uuid10);

		// node
		UniqueIDsImplementation uuid11 = new UniqueIDsImplementation(uuid4);
		System.out.println("Node value is: " + uuid11.node());

		// randomUUID
		System.out.println("Random UUID value: " + UniqueIDsInterface.randomUUID());

		// timestamp
		UniqueIDsImplementation uuid13 = new UniqueIDsImplementation(uuid4);
		System.out.println("Time stamp value: " + uuid13.timestamp());

		// variant
		UniqueIDsImplementation uuid14 = new UniqueIDsImplementation(uuid4);
		System.out.println("Variant value: " + uuid14.variant());

		// version
		UniqueIDsImplementation uuid15 = new UniqueIDsImplementation(uuid4);
		System.out.println("Version value: " + uuid15.version());
	}
}

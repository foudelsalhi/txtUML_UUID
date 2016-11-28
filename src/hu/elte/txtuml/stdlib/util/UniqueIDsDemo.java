package hu.elte.txtuml.stdlib.util;

public class UniqueIDsDemo {
	public static void main(String[] args) {

		UUID uuid = UUID.fromString("38400000-8cf0-11bd-b23e-10b96e4ef00d");
		UUID u1 = new UUIDImplementation(123456789L,123456789L);
		
		// clockSequence
		System.out.println("Clock sequence value: " + uuid.clockSequence());
		
		// compareTo
		System.out.println("Comparing two UUIDs: " + u1.compareTo(uuid));
		
		// equals
		System.out.println("Is two UUIDs equal: " + u1.equals(uuid));
		
		// fromString
		System.out.println("UUID value: " + UUID.fromString(u1.toString()));
		
		// getLeastSignificantBits
		System.out.println("Least significant bits: " + u1.getLeastSignificantBits());
		
		// getMostSignificantBits
		System.out.println("Most significant bits: " + u1.getMostSignificantBits());
		
		// hashCode
		System.out.println("Hash code value: " + u1.hashCode());
		
		// nameUUIDFromBytes
		// byte[] nbyte = {10,20,30};
		// System.out.println("UUID value from byte: " + UUID.nameUUIDFromBytes(nbyte));
		
		// node
		System.out.println("Node value is: " + uuid.node());
		
		// randomUUID
		System.out.println("Random UUID value: " + UUID.randomUUID());
		
		// timestamp
		System.out.println("Time stamp value: " + uuid.timestamp());
		
		// toString
		System.out.println("String value: " + u1.toString());
		
		// variant
		System.out.println("Variant value: " + u1.variant());
		
		// version
		System.out.println("Version value: " + u1.version());
		
	}
}

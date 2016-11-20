package uniqueIDs;

import java.util.UUID;

public class UniqueIDsDemo {
	public static void main(String[] args) {

		UniqueIDsInterface unique = new UniqueIDsImplementation(123456789L,123456789L);
		System.out.println("Clock sequence value: "+ unique.clockSequence());  
	}
}

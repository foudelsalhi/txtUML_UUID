package uniqueIDs;

import java.util.UUID;

public class UniqueIDsDemo {
	public static void main(String[] args) {

		UniqueIDsImplementation unique = new UniqueIDsImplementation();
		System.out.println("Clock sequence value: "+ unique.clockSequence());  
	}
}

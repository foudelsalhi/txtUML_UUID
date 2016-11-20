package uniqueIDs;

import java.util.UUID;

public class UniqueIDsDemo {
	public static void main(String[] args) {
		
		UniqueIDsImplementation unique = new UniqueIDsImplementation();
		UUID uid = UUID.fromString("38400000-8cf0-11bd-b23e-10b96e4ef00d");
		System.out.println("Clock sequence value: "+ unique.clockSequence(uid)); 
	}
}

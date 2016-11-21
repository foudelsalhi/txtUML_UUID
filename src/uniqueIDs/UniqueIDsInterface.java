package uniqueIDs;

import java.util.UUID;

import hu.elte.txtuml.api.model.external.ExternalClass;

public interface UniqueIDsInterface extends ExternalClass {

	public int clockSequence();

	public int compareTo(UUID val);

	public boolean equals(Object obj);

	public static UniqueIDsInterface fromString(String str) {
		return new UniqueIDsImplementation(UUID.fromString(str));
	}

	public long getLeastSignificantBits();

	public long getMostSignificantBits();

	public int hashCode();
	
	public static UniqueIDsInterface nameUUIDFromBytes(byte[] name){
		return new UniqueIDsImplementation(UUID.nameUUIDFromBytes(name));
	}
	
	public long node();
	
	public static UniqueIDsInterface randomUUID(){
		return new UniqueIDsImplementation(UUID.randomUUID());
	}
	public String toString();

}

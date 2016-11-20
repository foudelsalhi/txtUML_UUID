package uniqueIDs;

import java.util.UUID;

import hu.elte.txtuml.api.model.external.ExternalClass;

public interface UniqueIDsInterface extends ExternalClass {

	public int clockSequence();

	public static UniqueIDsInterface fromString(String str) {
		return new UniqueIDsImplementation(UUID.fromString(str));
	}

	public String toString();

}

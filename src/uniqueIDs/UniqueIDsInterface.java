package uniqueIDs;

import java.util.UUID;

import hu.elte.txtuml.api.model.external.ExternalClass;

public interface UniqueIDsInterface extends ExternalClass {

	public int clockSequence(UUID clockSeq);
	public String fromString();

}

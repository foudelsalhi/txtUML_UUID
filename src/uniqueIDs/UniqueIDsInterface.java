package uniqueIDs;

import hu.elte.txtuml.api.model.external.ExternalClass;

public interface UniqueIDsInterface extends ExternalClass {

	public int clockSequence();

	public String fromString();

}

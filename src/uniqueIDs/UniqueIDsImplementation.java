package uniqueIDs;

import java.util.UUID;

public class UniqueIDsImplementation implements UniqueIDsInterface {

	@Override
	public int clockSequence(UUID clockSeq) {
		return clockSeq.clockSequence();
	}

	@Override
	public String fromString() {
		// TODO Auto-generated method stub
		return null;
	}

}

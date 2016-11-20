package uniqueIDs;

public class UniqueIDsImplementation implements UniqueIDsInterface {
	public UniqueIDsImplementation(long mostSigBits, long leastSigBits) {
		this.var = new java.util.UUID(mostSigBits, leastSigBits);
	}

	private java.util.UUID var;

	@Override
	public int clockSequence() {
		return var.clockSequence();
	}

	@Override
	public String fromString() {
		// TODO Auto-generated method stub
		return null;
	}

}

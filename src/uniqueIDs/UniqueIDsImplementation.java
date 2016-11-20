package uniqueIDs;

public class UniqueIDsImplementation implements UniqueIDsInterface {
	public UniqueIDsImplementation(long mostSigBits, long leastSigBits) {
		this.var = new java.util.UUID(mostSigBits, leastSigBits);
	}

	protected UniqueIDsImplementation(java.util.UUID var) {
		this.var = var;
	}

	private java.util.UUID var;

	@Override
	public int clockSequence() {

		return var.clockSequence();
	}

	@Override
	public String toString() {
		return var.toString();
	}
}

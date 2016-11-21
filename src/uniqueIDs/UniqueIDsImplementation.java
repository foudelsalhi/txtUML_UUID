package uniqueIDs;

import java.util.UUID;

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
	public int compareTo(UUID val) {
		return var.compareTo(val);
	}

	@Override
	public boolean equals(Object obj) {
		return var.equals(obj);
	}

	@Override
	public long getLeastSignificantBits() {
		return var.getLeastSignificantBits();
	}

	@Override
	public long getMostSignificantBits() {
		return var.getMostSignificantBits();
	}

	@Override
	public int hashCode() {
		return var.hashCode();
	}
	
	@Override
	public long node() {
		return var.node();
	}
	
	@Override
	public String toString() {
		return var.toString();
	}	

}

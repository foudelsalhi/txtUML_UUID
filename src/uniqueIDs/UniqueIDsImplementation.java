package uniqueIDs;

import java.util.UUID;

public class UniqueIDsImplementation implements UniqueIDsInterface {

	// Store UUID object to use it in all other functions
	private java.util.UUID var;

	// instance method that returns val
	protected java.util.UUID getOrigUUID(Object val) {
		if (val instanceof UniqueIDsImplementation) {
			return ((UniqueIDsImplementation) val).var;
		} else if (val instanceof UUID) {
			return var;
		} else
			return null;
	}

	// Constructs a new UUID using the specified data.
	public UniqueIDsImplementation(long mostSigBits, long leastSigBits) {
		this.var = new java.util.UUID(mostSigBits, leastSigBits);
	}

	// protected constructor
	protected UniqueIDsImplementation(java.util.UUID var) {
		this.var = var;
	}

	@Override
	public int clockSequence() {

		return var.clockSequence();
	}

	@Override
	public int compareTo(UUID val) {
		return var.compareTo(getOrigUUID(val));
	}

	@Override
	public boolean equals(Object obj) {
		return var.equals(getOrigUUID(obj));
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
	public long timestamp() {
		return var.timestamp();
	}

	@Override
	public String toString() {
		return var.toString();
	}

	@Override
	public int variant() {
		return var.variant();
	}

	@Override
	public int version() {
		return var.version();
	}

}

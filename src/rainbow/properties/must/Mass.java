package rainbow.properties.must;

import rainbow.properties.Scalar;

public class Mass extends Scalar<Mass> {
	// 默认为1.0
	public Mass() {
		super(1.0);
	}

	public Mass(double m) {
		super(m);
	}

	@Override
	public String toString() {
		return "Mass [" + super.toString() + "]";
	}

}

package rainbow.properties;

import rainbow.units.Units;

public abstract class Scalar<S extends Scalar<?>> extends Property {

	private double value;

	private Units unit;

	public Scalar(double value) {
		this.value = value;
	}

	public void add(S s) {
		value += s.getValue();
	}

	@Override
	public String toString() {
		return value + "" + unit;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
}

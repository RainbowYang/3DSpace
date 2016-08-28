package rainbow.properties;

public abstract class Vector<V extends Vector<?>> extends Property {
	// x表示在南北方向上的方向，以北为正
	// y表示在东西方向上的方向，以东为正
	// z表示在上下方向上的方向，以上为正
	private double x;
	private double y;
	private double z;

	public Vector() {
	}

	public Vector(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public void add(V v) {
		x += v.getX();
		y += v.getY();
		z += v.getZ();
	}

	@Override
	public String toString() {
		return "Vector [x=" + x + ", y=" + y + ", z=" + z + "]";
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}
}

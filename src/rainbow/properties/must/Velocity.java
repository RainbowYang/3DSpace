package rainbow.properties.must;

import rainbow.properties.Vector;

/**
 * 速度
 * 
 * @author Rainbow_Yang
 */
public class Velocity extends Vector<Velocity> {
	public static final Velocity NORTHWARD = new Velocity(1.0, 0.0, 0.0);
	public static final Velocity SOUTHWARD = new Velocity(-1.0, 0.0, 0.0);
	public static final Velocity EASTHWARD = new Velocity(0.0, 1.0, 0.0);
	public static final Velocity WESTWARD = new Velocity(0.0, -1.0, 0.0);
	public static final Velocity UPWARD = new Velocity(0.0, 0.0, 1.0);
	public static final Velocity DOWNWARD = new Velocity(0.0, 0.0, -1.0);

	public Velocity() {
	}

	@Override
	public String toString() {
		return "Velocity [x=" + getX() + ", y=" + getY() + ", z=" + getZ() + "]";
	}

	public Velocity(double x, double y, double z) {
		super(x, y, z);
	}
}

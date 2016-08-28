package rainbow.properties.must;

import rainbow.properties.Vector;

public class Location extends Vector<Location> {
	public Location() {
	}

	public Location(double x, double y, double z) {
		super(x, y, z);
	}

	@Override
	public String toString() {
		return "Location [x=" + getX() + ", y=" + getY() + ", z=" + getZ() + "]";
	}

	/**
	 * 
	 * @param l
	 * @return 两个位置的中点
	 */
	public Location Middle(Location l) {
		return new Location((getX() + l.getX()) / 2, (getY() + l.getY()) / 2, (getZ() + l.getZ()) / 2);
	}
}

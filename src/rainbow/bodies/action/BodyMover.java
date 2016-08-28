package rainbow.bodies.action;

import rainbow.bodies.Body;
import rainbow.properties.must.Location;
import rainbow.run.World;

public class BodyMover {

	public static void move(Body b) {
		int rate = World.getWorld().getRate();
		double xr = b.getVelocity().getX() / rate;
		double yr = b.getVelocity().getY() / rate;
		double zr = b.getVelocity().getZ() / rate;
		b.getLocation().add(new Location(xr, yr, zr));
	}
}

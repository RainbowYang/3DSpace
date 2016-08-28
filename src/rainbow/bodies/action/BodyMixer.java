package rainbow.bodies.action;

import rainbow.bodies.Body;
import rainbow.properties.must.Mass;
import rainbow.properties.must.Velocity;
import rainbow.tools.SpecialMath;

public class BodyMixer {
	private Body b1;
	private Body b2;

	public BodyMixer(Body b1, Body b2) {
		this.b1 = b1;
		this.b2 = b2;
	}

	public Body getNewBody() {
		b1.getMass().add(b2.getMass());

		double xv = SpecialMath.sqrt((getDouble(b1, 1) + getDouble(b2, 1)) / m.getMassValue());
		double yv = SpecialMath.sqrt((getDouble(b1, 2) + getDouble(b2, 2)) / m.getMassValue());
		double zv = SpecialMath.sqrt((getDouble(b1, 3) + getDouble(b2, 3)) / m.getMassValue());

		Velocity v = new Velocity(xv, yv, zv);

		Body newBody = new Body(b1.getMass(), v, b1.getLocation().Middle(b2.getLocation()));
		return newBody;
	}

	private double getDouble(Body b, int mode) {
		Velocity v = b.getVelocity();
		double vv = 0;
		switch (mode) {
		case 1:
			vv = v.getX();
			break;
		case 2:
			vv = v.getY();
			break;
		case 3:
			vv = v.getZ();
			break;
		}
		return b.getMass().getValue() * SpecialMath.square(vv);
	}
}

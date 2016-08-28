package rainbow.bodies;

import rainbow.properties.free.Radius;

public class Ball extends Body {

	private Radius radius;

	public Ball() {
		radius = new Radius();
	}

	public Radius getRadius() {
		return radius;
	}

	public void setRadius(Radius radius) {
		this.radius = radius;
	}

}

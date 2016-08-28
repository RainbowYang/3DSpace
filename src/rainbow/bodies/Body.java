package rainbow.bodies;

import rainbow.properties.must.Location;
import rainbow.properties.must.Mass;
import rainbow.properties.must.Velocity;

/**
 * 这是一个质点，带有三个参数：质量，速度，位置 <br>
 * 也作为所有物体的父类
 * 
 * @author Rainbow_Yang
 *
 */
public class Body {
	private String name;
	private Mass mass;
	private Velocity velocity;
	private Location location;

	// 默认参数
	public Body() {
		mass = new Mass();
		velocity = new Velocity();
		location = new Location();
	}

	public Body(String name, Mass mass, Velocity velocity, Location location) {
		this.name = name;
		this.mass = mass;
		this.velocity = velocity;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Mass getMass() {
		return mass;
	}

	@Override
	public String toString() {
		return "Body [name=" + name + "," + mass + "," + velocity + "," + location + "]";
	}

	public void setMass(Mass m) {
		this.mass = m;
	}

	public Velocity getVelocity() {
		return velocity;
	}

	public void setVelocity(Velocity v) {
		this.velocity = v;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location l) {
		this.location = l;
	}

}

package rainbow.test;

import codeLinesReader.rainbow.CodeLinesReaderUser;
import rainbow.bodies.Body;
import rainbow.properties.Vector;
import rainbow.properties.must.Location;
import rainbow.properties.must.Velocity;
import rainbow.run.World;

public class Test {
	public static void main(String[] args) {
		bodyMoveTest();
	}

	static {
		new CodeLinesReaderUser("..//3DSpace//src", "simple");
	}

	public static void vectorTest() {
		Vector<Location> v1 = new Location(1, 1, 1);
		Vector<Velocity> v2 = new Velocity(2, 2, 2);
		// v1.add(v2);
		System.out.println(v1);
		System.out.println(v2);
	}

	public static void bodyMoveTest() {
		Body b1 = new Body();
		b1.setVelocity(new Velocity(1, 2, 0));
		World.getWorld().add(b1);
		World.getWorld().action();
	}
}

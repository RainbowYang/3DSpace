package rainbow.test;

import codeLinesReader.rainbow.CodeLinesReaderUser;
import rainbow.bodies.Body;
import rainbow.properties.Vector;
import rainbow.properties.must.Location;
import rainbow.properties.must.Velocity;

public class Test {
	public static void main(String[] args) {
		bodyTest();
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

	public static void bodyTest() {
		Body b1 = new Body();
		Body b2 = new Body();
		System.out.println(b1);
		System.out.println(b2);
	}
}

package rainbow.run;

import java.util.HashMap;
import java.util.Map;

import rainbow.bodies.Body;
import rainbow.bodies.action.BodyMover;

public class World {
	private long startTime;
	private long lastTime;
	private int rate = 20;
	private Map<String, Body> bodies = new HashMap<>();
	private static World world = new World();

	private World() {
	}

	public static World getWorld() {
		return world;
	}

	public void action() {
		startTime = System.currentTimeMillis();
		lastTime = startTime;
		while (true) {
			long now = System.currentTimeMillis();
			if (now >= 1000.0 / rate + lastTime) {
				for (Body b : bodies.values()) {
					BodyMover.move(b);
					if ((now - startTime) % 1000 < 10) {
						System.out.println(b);
						System.out.println(lastTime - startTime);
					}
				}
				lastTime = now;
			}
		}
	}

	public void add(Body b) {
		String name = b.getName() == null ? "body-" + (bodies.size()) : b.getName();
		if (b.getName() == null)
			b.setName(name);
		bodies.put(name, b);
	}

	public void remove(String key) {
		bodies.remove(key);
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
}

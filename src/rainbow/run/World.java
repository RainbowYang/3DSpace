package rainbow.run;

import java.util.HashMap;
import java.util.Map;

import rainbow.bodies.Body;

public class World {
	private long startTime;
	private int rate = 50;
	private Map<String, Body> bodies = new HashMap<>();
	private World world = new World();

	private World() {
	}

	public World getWorld() {
		return world;
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

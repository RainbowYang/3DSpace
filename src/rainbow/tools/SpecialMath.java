package rainbow.tools;

public class SpecialMath {
	/**
	 * @param x
	 * @return 当x>0时，返回x<sup>2</sup>；当x<0时，返回-x<sup>2</sup>。
	 */
	public static double square(double x) {
		return x >= 0 ? Math.pow(x, 2) : -Math.pow(x, 2);
	}

	/**
	 * 
	 * @param x
	 * @return 当x>0时，返回其算数平方根；当x<0时，返回其绝对值的算数平方根的负值。
	 */
	public static double sqrt(double x) {
		return x >= 0 ? Math.sqrt(x) : -Math.sqrt(-x);
	}
}

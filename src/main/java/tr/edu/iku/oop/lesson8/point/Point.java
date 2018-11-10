package tr.edu.iku.oop.lesson8.point;

public class Point {
	double x;
	double y;

	public Point() {
		x = 0.0;
		y = 0.0;
	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double calculateDistance() {
		return Math.sqrt((x * x) + (y * y));
	}
}

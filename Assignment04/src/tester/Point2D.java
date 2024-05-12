package tester;

public class Point2D {
	float x;
	float y ;
	public Point2D(float x, float y) {
		this.x = x;
		this.y = y;
	}
	public Point2D() {
	}
	 public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public String getDetails() {
	      String ptx = String.valueOf(x);
	      String pty = String.valueOf(y);
	      return "Point : ("+ptx+","+pty+")"; 
 	 }
	 public Boolean isEqual(Point2D point) {
		 return this.x==point.x && this.y==point.y;
	 }
	 public double calculateDistance(Point2D point) {
		 return Math.sqrt(Math.pow(point.x-this.x, 2)+Math.pow(point.y-this.y, 2));
	 }
}

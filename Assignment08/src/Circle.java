
public class Circle {
	Point2D centerPoint = new Point2D();
	double diameter ;
	public Circle() {
		centerPoint.setX(0);
		centerPoint.setY(0);
		diameter = 100;
	}
	public double getDiameter() {
		return diameter;
	}
	public void setDiameter(double diameter) throws Exception {
		if(diameter < 0)
			throw new Exception("Diameter should always be non-negative.");
		this.diameter = diameter;
	}
	
}

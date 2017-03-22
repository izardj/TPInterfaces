package metier;

public class Circle implements Surface, IPrintable, IFXDrawable {

	private double radius;

	/**
	 * @param radius
	 */
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public void printMe(String text) {
		// TODO Auto-generated method stub
		System.out.println(text);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String getShape() {
		return "Circle shape";
	}

}

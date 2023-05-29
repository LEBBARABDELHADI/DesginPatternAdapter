
public class CircleAdapter implements Shape {

	private CircleAdaptee circle;
	public CircleAdapter(CircleAdaptee circle) {
		this.circle = circle;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		circle.calculArea();
	}

}

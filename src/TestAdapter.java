
public class TestAdapter {

	public static void main(String[] args) {
		
		Shape shape= new CircleAdapter(new CircleAdaptee());
		shape.display();
	}
}

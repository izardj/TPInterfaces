package presentation;


import java.util.ArrayList;
import java.util.Collection;

import metier.AreaCalculator;
import metier.Circle;
import metier.Rectangle;
import metier.Square;
import metier.Surface;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r = new Rectangle(25, 5);
		Square s = new Square(8);
		Circle c = new Circle(4);
		
		/*Surface[] sf = new Surface[3];
		
		sf[0] = r;
		sf[1] = s;
		sf[2] = c;
		*/

		Collection<Surface> sf = new ArrayList<Surface>();
		sf.add(r);
		sf.add(s);
		sf.add(c);
		
		AreaCalculator ac = new AreaCalculator();
		System.out.println(ac.sumArea(sf));
	}

}

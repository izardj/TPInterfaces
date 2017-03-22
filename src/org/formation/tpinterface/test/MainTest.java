package org.formation.tpinterface.test;


import org.formation.tpinterface.AreaCalculator;
import org.formation.tpinterface.Circle;
import org.formation.tpinterface.Rectangle;
import org.formation.tpinterface.Square;
import org.formation.tpinterface.Surface;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r = new Rectangle(25, 5);
		Square s = new Square(8);
		Circle c = new Circle(4);
		
		Surface[] sf = new Surface[3];
		
		sf[0] = r;
		sf[1] = s;
		sf[2] = c;
		
		AreaCalculator ac = new AreaCalculator();
		System.out.println(ac.sumArea(sf));
	}

}

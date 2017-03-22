package org.formation.tpinterface;

public class AreaCalculator {

	public AreaCalculator() {
		super();
	}

	public double sumArea(Surface[] surfaces) {
		double sumArea = 0;
		for (Surface surface : surfaces) {
			sumArea += surface.getArea();
		}
		return sumArea;
	}
}

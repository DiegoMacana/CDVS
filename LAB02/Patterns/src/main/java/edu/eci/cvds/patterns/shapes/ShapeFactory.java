package edu.eci.cvds.patterns.shapes;
import edu.eci.cvds.patterns.shapes.concrete.*;

public class ShapeFactory{
	public static Shape create(RegularShapeType x){
		switch(x){
			case Triangle:
				return new Triangle();
			case Hexagon:
				return new Hexagon();
			default:
				throw new IllegalStateException("type didn't found"+x);
		}
	}
}

package org.curlybrace.oopj.ocp1z0_829.ch06.mystudies.Study005_InheritingMembers.Study005_03_HidingVariables;

/*
 * ● --> instance variable
 * ●h --> hiding instance variable
 *  
 * Δ --> abstract method 
 * ▲ --> concrete method
 * ▲o --> overriding concrete method
 * 
                 Circle                                               Square                                               Triangle
                |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|           |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|           |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|
                |   ●h nameOfShape                       |           |   ● lengthOfEdges                      |           |   ● edge1                              |
                |   ●h numberOfEdges                     |           |                                        |           |   ● edge2                              |
                |   ●h isConvex                          |           |                                        |           |   ● edge3                              |
                |   ● radius                             |           |                                        |           |                                        |
                |                                        |           |                                        |           |                                        |
                |   ▲o printVariables2                   |           |                                        |           |                                        |
crcl----------|>|   ▲o getArea                           |   sqre--|>|   ▲o getArea                           |   trng--|>| ▲o getArea                             |
                |   ▲o getPerimeter                      |           |   ▲o getPerimeter                      |           | ▲o getPerimeter                        |
                |                                        |           |                                        |           |                                        |
                |        Shape                           |           |       Shape                            |           |       Shape                            |
                |       |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|    |           |       |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|    |           |       |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|    |
shcr------------|-----|>|▲o getArea                 |    | shsq------|-----|>|▲o getArea                 |    | shtr------|-----|>|▲o getArea                 |    |
                |       |▲o getPerimeter            |    |           |       |▲o getPerimeter            |    |           |       |▲o getPerimeter            |    |
                |       |                           |    |           |       |                           |    |           |       |                           |    |
                |       |    AbstractShape          |    |           |       | AbstractShape             |    |           |       | AbstractShape             |    |
                |       |   |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾| |    |           |       | |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|   |    |           |       | |‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾|   |    |
                |       |   |● nameOfShape        | |    |           |       | |● nameOfShape        |   |    |           |       | |● nameOfShape        |   |    |
                |       |   |● numberOfEdges      | |    |           |       | |● numberOfEdges      |   |    |           |       | |● numberOfEdges      |   |    |
                |       |   |● isConvex           | |    |           |       | |● isConvex           |   |    |           |       | |● isConvex           |   |    |
                |       |   |                     | |    |           |       | |                     |   |    |           |       | |                     |   |    |
                |       |   |▲ printVariables     | |    |           |       | |▲ printVariables     |   |    |           |       | |▲ printVariables     |   |    |
                |       |   |▲ printVariables2    | |    |           |       | |▲ printVariables2    |   |    |           |       | |▲ printVariables2    |   |    |
                |       |   |Δ getArea            | |    |           |       | |Δ getArea            |   |    |           |       | |Δ getArea            |   |    |
                |       |   |Δ getPerimeter       | |    |           |       | |Δ getPerimeter       |   |    |           |       | |Δ getPerimeter       |   |    |
                |       |    ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾  |    |           |       |  ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾    |    |           |       |  ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾    |    |
                |        ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾     |           |        ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾     |           |        ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾     |
                |                                        |           |                                        |           |                                        |
                 ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾             ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾             ‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾ 
 *
 */
abstract class AbstractShape {
    String nameOfShape = null;
	int numberOfEdges = 0;
    boolean isConvex = false;
    
    public void printVariables() {
    	System.out.println(nameOfShape + ", " + numberOfEdges + ", " + isConvex);
    }

    public void printVariables2() {
    	System.out.println(nameOfShape + ", " + numberOfEdges + ", " + isConvex);
    }
    
    abstract public double getArea();
    public abstract double getPerimeter();
}

class Shape extends AbstractShape{
	/*
	 * Although Shape is not an abstract class here, a general shape is still an 
	 * indefinite shape, so the methods getArea and getPerimeter is implemented 
	 * to return a negative number which doesn't make any sense.
	 */
	@Override
	public double getArea() {
		return -1;
	}
	
	@Override
	public double getPerimeter() {
		return -1;
	}	
}

class Circle extends Shape {
	/* 
	 * The variables nameOfShape, numberOfEdges, and isConvex could be inherited from the 
	 * class Shape, but for the sake of demonstrating variable hiding we declared them 
	 * here in this class.
	 */
	final String nameOfShape = "Circle";
	final int numberOfEdges = -1;
	final boolean isConvex = true;
	//
	double radius;
	//
	public Circle(double radius) {
		this.radius = radius;
	}
	//
	@Override
	public void printVariables2() {
		/*
		 *  Although it seems exactly the same code with the printVariables2() method of the 
		 *  parent class, it just prints the members of the child class instead of the
		 *  members of the parent class.
		 */
		System.out.println(nameOfShape + ", " + numberOfEdges + ", " + isConvex);
	}
	//
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
	//
	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}	
 }

class Square extends Shape {
	/* 
	 * The variables nameOfShape, numberOfEdges, and isConvex is inherited 
	 * from the class Shape which inherits them from the class AbstractShape.
	 */
	//
	double lengthOfEdges;
	//
	public Square(double lengthOfEdges) {
		nameOfShape = "Square";
		numberOfEdges = 4;
		isConvex = true;
		this.lengthOfEdges = lengthOfEdges;
	}
	//
	@Override
	public double getArea() {
		return Math.pow(lengthOfEdges, 2);
	}
	//
	@Override
	public double getPerimeter() {
		return 4 * lengthOfEdges;
	}		
 }

class Triangle extends Shape {
	/* 
	 * The variables nameOfShape, numberOfEdges, and isConvex is inherited 
	 * from the class Shape which inherits them from the class AbstractShape.
	 */
	//
	double edge1, edge2, edge3;
	//
	public Triangle(double edge1, double edge2, double edge3) {
		nameOfShape = "Triangle";
		numberOfEdges = 3;
		isConvex = true;
		//
		this.edge1 = edge1;
		this.edge2 = edge2;
		this.edge3 = edge3;
	}
	//
	@Override
	public double getArea() {
		double u = this.getPerimeter() / 2.0;
		return Math.sqrt(u * (u - edge1) * (u - edge2) * (u - edge3));
	}
	//
	@Override	
	public double getPerimeter() {
		return edge1 + edge2 + edge3;
	};	
 }

public class Shapes {

	public static void main(String[] args) {
		Circle crcl = new Circle(1.0);
		Shape  shcr = crcl;
		Square sqre = new Square(10.0);
		Shape  shsq = sqre;
		Triangle trng = new Triangle(3, 4, 5);
		Shape shtr = trng;
		//
		System.out.println("------------------------------ Investigation of Inheritance ------------------------------");
		shcr.printVariables();	//	Prints	--> null, 0, false
		crcl.printVariables();	//	Prints	--> null, 0, false
		shsq.printVariables();	//	Prints	--> Square, 4, true
		sqre.printVariables();	//	Prints	--> Square, 4, true
		shtr.printVariables();	//	Prints	--> Triangle, 3, true
		trng.printVariables();	//	Prints	--> Triangle, 3, true	
		//
		System.out.println("------------------------------ Investigation of Method Overriding (Hiding Variables) ------------------------------");
		shcr.printVariables2();	//	Prints	--> Circle, -1, true
		crcl.printVariables2();	//	Prints	--> Circle, -1, true
		System.out.println("------------------------------ Investigation of Method Overriding (Inherited Variables) ------------------------------");
		shsq.printVariables2();	//	Prints	--> Square, 4, true
		sqre.printVariables2();	//	Prints	--> Square, 4, true
		shtr.printVariables2();	//	Prints	--> Triangle, 3, true
		trng.printVariables2();	//	Prints	--> Triangle, 3, true			
		//
		System.out.println(Math.round(shcr.getArea() * 100.0)/100.0);	//	Prints	--> 3.14
		System.out.println(Math.round(crcl.getArea() * 100.0)/100.0);	//	Prints	--> 3.14
		System.out.println(Math.round(shsq.getArea() * 100.0)/100.0);	//	Prints	--> 100.0
		System.out.println(Math.round(sqre.getArea() * 100.0)/100.0);	//	Prints	--> 100.0
		//
		System.out.println(Math.round(((Shape)sqre).getArea() * 100.0)/100.0);	//	Prints	--> 100.0
		//
		System.out.println("------------------------------ Investigation of Hidden and Hiding Variables ------------------------------ ");
		System.out.println(shcr.nameOfShape + ", " + shcr.numberOfEdges + ", " + shcr.isConvex);	//	Prints	--> null, 0, false
		System.out.println(crcl.nameOfShape + ", " + crcl.numberOfEdges + ", " + crcl.isConvex);	//	Prints	--> Circle, -1, true
		System.out.println(shsq.nameOfShape + ", " + shsq.numberOfEdges + ", " + shsq.isConvex);	//	Prints	--> Square, 4, true
		System.out.println(sqre.nameOfShape + ", " + sqre.numberOfEdges + ", " + sqre.isConvex);	//	Prints	--> Square, 4, true
		System.out.println(shtr.nameOfShape + ", " + shtr.numberOfEdges + ", " + shtr.isConvex);	//	Prints	--> Triangle, 3, true
		System.out.println(trng.nameOfShape + ", " + trng.numberOfEdges + ", " + trng.isConvex);	//	Prints	--> Triangle, 3, true	
		//
		System.out.println("------------------------------ Demonstrating Area and Perimeter Calculations ------------------------------ ");
		System.out.println("Area of Circle      --> " + Math.round(crcl.getArea() * 100.0)/100.0);		//	Prints	--> 3.14
		System.out.println("Perimeter of Circle --> " + Math.round(crcl.getPerimeter() * 100.0)/100.0);	//	Prints	--> 6.28
		System.out.println("Area of Square      --> " + Math.round(sqre.getArea() * 100.0)/100.0);		//	Prints	--> 100.0
		System.out.println("Perimeter of Square --> " + Math.round(sqre.getPerimeter() * 100.0)/100.0);	//	Prints	--> 40.0		
		System.out.println("Area of Triangle      --> " + Math.round(trng.getArea() * 100.0)/100.0);		//	Prints	--> 6.0
		System.out.println("Perimeter of Triangle --> " + Math.round(trng.getPerimeter() * 100.0)/100.0);	//	Prints	--> 12.0
	}
}
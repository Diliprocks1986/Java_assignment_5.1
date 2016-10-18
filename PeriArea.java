import static java.lang.Math.*;
import java.util.Scanner;

abstract class Figure{
	// Dimension Variables
	double dim1,dim2;	
	// Default abstract methods 
	public abstract void findArea();
	public abstract void findPerimeter();
}

class Circle extends Figure{
	// Circle Constructor
	public Circle(double radius) {
        dim1 = radius;
    }
	// @Override findArea for calculate Circle Area
	@Override
    public void findArea() {
	System.out.println("Circle Area is "+ (Math.PI * Math.pow(dim1, 2)));
    }
	// @Override findPerimeter for calculate rectangle Perimeter
	@Override
    public void findPerimeter() {
       System.out.println("Circle Perimeter is "+ (2 * Math.PI * dim1));
    }	
}

class Rectangle extends Figure{	
    // Rectangle Constructor
	public Rectangle(double width, double height) {
        dim1 = width;
        dim2 = height;
    }	
	// @Override findArea for calculate rectangle Area
	@Override
	public void findArea() { 
		System.out.println("Rectangle Area is "+ (dim1 * dim2)); 
	} 
	// @Override findPerimeter for calculate rectangle Perimeter
	@Override
	public void findPerimeter() { 
		System.out.println("Rectangle Perimeter is "+(2*(dim1 + dim2))); 	
	}	
}

class Triangle extends Figure{
	// Triangle Constructor
	public Triangle(double side) {
        dim1 = side;
    }
	// @Override findArea for calculate Triangle Area
	@Override
	public void findArea() { 
		double s = (dim1*3) / 2;
		double t = Math.sqrt(s * (s - dim1) * (s - dim1) * (s - dim1));
		System.out.println("Triangle Area is "+ t); 		
	}
	// @Override findArea for calculate Triangle Perimeter
	@Override
    public void findPerimeter() {
        // findPerimeter = dim1 + dim1 + dim1
		System.out.println("Triangle Perimeter is "+ (dim1 + dim1 + dim1)); 		
        
	}
}

class PeriArea {
	public static void main(String[] args){
		
		// Taking User Inputs
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Radius of the Circle");
		double rad = input.nextDouble();
		System.out.println("Enter Rectangle width");
		double width = input.nextDouble();
		System.out.println("Enter Rectangle height");
		double height = input.nextDouble();
		System.out.println("Enter Triangle Base");
		double base = input.nextDouble();
		
		
		
		System.out.println("-------------Circle-----------------");
		Figure cir = new Circle(rad);
		cir.findArea();
		cir.findPerimeter();
		
		
		
		System.out.println("------------Rectangle---------------");
		Figure rect = new Rectangle(width,height);
		rect.findArea();
		rect.findPerimeter();
		
		
		
		System.out.println("------------Triangle----------------");
		Figure tri = new Triangle(base);
		tri.findArea();
		tri.findPerimeter();
		
		
		
	}
}
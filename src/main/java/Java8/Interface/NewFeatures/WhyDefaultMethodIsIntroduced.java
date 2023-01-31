package Java8.Interface.NewFeatures;

interface Shape {
    double getArea();
    default void printArea() 
    {
        System.out.println("Area of shape is: " + getArea());
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double getArea() {
        return length * width;
    }
}

class Circle implements Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}


//Without breaking the classes we have added new functionality to the interface
public class WhyDefaultMethodIsIntroduced {
	public static void main(String[] args) {
		Shape r = new Rectangle(2,3);
		r.printArea(); //  "Area of shape is: 6.0"

		Shape c = new Circle(3);
		c.printArea();  //  "Area of shape is: 28.274333882308138"

	}
}

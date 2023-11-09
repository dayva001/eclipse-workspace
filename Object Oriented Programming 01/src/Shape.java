public class Shape {

	public static void main(String[] args) {
		Circle circle1 = new Circle(2.3, "Red");
		Circle circle2 = new Circle(4.2, "Purple");
		Square square1 = new Square(10.0, "Orange");
		Square square2 = new Square(0.7, "Blue");
		Rectangle rect1 = new Rectangle(5.5, 8.1, "Cyan");
		Rectangle rect2 = new Rectangle(1.0, 6.4, "Black");
		//print out values
		System.out.println("Circle 1 properties; Radius: " + circle1.radius() + ", Color: " + circle1.color() + ", Area: " + circle1.getArea());
		System.out.println("Circle 2 properties; Radius: " + circle2.radius() + ", Color: " + circle2.color() + ", Area: " + circle2.getArea());
		System.out.println("Square 1 properties; Side: " + square1.side() + ", Color: " + square1.color() + ", Area: " + square1.getArea());
		System.out.println("Square 2 properties; Side: " + square2.side() + ", Color: " + square2.color() + ", Area: " + square2.getArea());
		System.out.println("Rectangle 1 properties; Length: " + rect1.length() + ", Width: " + rect1.width() + ", Color: " + rect1.color() + ", Area: " + rect1.getArea() + ", Perimeter: " + rect1.getPerimeter());
		System.out.println("Rectangle 2 properties; Length: " + rect2.length() + ", Width: " + rect2.width() + ", Color: " + rect2.color() + ", Area: " + rect2.getArea() + ", Perimeter: " + rect2.getPerimeter());
	}

}

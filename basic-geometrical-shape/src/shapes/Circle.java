package shapes;

public class Circle {
    private double radius;
    private double diameter;

    public Circle(double radius) {

        this.radius = radius;
        diameter = radius*2;
    }

    public double calculateArea() {
        return radius * radius * Math.PI;
    }

    public Rectangle calculateRectangle(){

        Rectangle smallestRectangle = new Rectangle(diameter,diameter);
        return smallestRectangle;
    }

}

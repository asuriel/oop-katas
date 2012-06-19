package tddshapes;

public class Circle implements Shape{
    private double radius;
    private double diameter;

    public Circle(double radius) {
        this.radius = radius;
        diameter = radius*2;
    }

    public double calculateArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public Rectangle boundingRectangle() {
        return new Rectangle(diameter,diameter);
    }

}

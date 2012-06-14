package tddshapes;

public class Triangle {

    private final double height;
    private final double width;

    public Triangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double calculateArea() {
        return height * width / 2;
    }

    public Rectangle boundingRectangle() {
        return new Rectangle(height, width);
    }
}

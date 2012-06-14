package tddshapes;

public class Rectangle {
    private final double height;
    private final double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double calculateArea() {
        return width * height;
    }

    public boolean equal(Rectangle other) {
        if ((this.height == other.height) && (this.width == other.width)) {
            return true;
        }
        return false;
    }
}

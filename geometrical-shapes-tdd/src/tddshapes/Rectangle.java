package tddshapes;

public class Rectangle implements Shape{

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double calculateArea() {
        return width * height;
    }

    //will only compare width and height of another rectangle...not accurate
    public boolean sameAs(Rectangle other) {
        if ((this.height == other.height && this.width == other.width)
                || (this.height == other.width && this.width == other.height))
        {
            return true;
        }
        return false;
    }
    public Rectangle boundingRectangle() {
        return this;
    }

}

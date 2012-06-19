package tddshapes;

import java.util.ArrayList;

public class CompositeShapes {

    private ArrayList<Shape> shapes;

    public CompositeShapes() {
        shapes = new ArrayList<Shape>();
    }

    public void addShape(Shape s)
    {
         shapes.add(s);
    }
    public double calculateArea()
    {
        double totalArea = 0;

        for(Shape s: shapes)
        {
          totalArea += s.calculateArea();
        }
        return totalArea;
    }
}

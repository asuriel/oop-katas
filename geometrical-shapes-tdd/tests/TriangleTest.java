import org.junit.Test;
import tddshapes.Rectangle;
import tddshapes.Triangle;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class TriangleTest {

    Triangle triangle = new Triangle(10, 5);

    @Test
    public void returnTriangleArea() {

        double area = triangle.calculateArea();
        assertThat(area, is(25d));
    }

    @Test
    public void boundingRectangle() {

        Rectangle bounding = triangle.boundingRectangle();
        Rectangle tester = new Rectangle(10, 5);
        assertTrue(bounding.sameAs(tester));

    }
}

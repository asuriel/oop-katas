import org.junit.Test;
import tddshapes.Circle;
import tddshapes.Rectangle;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class CircleTest {
    Circle circle = new Circle(1);

    @Test
    public void returnCircleArea() {

        double area = circle.calculateArea();
        double pi = Math.PI;
        assertThat(area, is(pi));
    }

    @Test
    public void boundingRectangle() {

        Rectangle bounding = circle.boundingRectangle();
        Rectangle expected = new Rectangle(2,2);
        assertTrue(bounding.sameAs(expected));

    }

}

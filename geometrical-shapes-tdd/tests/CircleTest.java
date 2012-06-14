

import org.junit.Test;
import tddshapes.Circle;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class CircleTest {
    @Test
    public void returnCircleArea(){
        Circle circle = new Circle(1);
        double area = circle.calculateArea();
        double pi = Math.PI;
        assertThat(area,is(pi));
    }

}

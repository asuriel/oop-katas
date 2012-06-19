import org.junit.Test;
import tddshapes.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CompositeTest {

    CompositeShapes s = new CompositeShapes();
    Triangle t = new Triangle(4,5);
    Rectangle r = new Rectangle(2,2);
    Rectangle c = new Rectangle(3,3);




    @Test
    public void calculateArea(){

        s.addShape(t);
        s.addShape(r);
        s.addShape(c);

        assertThat(s.calculateArea(), is(23d));
    }
}

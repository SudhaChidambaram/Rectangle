import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RectangleTest {
    @Test
    void areaIfHeight3AndWidth4Is12() {
        Rectangle rectangle =  Rectangle.createRectangle(3, 4);

        double area = rectangle.area();

        Assertions.assertEquals(12.0, area);
    }

    @Test
    void areaIfHeight3Point5AndWidth2Pont5Is9Point45() {
        Rectangle rectangle = Rectangle.createRectangle(3.5,2.5);

        double area = rectangle.area();

        Assertions.assertEquals(8.75, area);
    }
}



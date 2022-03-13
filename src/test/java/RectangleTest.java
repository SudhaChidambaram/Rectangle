import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RectangleTest {
    @Test
    void areaOfRectangleIfHeight3AndWidth4Is12() {
        Rectangle rectangle = Rectangle.createRectangle(3, 4);

        double area = rectangle.area();

        Assertions.assertEquals(12.0, area);
    }

    @Test
    void areaOfRectangleIfHeight3Point5AndWidth2Pont5Is9Point45() {
        Rectangle rectangle = Rectangle.createRectangle(3.5, 2.5);

        double area = rectangle.area();

        Assertions.assertEquals(8.75, area);
    }

    @Test
    void perimeterOfRectangleWithHeight2AndWidth4Is12() {
        Rectangle rectangle = Rectangle.createRectangle(2, 4);

        double perimeter = rectangle.perimeter();

        Assertions.assertEquals(12, perimeter);
    }


}



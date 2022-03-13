import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RectangleTest {

    @Test
    void areaOfRectangleIfHeight3Point5AndWidth2Pont5Is9Point45() {
        Rectangle rectangle = Rectangle.createRectangle(3.5, 2.5);

        double area = rectangle.area();

        Assertions.assertEquals(8.75, area);
    }

    @Test
    void perimeterOfRectangleWithHeight2Point5AndWidth4Point1Is13Point2() {
        Rectangle rectangle = Rectangle.createRectangle(2.5, 4.1);

        double perimeter = rectangle.perimeter();

        Assertions.assertEquals(13.2, perimeter);
    }

    @Test
    void areaOfSquareIfHeight3Point5AndWidth3Pont5Is102Point25() {
        Rectangle square = Rectangle.createSquare(3.5);

        double area = square.area();

        Assertions.assertEquals(12.25, area);
    }
}



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RectangleTest {

    @Test
    void areaOfRectangleIfHeight3Point5AndWidth2Pont5Is9Point45() {
        Rectangle rectangle = Rectangle.createRectangle(3.5, 2.5);

        double areaRectangle = rectangle.area();

        Assertions.assertEquals(8.75, areaRectangle);
    }

    @Test
    void perimeterOfRectangleWithHeight2Point5AndWidth4Point1Is13Point2() {
        Rectangle rectangle = Rectangle.createRectangle(2.5, 4.1);

        double perimeterRectangle = rectangle.perimeter();

        Assertions.assertEquals(13.2, perimeterRectangle);
    }

    @Test
    void areaOfSquareWithSide3Point5IsPoint25() {
        Rectangle square = Rectangle.createSquare(3.5);

        double areaSquare = square.area();

        Assertions.assertEquals(12.25, areaSquare);
    }

    @Test
    void perimeterOfSquareWithSide7Point1Is28Point4() {
        Rectangle square = Rectangle.createSquare(7.1);

        double perimeterSquare = square.perimeter();

        Assertions.assertEquals(28.4, perimeterSquare);
    }
}



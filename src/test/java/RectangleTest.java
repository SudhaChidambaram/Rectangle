import org.junit.jupiter.api.Test;


public class RectangleTest {
        @Test
        void areaIfHeight3AndWidth4Is12() {
            Rectangle rectangle = new Rectangle(3, 4);
            double area = rectangle.area();
        }
    }



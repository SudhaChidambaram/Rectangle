public class Rectangle{
        private final double height;
        private final double width;

        public Rectangle(double height, double width) {
            this.height = height;
            this.width = width;
        }
        public Rectangle createSquare(float side)
        {
            return new Rectangle(side,side);
        }
        public Rectangle createRectangle(float length, float width)
        {
            return new Rectangle(length,width);
        }

        public double area() {
            return height*width;
        }

        public float perimeter(){
            return (float) (2*(height+width));
        }
    }



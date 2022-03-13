public class Rectangle{
        private final double height;
        private final double width;

        public Rectangle(double height, double width) {
            this.height = height;
            this.width = width;
        }
        public static Rectangle createSquare(double side)
        {
            return new Rectangle(side,side);
        }
        public static Rectangle createRectangle(double length, double width)
        {
            return new Rectangle(length,width);
        }

        public double area() {
            return height*width;
        }

        public double perimeter(){
            return 2*(height+width);
        }
    }



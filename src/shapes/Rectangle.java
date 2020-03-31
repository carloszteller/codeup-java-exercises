package shapes;

public class Rectangle extends Quadrilateral {
//    protected static double width;
//    protected static double length;
//
//    public Rectangle(double width, double length) {
//        this.width = width;
//        this.length = length;
//    }
//
//    public double getArea() {
//        return width * length;
//    }
//
//    public double getPerimeter() {
//        return (2 * width) + (2 * length);
//    }

    public Rectangle(double width, double length) {
        super(width, length);
    }

    @Override
    public void setWidth(double width) {
        this.length = width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return (2 * this.width) + (2 * this.length);
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }
}

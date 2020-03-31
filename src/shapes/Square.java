package shapes;

public class Square extends Quadrilateral {
//    private double side;
//
//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    @Override
//    public double getArea() {
//        return Math.pow(side, 2);
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 4 * side;
//    }
    private double side;

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setWidth(double side) {
        this.side = side;
    }

    @Override
    public void setLength(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }
}

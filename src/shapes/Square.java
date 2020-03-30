package shapes;

public class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }

    @Override
    public int getArea() {
        return (int) Math.pow(width, 2);
    }

    @Override
    public int getPerimeter() {
        return 4 * width;
    }
}

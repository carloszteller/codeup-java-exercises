package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double width;
    protected double length;

    public Quadrilateral(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public abstract void setWidth(double width);

    public abstract void setLength(double length);
}

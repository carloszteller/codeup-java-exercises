import shapes.Circle;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input i = new Input();

        System.out.print("Enter the radius of the circle: ");
        double r = i.getDouble();
        Circle c = new Circle(r);

        System.out.println("The circumference of the circle is: " + c.getCircumference());
        System.out.println("The circumference of the circle is: " + c.getArea());
    }
}

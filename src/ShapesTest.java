import shapes.Rectangle;
import shapes.Square;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5);

        System.out.println("Area of Box1: " + box1.getArea());
        System.out.println("Perimeter of Box1: " + box1.getPerimeter());

        System.out.println();

        Rectangle box2 = new Square(5);

        System.out.println("Area of Box2: " + box2.getArea());
        System.out.println("Perimeter of Box2: " + box2.getPerimeter());
    }
}

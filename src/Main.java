public class Main{

    public static void main(String[] args)  {
        Circle circle = new Circle(5);
        System.out.println(circle.toString());
        circle.print();

        Triangle triangle = new Triangle(2,3,4);
        System.out.println(triangle.toString());
        triangle.print();

        Rectangle rectangle = new Rectangle(4,5);
        System.out.println(rectangle.toString());
        rectangle.print();

        Square square = new Square(5);
        System.out.println(square.toString());
        square.print();

       }
}
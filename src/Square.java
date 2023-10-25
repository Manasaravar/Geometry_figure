public class Square extends Figure {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double perimeter() {
        return 4*side;
    }

    @Override
    public double area() {
        return Math.pow(side,2);
    }

    @Override
    public String toString() {
        return "Сторона квадрата = " + side + ", Периметр = " + perimeter() + " Площадь = " + area();
    }

    @Override
    public void print() {
        System.out.println("Рисуем квадрат");
        for(int i = 0; i < side; i++)  //Этот цикл повторяет вывод строки на экран
        {
            for (int j = 0; j < side; j++) //Этот цикл повторяет вывод звездочки на экран
            {
                System.out.print("* ");
            }
            System.out.println();   //После вывода строки нужно перейти на новую строку
        }
    }
}

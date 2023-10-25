public class Rectangle extends Square{
    private double otherSide;

    public double getOtherSide() {
        return otherSide;
    }

    public void setOtherSide(double otherSide) {
        this.otherSide = otherSide;
    }

    public Rectangle(double side, double otherSide) {
        super(side);
        this.otherSide = otherSide;
    }

    @Override
    public double perimeter() {
        return 2*(super.getSide() + otherSide);
    }

    @Override
    public double area() {
        return super.getSide()*otherSide;
    }
    @Override
    public String toString() {
        return  "Стороны прямоугольнка = " + super.getSide() + ", " + otherSide + ", Периметр = " + perimeter() + ", Площадь = " + area();
    }

    @Override
    public void print() {
        System.out.println("Рисуем прямоугольник");
        for(int i = 0; i < super.getSide(); i++)  //Этот цикл повторяет вывод строки на экран
        {
            for (int j = 0; j < otherSide; j++) //Этот цикл повторяет вывод звездочки на экран
            {
                System.out.print("* ");
            }
            System.out.println();   //После вывода строки нужно перейти на новую строку
        }
    }
}

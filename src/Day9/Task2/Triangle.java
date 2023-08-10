package Day9.Task2;

public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }


    //private double s=p2*(p2-a)*(p2-b)*(p2-c);

    @Override
    public double area() {
        double p=a+b+c;
        double p2=p/2;
        return Math.sqrt(p2*(p2-a)*(p2-b)*(p2-c));
    }

    @Override
    public double perimeter() {
        return a+b+c;
    }
}

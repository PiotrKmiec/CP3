import java.lang.Math;
public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public double area(){
        double s = (this.a + this.b + this.c)/2.0;
        double area = Math.pow((s*(s-this.a)*(s-this.b)*(s-this.c)),(1.0/2.0));
        return area;
    }

    public double perimiter(){
        return a+b+c;
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

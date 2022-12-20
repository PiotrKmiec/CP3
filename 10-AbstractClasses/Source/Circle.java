import java.lang.Math;
public class Circle extends Shape {
    private double radius;
    
    public double area(){
        return radius*radius*Math.PI;
    }

    public double perimiter(){
        return 2.0 * Math.PI * this.radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}

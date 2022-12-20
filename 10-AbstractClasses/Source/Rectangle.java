public class Rectangle extends Shape {
    private double x;
    private double y;

    public double area(){
        return x*y;
    }

    public double perimiter(){
        return x+y;
    }

    public double getWidth() {
        return x;
    }

    public double getHeight() {
        return y;
    }

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

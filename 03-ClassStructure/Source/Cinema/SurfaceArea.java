public class SurfaceArea
{
    public static double circle(double radius){
        return Math.PI * radius * radius;
    }
    
    public static double rectangle(double a, double b){
        return a * b;
    }
    
    public static double triangle(double base, double height){
        return base * height / 2;
    }
    
    public static void main(String[] args){
        System.out.print(circle(3)+"\n");
        System.out.print(rectangle(4,5)+"\n");
        System.out.print(triangle(3,4)+"\n");
    }
}

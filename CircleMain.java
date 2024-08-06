import java.util.*;

class Circle{
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public double area(){
        return 3.14 * radius * radius;
    }
    
    public double perimeter(){
        return 2 * 3.14 * radius;
    }
}

public class CircleMain{
    public static void main(String args[]){
        Circle c = new Circle(10);
        System.out.println("Radius : " + c.getRadius());
        System.out.println("Area : " + c.area());
        System.out.println("Perimeter : " + c.perimeter());
        System.out.println();
        
        c.setRadius(20);
        
        System.out.println("New radius : " + c.getRadius());
        System.out.println("Area : " + c.area());
        System.out.println("Perimeter : " + c.perimeter());
    }
}
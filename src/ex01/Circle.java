package ex01;

public class Circle {
private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }
    public double calculatePerimeter(){
        return (2 * Math.PI) * this.radius ;
    }
}

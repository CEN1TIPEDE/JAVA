public class Circle2 implements GeometricObjectInterface {
    private double radius;
    private final double PI = Math.PI;

    public Circle2(double radius) {
    this.radius = radius;
    }
    public void setRadius(double radius){
    this.radius = radius;
    }
    public double getRadius() {
    return radius;
    }
    public double getArea(){
    return radius*radius*PI;
    }
    public double getPerimeter(){
    return 2*radius*Math.PI;
    }
}
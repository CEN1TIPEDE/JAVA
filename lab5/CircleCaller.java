public class CircleCaller{
    public static void main(String[] args){
        Circle c1 = new Circle();
        c1.setRadius(2.5);
        System.out.println("---After the first Circle created---");
        System.out.println(c1.getNumberOfCircleObjects());
        System.out.println(Circle.getNumberOfCircleObjects());
        System.out.println(c1.countCircleObject);
        System.out.println(Circle.countCircleObject);
        Circle c2 = new Circle();
        c2.setRadius(4);
        System.out.println("---After the second Circle created---");
        System.out.println(c2.getNumberOfCircleObjects());
        System.out.println(Circle.getNumberOfCircleObjects());
        System.out.println(c2.countCircleObject);
        System.out.println(Circle.countCircleObject);
        Circle c3 = new Circle();
        System.out.println("---After the third Circle created---");
        System.out.println(c3.getNumberOfCircleObjects());
        System.out.println(Circle.getNumberOfCircleObjects());
        System.out.println(c3.countCircleObject);
        System.out.println(Circle.countCircleObject);
        }   
 }
class Circle{
    double radius;
    final double PI = 3.14159;
    double xcoor;
    double ycoor;
    public static int countCircleObject;
    public void setCenter(int x, int y){
        xcoor= x;
        ycoor= y;
    }
    public void printInfo(){
        System.out.println("The circle have:");
        System.out.println("radius = "+radius);
        System.out.println("area = "+getArea());
        System.out.println("diameter = "+getDiameter());
        System.out.println("coordinate  = ("+xcoor+","+ycoor+")");
    }   
    public double getAreaOfCircles(int n){
        return getArea();
    }
    public double getDiameter(){
        return 2*radius;
    }
    public void setRadius(double r){
        radius = r;
        countCircleObject++;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        double area = PI*radius*radius;
        return area;
    }
    public double getPerimeter(){
        return 2*PI*radius;
    }
    public static int getNumberOfCircleObjects(){
        return countCircleObject;
    }
}
class CircleService{
    private final static double PI = 3.14159;
    public static double getArea(double radius){
        return PI*radius*radius;
    }
    public static double getDiameter(double radius){
        return 2*radius;
    }
    public static double getPerimeter(double radius){
        return 2*PI*radius;
    }
}
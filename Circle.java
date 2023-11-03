public class Circle{

    private double radius;
    private final double PI = Math.PI;
    private double xcoor;
    private double ycoor;
    public static int circleCounter;

    public Circle(){
        circleCounter++;
    }

        public Circle(double radius){
        this.radius = radius;
        circleCounter++;
        }

        public Circle(double r, double x, double y){
        radius = r;
        xcoor = x;
        ycoor = y;
        circleCounter++;
        }

        public void setRadius(double r){
        radius = r;
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
        
        public double getAreaOfCircles(int n){
        return n*getArea();
        }
        
        public double getDiameter(){
        return 2*radius;
        }
        
        public void setCenter(int x, int y){
        xcoor = x;
        ycoor = y;
        }
        
        public void printInfo(){
            System.out.println("The circle have:");
            System.out.println("radius = " +radius);
            System.out.println("area = " +getArea());
            System.out.println("area = " +getPerimeter());
            System.out.println("diameter = " +getDiameter());
            System.out.println("coordinate = ("+xcoor+","+ycoor+")");
        }

        public String getCenter(){
            return xcoor + "," + ycoor;
        }
    }
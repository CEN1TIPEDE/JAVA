class Circle {
        double radius;
        final double PI = 3.14159;
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
}
class CircleCaller {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        // System.out.println(c1.setRadius(2.5));
        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
    }
}


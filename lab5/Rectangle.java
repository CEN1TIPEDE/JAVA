public class Rectangle {
    double width;
    double height;
    public void setWidthHeight(double w,double h){
        width = w;
        height = h;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public double getPerimeter(){
        double Peri = (width + height ) * 2;
        return Peri;
    }
    public double getArea(){
        double area = width * height;
        return area;
    }    
    public void printInfo(){
        System.out.println("This Rectangle have----------------------");
        System.out.println("Width : " +getWidth()+ " Height : " + getHeight());
        System.out.println("Perimeter : " + getPerimeter() + " area = "+ getArea());
    }
}
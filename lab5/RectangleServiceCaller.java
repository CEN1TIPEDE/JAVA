public class RectangleServiceCaller {
    public static void main(String[] args){
        double widthP = 15;
        double heightP = 10;
        double widthA = 8;
        double heightA = 7;
        double perimeter = RectangleService.getPerimeter(widthP,heightP);
        double area = RectangleService.getArea(widthA,heightA);
        System.out.println("Perimeter is : "+perimeter);
        System.out.println("Area is : "+area);
    }
}
 
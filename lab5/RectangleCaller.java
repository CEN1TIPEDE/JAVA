public class RectangleCaller {
    public static void main(String[] args){
        Rectangle d1 = new Rectangle();
        Rectangle d2 = new Rectangle();
        Rectangle d3 = new Rectangle();
        d1.setWidthHeight(5,10);
        d1.printInfo();
        d2.setWidthHeight(2.5,1.5);
        d2.printInfo();
        d3.setWidthHeight(25,5);
        d3.printInfo();
        System.out.println("-----First Rectangle-----");
        System.out.println(d1.getPerimeter());
        System.out.println(d1.getArea());
 
        System.out.println("-----Second Rectangle-----");
        System.out.println(d2.getPerimeter());
        System.out.println(d2.getArea());
       
        System.out.println("-----Third Rectangle-----");
        System.out.println(d3.getPerimeter());
        System.out.println(d3.getArea());
       
    }
}
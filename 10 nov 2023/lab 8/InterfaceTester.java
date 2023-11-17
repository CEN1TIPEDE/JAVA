public class InterfaceTester {
    public static void main(String args[]){
        System.out.println(Circle2.color);
        Circle2.color = "green";
        Circle c2 = new Circle();
        System.out.println(c2.color); // color cannot changebecause I've set the color as a final attribute. 
        c2.setRadius(3);
        System.out.println(c2.getRadius());
        System.out.println(c2.getArea());
        System.out.println(c2.getPerimeter());
    }
}
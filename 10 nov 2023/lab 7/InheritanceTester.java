public class InheritanceTester {
    public static void main(String[] args){
        InheritanceTester tester = new InheritanceTester();
        GeometricObject g1 = new GeometricObject();
        // g1.printInfo();
        tester.printGeometricObjectInfo(g1);

        Circle c1 = new Circle();
        // c1.printInfo();
        tester.printGeometricObjectInfo(c1);

        Rectangle r1 = new Rectangle();
        // r1.printInfo();
        tester.printGeometricObjectInfo(r1);
    }

    public void printGeometricObjectInfo(GeometricObject g){
        g.printInfo();
    }
}
// it print : The Geometric is blue but it is not filled.
// The Geometric is white and it is filled.
// It is a circle with radius of 1.0
// The Geometric is green and it is filled.
// It is a rectangle with width of 1.0 and height of 1.0
// because we have printInfo() in mathod.
// printGeometricObjectInfo(GeometricObject g) work with the input type of Circle and Rectangle because they are inherit from Geo, which means they are also one of or in Geo class.
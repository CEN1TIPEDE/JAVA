public class CarLab {
    public static void main(String [] args){
        Car nonCar = new Car();
        Car baifernCar = new Car("rainbow", "Toyota",6);
        Car test = new Car("Mitsubishi");

        test.printInfo();

        // baifernCar.printInfo();

        // nonCar = nonCar.changeCar(baifernCar);

        // nonCar.printInfo();
        // baifernCar.printInfo();
    }
}

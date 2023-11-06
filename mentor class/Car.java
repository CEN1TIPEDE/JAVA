public class Car {
    String color;
    String brand;
    int seats;

    public Car()
    {
        color = "black";
        brand = "BMW";
        seats = 4;
    }

    public Car(String color, String brand, int seats)
    {
        this.color = color;
        this.brand = brand;
        this.seats = seats;
    }

    public Car(String brand, int seats)
    {
        color = "white";
        this.seats = seats;
    }

    public Car(String brand){
        this();
    }

    public String changeColor(String color)
    {
        this.color = color;
        return color;
    }

    public String changeBrand(String brand)
    {
        this.brand = brand;
        return brand;
    }

    public int changeSeat(int seats)
    {
        this.seats = seats;
        return seats;
    }

    public void printInfo()
    {
        System.out.println(color);
        System.out.println(brand);
        System.out.println(seats);
        System.out.println("----------------------------");
    }

    public Car changeCar(Car newCar){
        Car oldCar = newCar;
        return oldCar; 
    }

    
}
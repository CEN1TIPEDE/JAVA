class Car2 {
  private String id;
  private String name;
  private String color;
  private int velocity;
  private int distance;
  
  public static int accumulate_distance;
  
  //contructors
  public Car2(String id,String name,String color,int velocity)
  {
    this.id = id;
    this.name = name;
    this.color = color;
    this.velocity = velocity;
  }
  
  //getters
  public String getId(){
    return id;
  }
  
  public int getDistance(){
    return distance;
  }
  
  public int getVelocity(){
    return velocity;
  }
  
  public String getColor(){
    return color;
  }
  
  public String getName(){
    return name;
  }
  
  //setters
  public void setId(String id){
    this.id = id;
  }
  
  public void setVelocity(int velocity){
    this.velocity = velocity;
  }
  
  public void setName(String name){
    this.name = name;
  }
  
  public void setColor(String color){
    this.color = color;
  }
  
  public void setDistance(int distance){
    this.distance = distance;
  }
  
  //method
  public void drive(int time)
  {
    int s = velocity * time;
    distance = distance + s;
    accumulate_distance = accumulate_distance + s;
  }
}

//main method
public class Main {
    public static void main(String[] args) {
        Car2 car1 = new Car2("101", "Car 1", "Blue", 20);
        Car2 car2 = new Car2("R9", "Car 2", "#f2f2f2", 35);
        Car2 car3 = new Car2("AZ-204", "Car 3", "Lightly Green", 2);

        car1.drive(10);
        System.out.println(car1.getDistance());
        System.out.println(Car2.accumulate_distance);

        car2.setColor("Red");
        System.out.println(car2.getColor());

        System.out.println(car1.getName());
        System.out.println(car3.getDistance());
        System.out.println(car3.getVelocity());

        car3.setVelocity(100);
        car3.drive(20);
        car2.drive(60);
        System.out.println(Car2.accumulate_distance);

        car1.setName("New Name");
        car3.setId("AZ-303");
        System.out.println(car1.getName());
        System.out.println(car3.getId());
    }
}


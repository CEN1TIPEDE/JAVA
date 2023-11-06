public class Dog extends Animal {
    String owner;

    public Dog(String name, String owner) {
        super("Dog", name);
        this.owner = owner;
    }

    public void printInfo(){
        System.out.println(type);
        System.out.println(name);
        System.out.println(owner);
    }


    public void bark(){
        System.out.println("woof woof");
    }
}

public class Animal {
    String type;
    String name;

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public void printAnimalInfo(){
        System.out.println(type);
        System.out.println(name);
    }

    public void bark(){
        System.out.println("I don't bark");
    }
}
public class Puppy extends Dog {
    Dog parent;

    public Puppy(Dog parent, String name, String owner){
        super(name, owner);
        this.parent = parent;
    }

    public void printInfo(){
        System.out.println("Parent");
        parent.printInfo();
        System.out.println("----------");
        System.out.println("Puppy name");
        System.out.println(name);
        System.out.println(owner);
    }

    
}

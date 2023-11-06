public class AnimalLab {
    public static void main(String [] args){
        Dog chaoguay = new Dog("chaoguay", "Baifern");
        Puppy cha = new Puppy(chaoguay, "cha", "Baifen");

        cha.bark();
        cha.printAnimalInfo();
    }
}

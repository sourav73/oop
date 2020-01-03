//Main class

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal",1,2,5);
        animal.move(1);

        Dog dog = new Dog("Tommy",1,2,15,2,4,1,"Long Hair");
        dog.eat();
        dog.run();
        dog.move(15);
    }
}

//Animal class

public class Animal {
    private String name;
    private int brain;
    private int size;
    private int weight;

    public Animal(String name, int brain, int size, int weight){
        this.name = name;
        this.brain = brain;
        this.size = size;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Animal.eat() method called");
    }

    public void move(int speed){
        System.out.println("Animal.move() method called. Animal is moving at "+speed);
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}

//Dog class

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private String coat;
    public Dog(String name, int brain, int size, int weight,int eyes,int legs,int tail,String coat){
        super(name,brain,size,weight);
        this.eyes=eyes;
        this.legs=legs;
        this.tail=tail;
        this.coat=coat;
    }

    public void chew(){
        System.out.println("Dog.chew() method called");
    }

    public void walk(){
        System.out.println("\nDog.walk() method called");
        move(5);
    }
    public void run(){
        System.out.println("\nDog.run() method called");
        super.move(10);
    }
    @Override
    public void eat() {
        System.out.println("\nDog.eat() method called");
        chew();
        super.eat();
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() method called");
    }

    @Override
    public void move(int speed) {
        System.out.println("\nDog.move() method called");
        moveLegs(7);
        super.move(speed);
    }

}

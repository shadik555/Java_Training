package Interface;

public class Main  {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        CanRun canRun = dog1;
        dog1 = (Dog)canRun;
        Flyable flyable = new Bird();
        flyable.fly();


    }
}

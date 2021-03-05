public class main {
    public static void main(String[] args) {
       Box box1 = new Box(10);
       Box box2 = box1.increase(5);

        box1.showVolume();
        box2.showVolume();
    }
}
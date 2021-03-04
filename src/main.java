public class main {
    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.width = 11.3;
        myBox.height = 10.2;
        myBox.length = 15;
        double volume = myBox.width * myBox.length * myBox.height;
        System.out.println(volume);


    }
}

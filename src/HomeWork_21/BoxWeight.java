package HomeWork_21;

 public class BoxWeight extends Box {
    private double weight;


    public BoxWeight() {
        super();
        this.weight = 0;
    }

    public BoxWeight(double width, double height, double length, double weight) {
        super(width, height, length);
        this.weight = weight;
    }

    public BoxWeight(double size, double weight) {
        super(size);
        this.weight = weight;
    }

    public BoxWeight(double weight) {
        this.weight = weight;
    }

    public BoxWeight(Box box, double weight) {
        super(box);
        this.weight = weight;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.print("Вес коробки: " + getWeight());
    }

    public double getWeight() {
        return weight;
    }

}

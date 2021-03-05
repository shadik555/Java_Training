package box_lessons;

public class Box {
    private double width;
    private double height;
    private double length;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(double size) {
        width = size;
        height = size;
        length = size;
    }

    public Box() {
        width = 0;
        height = 0;
        length = 0;
    }

    public Box(Box box) {
        this.width = box.width;
        this.length = box.length;
        this.height = box.height;
    }

    public Box increase(int i) {
        return new Box(width * i, height * i, length * i);

    }

    public void setDimens(double width, double height, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public double Volume() {
        return width * height * length;
    }

    public void showVolume() {    //Вызывает метод Volume.
        System.out.println(Volume());
    }

    public int compare(Box box) {
        double thisVolume = Volume();
        double boxVolume = box.Volume();
        int result;
        if (thisVolume > boxVolume) {
            result = 1;
        } else if (thisVolume < boxVolume) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }

    public double getWidth() {
        return width;
    }


    public double getHeight() {
        return height;
    }


    public double getLength() {
        return length;
    }


}

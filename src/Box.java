import com.sun.security.jgss.GSSUtil;

public class Box {
    double width;
    double height;
    double length;

    Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    Box(double size) {
        width = size;
        height = size;
        length = size;
    }

    Box(){
        width = 0;
        height = 0;
        length = 0;
    }

    void setDimens(double width, double height, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    double Volume() { return width * height * length; }
    void showVolume(){    //Вызывает метод Volume.
        System.out.println(Volume());
    }
}


public class Box {
    double width;
    double height;
    double length;


    void setDimens(double width, double height, double length){
        this.height = height;
        this.width = width;
        this.length = length;
    }

    double Volume(){
        return width * height * length;
    }
}


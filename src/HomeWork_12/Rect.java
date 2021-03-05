package HomeWork_12;

public class Rect {
    double lenght;
    double width;

    void setDimens(double lenght, double width){
        this.lenght = lenght;
        this.width = width;
    }

    double perimetr(){
        return (lenght + width) * 2;
    }

    double square(){
        double result = lenght * width;
        return result;
    }

}

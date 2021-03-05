package HomeWork_15;
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

    Box(Box box){
        this.width = box.width;
        this.length=box.length;
        this.height=box.height;
    }
    Box(Box box1, Box box2){
       this.width = box1.width+ box2.width;
       this.length= box1.length+box2.length;
       this.height= box1.height+box2.height;
    }

    Box increase(int i){ return new Box(width*i,height*i,length*i); }
    void setDimens(double width, double height, double length) {
        this.height = height;
        this.width = width;
        this.length = length; }

    Box sumBox(Box box) {return new Box (this.width+box.width, this.height+ box.height, this.length+box.length);}
    double Volume() { return width * height * length; }
    void showVolume(){    //Вызывает метод Volume.
        System.out.println(Volume());
    }

    int compare(Box box){
        double thisVolume = Volume();
        double boxVolume = box.Volume();
        int result;
        if(thisVolume > boxVolume){
            result =  1;
        }else if(thisVolume < boxVolume){
            result = -1;
        }else{
            result = 0;
        }
        return result;
    }
}
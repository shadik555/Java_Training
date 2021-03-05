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

    Box increase(int i){
        return new Box(width*i,height*i,length*i);

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


package HomeWork_15;
/* В классе Box создать метод, который принимает в качестве параметра обьект box , и возвращает новую коробку, у
которой все размеры равны: размеры вызывающего обьекта + размеры переданного обьекта.
Создать конструктор, который принимает 2 коробки. С помощью этого конструктора можно будет создать объект,
который по объему больше чем 2 переданные коробки вместе взятые.
Продемонстрировать работу метода и конструктора в классе Main в методе main.
 */
public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(50.5,20.4,20.5);
        Box box2 = new Box(20);
        Box box3= new Box(box1.sumBox(box2));
        Box box4=new Box(box1,box3);
        box1.showVolume();
        box2.showVolume();
        box3.showVolume();
        double volumeSum = box1.Volume() + box3.Volume();
        System.out.println("box1 + box3 = " + volumeSum);
        box4.showVolume();

    }

}

package HomeWork_12;
/*Создать класс Прямоугольник , в котором 2 поля длина и ширина. Обьявить 3 метода:
1.Метод, который принимает 2 параметра длину и ширину и устанавливает их у нашего прямоугольника
2.Метод без параметров, возвращает периметр прямоугольника
3.Метод без параметров - возвращает площадь прямоугольника.
 */
public class main {
    public static void main(String[] args) {
        Rect rect = new Rect();
        rect.setDimens(15.5,10.5);
        System.out.println("Периметр прямоугольника: "+rect.perimetr());
        System.out.println("Площадь прямоугольника: "+rect.square());
    }
}
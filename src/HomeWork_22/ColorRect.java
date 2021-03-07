package HomeWork_22;

/*Пример наследование от дочерного класса(иерархия классов)
в этом классе будет вызываться реализация методов, которые у
 */
public class ColorRect extends Rect {
    public ColorRect(double a, double b) {
        super(a, b);
    }

    public ColorRect(double size) {
        super(size);
    }
}

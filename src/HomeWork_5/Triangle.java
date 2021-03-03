package HomeWork_5;
/*Написать программу, которая принимает значение катетов а и b , и выводит на экран значение
гипотенузы с.
 */
public class Triangle {
    public static void main(String[] args) {
        double a = 5.5;
        double b = 3.5;
        double c =Math.sqrt(a*a + b*b);
        System.out.println(c);
    }
}

package HomeWork_26;

/*Написать программу, которая выводит на экран случайное число от 10 до 100,
в виде строки "Случайное число...Попробуйте ещё раз", где строка формируется при помощи String.format().
 */
public class Main {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 90 + 10);
        String result = String.format("Случайное число: %s. Попробуйте ещё раз...", random);
        System.out.println(result);

    }
}

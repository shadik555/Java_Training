package HomeWork_19;

import java.sql.SQLOutput;

/*Создать класс Человек. Он содержит 4 поля: имя, должность , возраст и рост. Все поля private. Проинициализировать все поля
в конструкторе.   В классе main вам дана строка:"Это Иван, ему 34 года, его рост 166.3см.Должность - программист".Необходимо
распарсить строку и сохранить в переменные.
Создать обьект Man, в качестве параметров в конструктор передать данные полученные из строки
Вывести на экран все значения переменных( с помощью геттеров)
 */
public class Main {
    public static void main(String[] args) {
        String s ="Это Иван, ему 34 года, его рост 166.3см.Должность - программист";
        String name = s.substring(4,8);
        String position = s.substring(52,63);

        String ageString = s.substring(14,16);
        int age = Integer.parseInt(ageString);
        String heightString = s.substring(32,37);
        double height = Double.parseDouble(heightString);

        Man man = new Man(name,position,age,height);
        System.out.println( "Имя: " +man.getName() + "\nДолжность: "+ man.getPosition() +
                "\nВозраст: " + man.getAge()+" года" + "\nРост: " + man.getHeight() + " см.");
    }
}

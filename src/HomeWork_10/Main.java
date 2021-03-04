package HomeWork_10;

/*Создать класс Человек, в котором будет 3 поля: имя, возраст и вес.
В классе main создать 5 экземпляров класса человек , присвоить значения их полям и вывести на экран
их средний возраст.
 */
public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human();
        Human human3 = new Human();
        Human human4 = new Human();
        Human human5 = new Human();
        human1.age = 15;
        human2.age = 23;
        human3.age = 32;
        human4.age = 20;
        human5.age = 60;
        human1.name = "Sergey";
        human1.name = "Alexey";
        human1.name = "Pavel";
        human1.name = "Olya";
        human1.name = "Slava";
        human1.weight = 80.0;
        human2.weight = 120.5;
        human3.weight = 50.2;
        human4.weight = 40.5;
        human5.weight = 91.5;
        //     double average_age = (human1.age + human2.age + human3.age + human4.age + human5.age) / 5;
        //     System.out.println("Средний возраст 5 человек: " + average_age);
        //либо с помощью массива:

        Human[] human = new Human[5];
        human[0] = human1;
        human[1] = human2;
        human[2] = human3;
        human[3] = human4;
        human[4] = human5;

        int sum = 0;
        for (int i = 0; i < human.length; i++) {
            sum += human[i].age;
        }
        System.out.println("Средний возраст: " + sum / (double) human.length);

    }
}

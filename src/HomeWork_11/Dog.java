package HomeWork_11;

public class Dog {
    String name;
    String breed;
    int speed;

    void run() {
        String result = "";
        for (int i = 0; i < speed; i++) {
            result += "бегу";
            if (i == speed - 1) {
                result += ".";
            } else {
                result += ",";
            }
        }
        System.out.print(result);
    }

    String info() { return "\nКличка: " + name + "\nПорода: " + breed + "\nСкорость: " + speed;}

    }
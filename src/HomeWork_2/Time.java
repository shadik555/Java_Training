package HomeWork_2;

import java.sql.SQLOutput;

/*Создать новый класс, в котором вы вводите количество секунд, а программа выводит
в консоль, сколько это дней, часов , минут и секунд */
public class Time {

    public static void main(String[] args) {
        int seconds = 100000;
        int SecondsInMinute = 60;
        int SecondsInHour = SecondsInMinute * 60;
        int SecondsInDay = SecondsInHour * 24;

        int days = seconds / SecondsInDay;
        int hours = (seconds % SecondsInDay) / SecondsInHour;
        int minutes = ((seconds % SecondsInDay)% SecondsInHour) / SecondsInMinute;
        int leftseconds = seconds - days * SecondsInDay - hours * SecondsInHour - minutes*SecondsInMinute;

        System.out.println("Дано кол-во секунд: " + seconds);
        System.out.println("Это равно: ");
        System.out.println("Дней: " + days);
        System.out.println("Часов: " + hours);
        System.out.println("Минут: "+ minutes);
        System.out.println("Секунд: "+leftseconds);

    }
}

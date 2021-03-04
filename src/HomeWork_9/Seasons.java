package HomeWork_9;

import java.util.Scanner;

/*Написать программу, которая принимает строковую переменную с названием месяца.
И если месяц введен правильно, то вывести на экран время года, к которомму этот месяц относится, в противном
случае вывести сообщение , что месяц не существует.
сначала сделать через if/else , затем с помощью switch/case.
 */
public class Seasons {
    public static void main(String[] args) {   //реализация через if else.
        String Winter = "Ho Ho Ho! It's Winter",
                Spring = " It's Sprint",
                Summer = " It's magic summer !",
                Autumn = " Lonely Autumn...";
        System.out.print("Введите месяц: ");
        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();
//        if (month.equals("Декабрь") || month.equals("Январь") || month.equals("Февраль")) {
//            System.out.println(Winter);
//        } else if (month.equals("Март") || month.equals("Апрель") || month.equals("Май")) {
//            System.out.println(Spring);
//        } else if (month.equals("Июнь") || month.equals("Июль") || month.equals("Август")) {
//            System.out.println(Summer);
//        } else if (month.equals("Сентябрь") || month.equals("Октябрь") || month.equals("Ноябрь")) {
//            System.out.println(Autumn);
//        } else {
//            System.out.println("Такой поры года не существует :(");
//        }
        //Реализация через switch-case

        switch(month){
            case "Декабрь":
            case "Январь":
            case "Февраль":
                System.out.println("Зима!");
                break;
            case "Март":
            case "Апрель":
            case "Май":
                System.out.println("Весна!");
                break;
            case "Июнь":
            case "Июль":
            case "Август":
                System.out.println("Лето!");
                break;
            case "Сентябрь":
            case "Октябрь":
            case "Ноябрь":
                System.out.println("Осень!");
                break;
            default:
                System.out.println("Не существует такой поры года !");
        }
    }
}

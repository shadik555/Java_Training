package HomeWork_8;

/*Создать строковый массив с названиями месяцев, проиниацилизировать сразу.
после этого вывести все названия месяцев в одну строчку и через запятую, а после последнего
слова должна стоять точка.
 */
public class Months {
    public static void main(String[] args) {
        String[] nameOfMonths = {                      //cоздали и инициализировали строчный массив.
                "Январь",
                "Февраль",
                "Март",
                "Апрель",
                "Май",
                "Июнь",
                "Июль",
                "Август",
                "Сентябрь",
                "Октябрь",
                "Ноябрь",
                "Декабрь"
        };

        String result = " ";        //переменная для результата.
        for (int i = 0; i < nameOfMonths.length; i++) {  //в цикле выводим все значения
            result += nameOfMonths[i];
            if (i == nameOfMonths.length - 1) { // если счетчик равен последнему числу ставим точку.
                result += ".";
            } else {       //иначе запятую
                result += ", ";
            }
            System.out.print(result);
        }
    }
}

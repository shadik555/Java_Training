package HomeWork_24;

public class MyCounter implements Counter {

    @Override
    public String report(int months) {
        return "Отчет за: " + months + " месяцев...";
    }
}

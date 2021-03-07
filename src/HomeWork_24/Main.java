package HomeWork_24;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.force(new Counter() {
            @Override
            public String report(int months) {
                return "Отчёт за: " + months + " месяцев";
            }
        }, 5);
    MyCounter counter = new MyCounter();
    director.force(counter,5);
    }

}

package Anonim;

public class main {
    public static void main(String[] args) {
        Director director = new Director();

        director.force(new Cookable() {
            @Override
            public void cook() {
                System.out.println("Готовлю...");
            }
        });
    }
}

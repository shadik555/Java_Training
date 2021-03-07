package inheritance;

public class CatFamily {
    private int ears;
    private int legs;
    private boolean bigClaws;


    public CatFamily(int ears, int legs, boolean bigClaws) {
        this.ears = ears;
        this.legs = legs;
        this.bigClaws = bigClaws;
    }

    public void showInfo(){
        System.out.println("Количесвто ушей: "+ears +"\nКоличество ног: "+ legs + "\nБольшие когти: "+bigClaws);
    }

    public void setBigClaws(boolean bigClaws) {
        this.bigClaws = bigClaws;
    }


    public void eat(){
        System.out.println("Кушаю");
    }

}

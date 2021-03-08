package HomeWork_27;
/*В главном потоке создать переменную int , которой присваивается случайное значение от 0 до 1000000,
после этого создать 2 потока, один будет в роли таймера выводить числа по порядку каждую секунду, А второй
будет пытаться угадать случайное число, причем не перечисляя все числа подряд , а тоже генерируя случайные числа
Когда поток угадает число , таймер должен остановиться , а загаданное число появиться на экране.
 */
public class Main {
    static boolean win = false;
    public static void main(String[] args) {
        int random1 =(int) (Math.random()*1000000000);
        System.out.println(random1);
        Thread timer1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    int i = 0;
                    while(!win) {
                        System.out.println(i);
                        i++;
                        Thread.sleep(1000);
                    }
                }catch(InterruptedException e){

                }
            }

       });
        Thread player = new Thread(new Runnable() {
            @Override
            public void run() {
                while(!win){
                    int guessNumber = (int)(Math.random()* 1000000000);{
                        if(guessNumber == random1){
                            win = true;
                            System.out.println(guessNumber);
                        }
                    }
                }
            }
        });

        timer1.start();
        player.start();
    }
}

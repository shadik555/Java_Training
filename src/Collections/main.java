package Collections;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 1000; i ++ ){
            numbers.add(i);
        }
        int sum = 0;
        for(int i : numbers){
            sum += i;
        }
        System.out.println(sum);

    }
}
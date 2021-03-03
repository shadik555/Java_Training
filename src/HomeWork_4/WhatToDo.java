package HomeWork_4;
/*Напишите программу, которая принимает 2 параметра типа boolean, первый показывает, что уже ночь, второй показывает
, что на улице хорошая погода. И в зависимости от условий показывает, что вам делать. Если уже ночь, то
выводится надпись "Спать". Если сейчас день и на улице хорошая погода, тогда надпись "гулять". Если сейчас день
и на улице плохая погода, тогда "Читать книгу".
 */
public class WhatToDo {
    public static void main(String[] args) {
        int time = 15;
        boolean isGoodWeather = false;
        boolean late = time >=23 || time <= 5;
        if(late){
            System.out.println("Спать.");
        }
        if(!late && isGoodWeather){
            System.out.println("Гулять !");
        }
        if(!late && !isGoodWeather){
            System.out.println("Читать книгу ...");
        }

    }
}

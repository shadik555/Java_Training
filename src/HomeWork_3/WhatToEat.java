package HomeWork_3;
/*Написать программу, которая советует вам, что купить в зависимости от кол-во денег в
вашем кармана. Например: Если у вас больше 500 рублей, то программа выводит "Пицца", если меньше
100 рублей, то "Доширак".
 */
public class WhatToEat {
    public static void main(String[] args) {
        int moneyinpocket = 0;
        if(moneyinpocket > 500){
            System.out.println("Можешь купить пиццу.");
        }else if(moneyinpocket < 500 && moneyinpocket > 100){
            System.out.println("Можешь купить маленькую пиццу");
        }else if(moneyinpocket <= 100 && moneyinpocket > 0){
            System.out.println("Можешь купить доширак...");
        }else{
            System.out.println("Тебе надо заработать денег...");
        }
    }
}

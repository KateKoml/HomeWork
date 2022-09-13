package Lesson3;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        if (day == 1) {
            System.out.println("Понедельник");
        } else if(day == 2) {
            System.out.println("Вторник");
        } else if(day == 3) {
            System.out.println("Среда");
        } else if(day == 4) {
            System.out.println("Четверг");
        } else if(day == 5) {
            System.out.println("Пятница");
        } else if(day == 6) {
            System.out.println("Суббота");
        } else if(day == 7) {
            System.out.println("Воскресенье");
        } else {
            System.out.println("Такого дня не существует");
        }
    }
}

package Lesson3;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        if ((hour >= 0 && hour < 6) || hour == 24) {
            System.out.println("Доброй ночи");
        } else if (hour >= 6 && hour < 12) {
            System.out.println("Доброе утро");
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Добрый день");
        } else if (hour >= 18 && hour <= 23) {
            System.out.println("Добрый вечер");
        } else {
            System.out.println("Ошибка");
        }
    }
}

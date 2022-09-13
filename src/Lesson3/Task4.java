package Lesson3;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        switch (hour) {
            case 0: case 1: case 2: case 3: case 4: case 5: case 24:
                System.out.println("Доброй ночи");
                break;
            case 6: case 7: case 8: case 9: case 10: case 11:
                System.out.println("Доброе утро");
                break;
            case 12: case 13: case 14: case 15: case 16: case 17:
                System.out.println("Добрый день");
                break;
            case 18: case 19: case 20: case 21: case 22: case 23:
                System.out.println("Добрый вечер");
                break;
            default:
                System.out.println("Ошибка");
                break;
        }
    }
}

package Lesson4;

public class Task4 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        while (x <= 10) {
            System.out.print(x + " ");
            while (y <= 9) {
                y++;
                System.out.print(x * y + " ");
            }
            x++;
            y = 1;
            System.out.println("");
        }
    }
}

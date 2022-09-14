package Lesson4;

public class Task3 {
    public static void main(String[] args) {
        int f0 = 1;
        int f1 = 1;
        int f2;
        System.out.println(f0 + "\n" + f1);
        for (int i = 3; i <= 10; i++) {
            f2 = f0 + f1;
            System.out.println(f2);
            f0 = f1;
            f1 = f2;
        }
    }
}

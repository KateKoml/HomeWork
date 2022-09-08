package Lesson2;

public class Task4 { /* В переменной n хранится целое трехзначное число.
                        Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
                     */
    public static void main(String[] args) {

        int n = 921;
        int count = 0;
        for(int i = 0; i < 3; i++){
            count += n % 10;
            n = n / 10;
        }

        System.out.println(count);
    }
}

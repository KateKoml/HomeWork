package Lesson2;

public class Task2 { /* Есть прямоугольник, у которого известна ширина w и высота h.
                        Высота и ширина прямоугольника должны задаваться переменными в программе.
                        Найти и вывести в консоль: периметр прямоугольника,  площадь прямоугольника
                     */
    public static void main(String[] args) {

        int w = 5;
        int h = 8;
        int P = 2 * (w + h);
        int S = w * h;

        System.out.printf("Периметр прямоугольника = %d\nПлощадь прямоугольника = %d", P, S);
    }
}
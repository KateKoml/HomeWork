package Lesson2;

public class Task3 { /* Подсчитать площадь и длину окружности для круга с радиусом r.
                        Радиус должен быть задан переменной в программе. Вывести результат в консоль.
                     */
    public static void main(String[] args) {

        double r = 3;
        final double PI = 3.14;
        double S = PI * Math.pow(r, 2);
        double L = 2 * PI * r;

        System.out.printf("Площадь оклужности = %f\nДлина окружности = %f", S, L);
    }
}

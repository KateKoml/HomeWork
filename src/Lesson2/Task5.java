package Lesson2;

public class Task5 { /* Проверить, имеет ли число вещественную часть.
                        Например, число 3.14 – имеют вещественную часть, а число 11.0 – нет.
                     */
    public static void main(String[] args) {

        double num = 56.56;
        boolean isReal = false;

        if(num % (int) num != 0) {
            isReal = true;
        }

        System.out.println((isReal) ? "Число " + num +" имеет вещественную часть" : "Число " + num +" не имеет вещественную часть");
    }
}

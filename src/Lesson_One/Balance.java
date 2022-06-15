package Lesson_One;
// Написать метод увеличения счета (счет и часть для увеличения int, всегда положительные), объяснить какие могут быть проблемы.
public class Balance {
    public static void main(String[] args) {
        System.out.println(getBalance(15, 14));
    }

    public static int getBalance(int avance, int zarplata){
        int oklad = avance + zarplata;
        return oklad;
    }
}

/*
1. Одно или два числа вводятся отрицательными.
2. Финальное значение может быть больше максимально допустимого для целочисленного типа.
3. Числа с плавающей запятой не рассматриваются.
 */

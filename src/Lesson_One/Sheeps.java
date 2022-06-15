package Lesson_One;
//Написать метод ничего принимающий int и выводящий в консоль: Результат равен: значение_переменной овец (штук).
// Метод ничего не возращает, только выводит в консоль.
public class Sheeps {
    public static void main(String[] args) {
        AllSheeps(50);
    }

    public static int AllSheeps (int sheeps) {
        System.out.println("Результат равен: " + sheeps + " овец (штук).");
        return 0;
    }
}

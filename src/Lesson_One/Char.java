package Lesson_One;
//Поиграться с char.
// Объявить переменную, прибавить к ней int значение (допустим 1 10 22) и отнять, объяснить как это рабоатет, т.е. какой результат получаем и почему.
public class Char {
    public static void main(String[] args) {
        //происходит преобразование символьного типа в целочисленный.
        char test = '1';
        int first = 1213;
        int sumTestandFirst = test + first;
        System.out.println(sumTestandFirst);

        //
        char a = 0x41; //В шестнадцатеричной системе соответствует числу 65.
        int sumTestandFirst2 = a + first; //65 + 1213.
        System.out.println(sumTestandFirst2);

        //  так как char - это и целочисленный тип, то можно использвать инкременты.
        //  В данном случае к A(65) прибавляется 1, что в итоге даёт B (66).
        char A = 0x41;
        A++;
        System.out.println(A);
    }

}

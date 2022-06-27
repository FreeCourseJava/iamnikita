//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Lesson_One;

public class Balance {
    public Balance() {
    }

    public static void main(String[] args) {
        System.out.println(getBalance(15, 14));
    }

    public static int getBalance(int avance, int zarplata) {
        int oklad = avance + zarplata;
        return oklad;
    }
}

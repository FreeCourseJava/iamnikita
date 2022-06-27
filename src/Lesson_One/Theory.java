//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Lesson_One;

public class Theory {
    public Theory() {
    }

    public static void main(String[] args) {
        int maxValue = 2147483647;
        ++maxValue;
        maxValue += maxValue;
        System.out.println(maxValue);
        int CZH = 1000000;
        CZH *= CZH;
        System.out.println(CZH);
        long maxLong = 9223372036854775807L;
        ++maxLong;
        System.out.println(maxLong);
        float maxFloat = 1.0E9F;

        for(int i = 0; i < 5; ++i) {
            maxFloat *= maxFloat;
            System.out.println(maxFloat);
        }

    }
}

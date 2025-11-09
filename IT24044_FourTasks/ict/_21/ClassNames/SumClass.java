package ict._21.ClassNames;

public class SumClass {
    public static double getSum() {
        double sum = 0.0;
        double i = 1.0;
        do {
            sum += i;
            i -= 0.1;
        } while (i >= 0.1);
        return Math.round(sum * 100.0) / 100.0;
    }
}

package ict._21.ClassNames;

public class NumberConversionClass {

    public static String decToBin(int n) {
        return Integer.toBinaryString(n);
    }

    public static int binToDec(String b) {
        return Integer.parseInt(b, 2);
    }

    public static String decToHex(int n) {
        return Integer.toHexString(n).toUpperCase();
    }

    public static int hexToDec(String h) {
        return Integer.parseInt(h, 16);
    }

    public static String decToOct(int n) {
        return Integer.toOctalString(n);
    }

    public static int octToDec(String o) {
        return Integer.parseInt(o, 8);
    }
}

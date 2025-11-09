package ict._21.ClassNames;

public class MainClass {
    public static void main(String[] args) {
        CustomPrintClass.pr("Sum = " + SumClass.getSum());

        int a = 12, b = 18;
        CustomPrintClass.pr("GCD of " + a + "," + b + " = " + DivisorMultipleClass.gcd(a,b));
        CustomPrintClass.pr("LCM of " + a + "," + b + " = " + DivisorMultipleClass.lcm(a,b));

        int num = 25;
        CustomPrintClass.pr("Binary of 25 = " + NumberConversionClass.decToBin(num));
        CustomPrintClass.pr("Hex of 25 = " + NumberConversionClass.decToHex(num));
        CustomPrintClass.pr("Octal of 25 = " + NumberConversionClass.decToOct(num));
    }
}

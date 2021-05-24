package ru.netology;

public class BinOps {
    public String sum(String a, String b) {
        int binaryArg1 = Integer.parseInt(a, 2);
        int binaryArg2 = Integer.parseInt(b, 2);
        int resultSum = binaryArg1 + binaryArg2;
        return Integer.toBinaryString(resultSum);
    }

    public String mult(String a, String b) {
        int binaryArg1 = Integer.parseInt(a, 2);
        int binaryArg2 = Integer.parseInt(b, 2);
        int resultMult = binaryArg1 * binaryArg2;
        return Integer.toBinaryString(resultMult);
    }
}
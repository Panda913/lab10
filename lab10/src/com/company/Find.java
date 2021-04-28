package com.company;

public class Find {
    public static double log(double a, double b) throws  ArithmeticException{
        return Math.log(a) / Math.log(b);
    }

    public static double Find33(final double a, final double b, final double c, final double d) throws  ArithmeticException {
        double part1 = 5 * c / (1 / Math.tan(Math.cbrt(a)));
        double part2 = Math.sqrt(Math.sqrt(Math.cbrt(Math.tanh(Math.abs(b) * c) / log(d, c))));
        return part1 + part2;
    }

    public static double Find34(final double a, final double b, final double c, final double d)   throws  ArithmeticException{
        double part1 = 5 * a * b / Math.sqrt(Math.tan(a));
        double part2 = Math.sqrt(Math.tanh(Math.sqrt(Math.abs(b)) * c) / log(d, c));
        return part1 + part2;
    }

    public static double Find35(final double a, final double b, final double c, final double d) throws  ArithmeticException{
        double part1 = 15 * c / Math.log10(Math.sqrt(Math.sqrt(Math.tan(a))));
        double part2 = Math.sqrt(1 / log(d, c));
        return part1 + part2;
    }
}
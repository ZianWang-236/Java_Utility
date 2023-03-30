package test;

import java.math.BigDecimal;

public class bigDecimal {
    public static void main(String[] args) {
        bigDecimal.bigdecimal();
        System.out.println("-------------------------------------------");
        regulardouble();
    }

    public static void bigdecimal(){
        BigDecimal a = new BigDecimal("1.555");
        BigDecimal b = new BigDecimal("0.005");
        System.out.println(a);
        System.out.println(b);
        BigDecimal c = a.subtract(b);
        System.out.println(c);
        int res = a.compareTo(b);
        System.out.println(res);
    }

    public static void regulardouble(){
        double a = 0.09;
        double b = 0.02;
        System.out.println(a);
        System.out.println(b);
        double c = a - b;
        System.out.println(c);
    }
}

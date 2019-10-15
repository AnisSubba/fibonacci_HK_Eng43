package com.spartagloabal.fibonacci_hk_Eng_43;

public class Fibonacci {
    private int a = 0;
    private int b = 1;
    private int sum;
    private int fibEnd;

    public Fibonacci(int fibEnd) {
        this.fibEnd = fibEnd;
    }

    public void result() {
        System.out.println(a);
        System.out.println(b);

        for (int i = 2; i < fibEnd ; i++) {
            sum = a + b;
            a = b;
            b = sum;

            System.out.println(sum);

        }
    }

}

package org.proghax333.upgrad_modules.java.java2.oops2.take_home;

class MathOperations {
    int sqrt(int x) {
        int k = 0;

        while(true) {
            if(k * k == x) {
                return k;
            } else if(k * k > x) {
                return k - 1;
            }

            k++;
        }
    }

    int cbrt(int x) {
        int k = 0;

        while(true) {
            if(k * k * k == x) {
                return k;
            } else if(k * k * k > x) {
                return k - 1;
            }

            k++;
        }
    }

    int factorial(int n) {
        int r = 1;

        if(n <= 1) {
            return 1;
        }

        for(int i = 2; i <= n; ++i) {
            r *= i;
        }

        return r;
    }

    long factorial(long n) {
        int r = 1;

        if(n <= 1) {
            return 1;
        }

        for(long i = 2; i <= n; ++i) {
            r *= i;
        }

        return r;
    }
}


public class MathOperationsProgram {
    public static void main(String[] args) {
        MathOperations m = new MathOperations();

        System.out.println(m.sqrt(64));
        System.out.println(m.cbrt(27));
        System.out.println(m.factorial(5));
        System.out.println(m.factorial(4L));
    }
}

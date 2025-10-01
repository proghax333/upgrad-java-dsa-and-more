package org.proghax333.assignments_05sept;

public class Q2MatrixMultiplication {
    public static int[][] matrixMultiply(int[][] m1, int[][] m2) {
        int p1 = m1.length, q1 = m2.length;
        int p2 = m1[0].length, q2 = m2[0].length;

        if(p2 != q1) {
            throw new RuntimeException("Invalid dimensions for matrices.");
        }

        int[][] result = new int[p1][q2];

        for(int i = 0; i < p1; ++i) {
            for(int j = 0; j < q2; ++j) {
                int s = 0;

                for(int k = 0; k < p1; ++k) {
                    s += m1[i][k] * m2[k][j];
                }

                result[i][j] = s;
            }
        }

        return result;
    }

    public static void matrixPrint(int[][] m) {
        int p1 = m.length, q1 = m[0].length;

        for(int i = 0; i < p1; ++i) {
            for(int j = 0; j < q1; ++j) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] m1 = {
                {1, 2},
                {3, 4}
        };

        int[][] m2 = {
                {1, 1},
                {1, 1}
        };

        int[][] result = matrixMultiply(m1, m2);
        matrixPrint(result);
    }
}

package org.proghax333.assignments_05sept;

public class Q6SpiralMatrixPrinting {
    public static void printSpiral(int[][] m, int p, int q) {
        int t = -1, r = q, b = p, l = -1;

        int c = 0, limit = p * q;
        int direction = 0;
        int[][] d = {
                { 1, 0 },
                { 0, 1 },
                { -1, 0 },
                { 0, -1 }
        };

        int x = 0, y = 0;

        while(c < limit) {
            if(direction == 0 && x == r) {
                ++t;
                direction = 1;
                x = r - 1;
            } else if(direction == 1 && y == b) {
                --r;
                direction = 2;
                y = b - 1;
            } else if(direction == 2 && x == l) {
                --b;
                direction = 3;
                x = l + 1;
            } else if(direction == 3 && y == t) {
                l++;
                direction = 0;
                y = t + 1;
            } else {
                System.out.print(m[y][x] + "  ");
                ++c;
            }

            int dx = d[direction][0], dy = d[direction][1];
            x += dx;
            y += dy;
        }
    }

    public static void main(String[] args) {
        int[][] m = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        printSpiral(m, m.length, m[0].length);
    }
}

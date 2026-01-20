// 3 -2 -4 -9  0    3  7 13 8  -3
// 3  1 -3 -12 -12 -9 -2 11 19 16
//    1 -6 -13  -9  3 10 20 21 15

import java.io.*;

class Main {
    static int nextInt() throws IOException {
        boolean isN = false;
        int c = System.in.read();
        if (c == '-') {
            isN = true;
            c = System.in.read();
        }
        int n = c & 15;
        while ((c = System.in.read()) > 32) {
            n = (n << 3) + (n << 1) + (c & 15);
        }
        return isN ? -n : n;
    }

    public static void main(String[] args) throws IOException {
        int N = nextInt(), K = nextInt();
        int[] arr = new int[N + 1];

        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= N; i++) {
            arr[i] = arr[i - 1] + nextInt();
            if (i - K >= 0) max = Math.max(max, arr[i] - arr[i - K]);
        }
        System.out.print(max);
    }
}
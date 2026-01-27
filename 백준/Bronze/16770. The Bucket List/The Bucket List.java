import java.io.*;

class Main {
    static int nextInt() throws IOException {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) {
            n = (n << 3) + (n << 1) + (c & 15);
        }
        return n;
    }

    public static void main(String[] args) throws IOException {
        int N = nextInt();
        int[] arr = new int[1001];

        int max = Integer.MIN_VALUE;
        while (N-- > 0) {
            int s = nextInt(), t = nextInt(), b = nextInt();
            for (int i = s; i <= t; i++) {
                arr[i] = arr[i] + b;
                if (arr[i] > max) max = arr[i];
            }
        }
        System.out.print(max);
    }
}
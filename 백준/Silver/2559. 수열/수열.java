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
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = nextInt();
        }

        int len = N - K, max = Integer.MIN_VALUE;
        for (int i = 0; i <= len; i++) {
            int sum = 0;
            for (int j = i; j < i + K; j++) {
                sum += arr[j];
            }
            max = Math.max(max, sum);
        }

        System.out.print(max);
    }
}
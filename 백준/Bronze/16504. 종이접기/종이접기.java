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
        long sum = 0L;
        for (int i = 0; i < N * N; i++) sum += nextInt();
        System.out.print(sum);
    }
}
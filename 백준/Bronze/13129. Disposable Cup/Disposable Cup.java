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
        int A = nextInt(), B = nextInt(), N = nextInt();
        StringBuilder sb = new StringBuilder();

        int min = A * N + B;
        sb.append(min).append(' ');
        for (int i = 1; i < N; i++) {
            min += B;
            sb.append(min).append(' ');
        }
        System.out.print(sb);
    }
}
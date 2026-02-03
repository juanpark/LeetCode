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
        int T = nextInt();
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            int N = nextInt();
            int k3 = N / 3, k7 = N / 7, k21 = N / 21;
            int sum = 0;
            sum += arithS(k3) * 3;
            sum += arithS(k7) * 7;
            sum -= arithS(k21) * 21;
            sb.append(sum).append('\n');
        }
        System.out.print(sb);
    }

    static int arithS(int k) {
        return k * (k + 1) / 2;
    }
}
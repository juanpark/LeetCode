import java.io.*;

class Main {
    static final int MOD = 2000_0303;
    
    public static void main(String[] args) throws IOException {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) {
            n = ((n << 3) + (n << 1) + (c & 15)) % MOD;
        }
        System.out.print(n);
    }
}
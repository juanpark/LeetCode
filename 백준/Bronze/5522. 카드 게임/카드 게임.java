import java.io.*;

class Main {
    static int nextInt() throws IOException {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) {
            n = (n << 3) + (n << 1) + (c & 15);
        }
        return n;
    }
    
    static final int TURN = 5;
    
    public static void main(String[] args) throws IOException {
        int sum = 0;
        for (int i = 0; i < TURN; i++) {
            sum += nextInt();
        }
        System.out.print(sum);
    }
}
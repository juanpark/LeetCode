import java.io.*;
import java.util.*;

class Main {
    static int nextInt() throws IOException {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) {
            n = (n << 3) + (n << 1) + (c & 15);
        }
        return n;
    }
    
    public static void main(String[] args) throws IOException {
        int A = nextInt(), B = nextInt();
        System.out.print(Math.min((A / 2), B));
    }
}
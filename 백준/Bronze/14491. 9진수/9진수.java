import java.io.*;

class Main {

    static final int RADIX = 9;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (T > 0) {
            sb.append(T % RADIX);
            T /= RADIX;
        }

        System.out.print(sb.reverse());
    }
}
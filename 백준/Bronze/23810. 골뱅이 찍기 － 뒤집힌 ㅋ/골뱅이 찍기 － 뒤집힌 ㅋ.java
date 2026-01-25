import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder thick = new StringBuilder("@@@@@".repeat(N));
        StringBuilder thin = new StringBuilder("@".repeat(N));
        StringBuilder sb = new StringBuilder();

        for (int r = 0; r < 5; r++) {
            for (int line = 0; line < N; line++) {
                sb.append(r == 0 || r == 2 ? thick : thin).append('\n');
            }
        }
        System.out.print(sb);
    }
}
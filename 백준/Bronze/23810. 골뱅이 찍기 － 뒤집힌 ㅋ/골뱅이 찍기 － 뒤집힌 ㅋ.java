import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        drawLine(N, sb);
        drawSingle(N, sb);
        drawLine(N, sb);
        drawSingle(N, sb);
        drawSingle(N, sb);
        System.out.print(sb);
    }

    static void drawLine(int N, StringBuilder sb) {
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                sb.append("@@@@@");
            }
            sb.append('\n');
        }
    }

    static void drawSingle(int N, StringBuilder sb) {
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                sb.append("@");
            }
            sb.append('\n');
        }
    }
}
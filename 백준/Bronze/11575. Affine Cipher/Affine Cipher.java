import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            char[] word = br.readLine().toCharArray();

            for (char c : word) sb.append((char)(((a * (c - 'A') + b) % 26) + 'A'));
            sb.append('\n');
        }
        System.out.print(sb);
    }
}
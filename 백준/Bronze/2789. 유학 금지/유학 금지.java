import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] word = br.readLine().toCharArray();
        boolean[] ban = new boolean[26];
        for (char c : "CAMBRIDGE".toCharArray()) {
            ban[c - 'A'] = true;   
        }

        StringBuilder sb = new StringBuilder();
        for (char c : word) {
            if (ban[c - 'A']) continue;
            sb.append(c);
        }

        System.out.print(sb);
    }
}
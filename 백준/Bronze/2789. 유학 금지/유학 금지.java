import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] word = br.readLine().toCharArray();
        Set<Character> compSet = new HashSet<>(Arrays.asList('C','A','M','B','R','I','D','G','E'));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length; i++) {
            if (compSet.contains(word[i])) continue;
            sb.append(word[i]);
        }

        System.out.print(sb);
    }
}
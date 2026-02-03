import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < word.length(); i++) sb.append(i).append('\n');
        System.out.print(sb);
    }
}
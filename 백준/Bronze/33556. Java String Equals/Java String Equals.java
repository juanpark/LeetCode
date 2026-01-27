import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine().trim();
        String B = br.readLine().trim();
        
        if (A.equals("null")) A = null;
        if (B.equals("null")) B = null;
        
        StringBuilder sb = new StringBuilder();
        if (A == null) {
            sb.append("NullPointerException").append('\n');
            sb.append("NullPointerException").append('\n');
        } else {
            sb.append(A.equals(B)).append('\n');
            sb.append(A.equalsIgnoreCase(B)).append('\n');
        }
        System.out.print(sb);
    }
}
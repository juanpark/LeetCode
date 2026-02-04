// 1800 - 2000 = -200/400 = -1/2
// 1 / (1 + 10^-1/2) =
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double A = Integer.parseInt(st.nextToken());
        double B = Integer.parseInt(st.nextToken());
        double M = (B - A) / 400;
        double winRate = (1 / (1 + Math.pow(10, M)));
        System.out.printf("%.10f%n", winRate);
    }
}
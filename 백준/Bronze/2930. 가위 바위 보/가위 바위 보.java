import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int R = Integer.parseInt(br.readLine());

        char[] arrA = br.readLine().toCharArray();

        int N = Integer.parseInt(br.readLine());
        char[][] arrB = new char[N][R];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < R; j++) {
                arrB[i][j] = line.charAt(j);
            }
        }

        StringBuilder sb = new StringBuilder();
        int score = 0, max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < R; j++) {
                score += turn(arrA[j], arrB[i][j]);
            }
        }

        for (int i = 0; i < R; i++) {
            int maxS = 0, maxR = 0, maxP = 0;
            for (int j = 0; j < N; j++) {
                maxS += turn('S', arrB[j][i]);
                maxR += turn('R', arrB[j][i]);
                maxP += turn('P', arrB[j][i]);
            }
            max += Math.max(maxS, Math.max(maxR, maxP));
        }

        sb.append(score).append('\n');
        sb.append(max).append('\n');
        System.out.print(sb);
    }

    static int turn(char a, char b) {
        if (a == b) return 1;
        else if (a == 'S' && b == 'P') return 2;
        else if (a == 'R' && b == 'S') return 2;
        else if (a == 'P' && b == 'R') return 2;
        else return 0;
    }
}
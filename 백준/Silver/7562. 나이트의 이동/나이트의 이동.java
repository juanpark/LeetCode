import java.io.*;
import java.util.*;

class Main {
    static int nextInt() throws IOException {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32)
            n = (n<<3) + (n<<1) + (c&15);
        return n;
    }

    static int I, startX, startY, targetX, targetY;

    static int[] dx = {2,2,-2,-2,1,1,-1,-1};
    static int[] dy = {1,-1,1,-1,2,-2,2,-2};

    static boolean[][] visited;

    public static void main(String[] args) throws Exception {

        int T = nextInt();
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {

            I = nextInt();
            startX = nextInt();
            startY = nextInt();
            targetX = nextInt();
            targetY = nextInt();

            visited = new boolean[I][I];

            sb.append(bfs()).append('\n');
        }

        System.out.print(sb);
    }

    static int bfs() {

        Deque<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{startX, startY, 0});
        visited[startX][startY] = true;

        while (!q.isEmpty()) {

            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            int dist = cur[2];

            if (x == targetX && y == targetY)
                return dist;

            for (int i = 0; i < 8; i++) {

                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || ny < 0 || nx >= I || ny >= I)
                    continue;

                if (visited[nx][ny])
                    continue;

                visited[nx][ny] = true;
                q.offer(new int[]{nx, ny, dist + 1});
            }
        }

        return -1;
    }
}
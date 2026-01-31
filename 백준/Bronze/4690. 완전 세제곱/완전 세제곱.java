public class Main {
    public static void main(String[] args) {
        int N = 100;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            int cubeA = i * i * i;

            for (int b = 2; b <= N; b++) {
                for (int c = b + 1; c <= N; c++) {
                    for (int d = c + 1; d <= N; d++) {
                        int cubeB = b * b * b;
                        int cubeC = c * c * c;
                        int cubeD = d * d * d;
                        if (cubeA < cubeB + cubeC + cubeD) break;
                        if (cubeA == cubeB + cubeC + cubeD) {
                            sb.append("Cube = ").append(i)
                                    .append(", Triple = (").append(b).append(",")
                                    .append(c).append(",")
                                    .append(d).append(")\n");
                        }
                    }
                }
            }

        }
        System.out.println(sb);
    }
}
// Cube = 6, Triple = (3,4,5)

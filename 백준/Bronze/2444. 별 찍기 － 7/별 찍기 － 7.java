import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++){
            sb.append(makeStar(i, n));
        }
        for(int i = n - 1; i >= 1; i--){
            sb.append(makeStar(i, n));
        }
        System.out.println(sb);
    }

    private static String makeStar(int i, int n) {
        StringBuilder star = new StringBuilder();
        star.append("*".repeat(Math.max(0, i * 2 - 1)));
        int empty = (n - i);
        int length = (i * 2 - 1) + empty;
        return String.format("%" + length + "s%n", star);
    }
}

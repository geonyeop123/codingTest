import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++){
            sb.setLength(0);
            for(int j = 0; j < i * 2 - 1; j++){
                sb.append("*");
            }
            int empty = (n - i);
            int length = sb.length() + empty;
            System.out.printf("%" + length + "s%n", sb);
        }
    }
}

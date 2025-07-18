import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = n; i > 1; i--){
            sb.append(makeStar(n, i));
        }
        for(int i = 1; i <= n; i++){
            sb.append(makeStar(n, i));
        }

        System.out.println(sb);
    }

    private static String makeStar(int n, int i) {
        StringBuilder star = new StringBuilder();
        for(int j = 0; j < 2; j++){
            if(j % 2 == 1){
                star.append("*".repeat(i * 2 - 1));
            }else{
                star.append(" ".repeat(n - i));
            }
        }
        star.append("\n");
        return star.toString();
    }
}

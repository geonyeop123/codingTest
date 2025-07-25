import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = n; i > 0; i--){
            sb.setLength(0);
            for(int j = 0; j < i; j++){
                sb.append("*");
            }
            System.out.printf("%"+ n +"s%n", sb);
        }
    }
}

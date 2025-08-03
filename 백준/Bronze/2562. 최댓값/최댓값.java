import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.MIN_VALUE;
        int index = 0;

        for(int i = 0; i < 9; i++){
            int number = Integer.parseInt(br.readLine());
            if(number > max){
                max = number;
                index = i+1;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}

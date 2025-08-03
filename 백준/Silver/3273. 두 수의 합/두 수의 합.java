import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[100000];
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int x = Integer.parseInt(br.readLine());
        int result = 0;
        for(String s : arr){
            int number = Integer.parseInt(s);
            int searchNumber = x - number;
            if(searchNumber < 0 || searchNumber >= 100000){
                continue;
            }else if(numbers[searchNumber] == 1){
                result++;
            }
            numbers[number]++;
        }
        System.out.println(result);
    }
}

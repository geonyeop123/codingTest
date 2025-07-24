import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 9와 6을 한 곳에 몰아넣어서 나누기 2를하면 해당 개수의 최대 값을 구할 수 있다.
        int[] arr = new int[10];
        String input = br.readLine();

        for(String s : input.split("")){
            int number = Integer.parseInt(s);
            if(number == 9 || number == 6){
                arr[6]++;
            }else{
                arr[number]++;
            }
        }

        int max = 0;
        for(int i = 0; i < arr.length; i++){
            int number = i == 6 ? (int)Math.ceil(((double)arr[i] / 2)) : arr[i];
            max = Math.max(max, number);
        }

        System.out.println(max);
    }
}

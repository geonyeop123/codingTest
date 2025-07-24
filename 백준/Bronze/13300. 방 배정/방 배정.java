import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] genderArr = new int[7];
        int[] studentArr = new int[7];

        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);

        for(int i = 0; i < n; i++){
            String[] input = br.readLine().split(" ");
            int idx = Integer.parseInt(input[1]);
            genderArr[idx] += Integer.parseInt(input[0]);
            studentArr[idx] += 1;
        }

        int roomCnt = 0;
        for(int i = 0; i < 7; i++){
            roomCnt += (int)Math.ceil((double) genderArr[i] / k);
            roomCnt += (int)Math.ceil((double)(studentArr[i] - genderArr[i]) / k);
        }

        System.out.println(roomCnt);

    }
}

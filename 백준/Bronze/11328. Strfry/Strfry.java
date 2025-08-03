import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        final String POSSIBLE = "Possible";
        final String IMPOSSIBLE = "Impossible";
        int[] arr = new int[26];

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            String[] input = br.readLine().split(" ");
            String first = input[0];
            String second = input[1];
            if(first.length() != second.length()){
                sb.append(IMPOSSIBLE).append("\n");
            }else{
                for(int j = 0; j < first.length(); j++){
                    arr[first.charAt(j) - 'a']++;
                    arr[second.charAt(j) - 'a']--;
                }
                sb.append(check(arr) ? POSSIBLE : IMPOSSIBLE).append("\n");
                Arrays.fill(arr, 0);
            }
        }
        System.out.println(sb);
    }
    public static boolean check(int[] arr){
        for(int i : arr){
            if(i != 0){
                return false;
            }
        }
        return true;
    }
}

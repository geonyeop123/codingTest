import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String first = br.readLine();
        String second = br.readLine();
        int[] arr = new int[26];
        int count = 0;
        int maxLength = Math.max(first.length(), second.length());

        for(int i = 0; i < maxLength; i++){
            if(i < first.length()){
                arr[first.charAt(i) - 'a']++;
            }
            if(i < second.length()){
                arr[second.charAt(i) - 'a']--;
            }
        }
        
        for(int i : arr){
            count += Math.abs(i);
        }

        System.out.println(count);
    }
}

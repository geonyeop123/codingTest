import java.io.*;
import java.util.Stack;

public class Main {

    static class Tower{
        int idx;
        int height;

        public Tower(int idx, int height) {
            this.idx = idx;
            this.height = height;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] answer = new int[n];
        String[] s = br.readLine().split(" ");
        Stack<Tower> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            int height = Integer.parseInt(s[i]);
            while(!stack.isEmpty() && stack.peek().height <= height){
                stack.pop();
            }
            answer[i] = stack.isEmpty() ? 0 : stack.peek().idx;
            stack.push(new Tower(i + 1, height));
        }

        for(int i : answer){
            write(i, bw);
        }

        bw.flush();
    }

    private static void write(int i, BufferedWriter bw) throws IOException {
        bw.write(i + " ");
    }
}

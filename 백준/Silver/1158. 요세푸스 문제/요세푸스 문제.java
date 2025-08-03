import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> result = new ArrayList<>();
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        LinkedList<Integer> list = new LinkedList<>();

        for(int i = 1; i <=n; i++){
            list.add(i);
        }
        ListIterator<Integer> iterator = list.listIterator();
        for(int i = 0; i < n; i++){
            for(int j = 1; j < k; j++){
                if(iterator.hasNext()){
                    iterator.next();
                }else{
                    iterator = list.listIterator();
                    iterator.next();
                }
            }
            if(!iterator.hasNext()){
                iterator = list.listIterator();
            }
            Integer next = iterator.next();
            iterator.remove();
            result.add(next);
        }
        bw.write("<");
        for(int i = 0; i < result.size() - 1; i++){
            bw.write(result.get(i) + ", ");
        }
        bw.write(result.get(result.size() - 1) + ">");
        bw.flush();
    }
}

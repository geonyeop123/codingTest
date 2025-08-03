import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        LinkedList<Character> list = new LinkedList<>();
        for(char c : input.toCharArray()) {
            list.add(c);
        }

        int n = Integer.parseInt(br.readLine());
        ListIterator<Character> listIterator = list.listIterator();
        while(listIterator.hasNext()){
            listIterator.next();
        }

        for(int i = 0; i < n; i++){
            String s = br.readLine();
            switch (s) {
                case "L":
                    if(listIterator.hasPrevious()){
                        listIterator.previous();
                    }
                    break;
                case "D":
                    if(listIterator.hasNext()) listIterator.next();
                    break;
                case "B":
                    if(listIterator.hasPrevious()){
                        listIterator.previous();
                        listIterator.remove();
                    }
                    break;
                default:
                    char c = s.toCharArray()[2];
                    listIterator.add(c);
                    break;
            }
        }
        for (Character character : list) {
            bw.write(character);
        }

        bw.flush();

    }
}

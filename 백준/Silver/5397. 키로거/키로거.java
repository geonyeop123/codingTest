import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            String input = br.readLine();
            LinkedList<Character> inputList = makeInputList(input);
            LinkedList<Character> resultList = makePassword(inputList);
            for (Character character : resultList) {
                bw.write(character);
            }
            bw.write("\n");
        }

        bw.flush();

    }

    private static LinkedList<Character> makePassword(LinkedList<Character> inputList) {
        LinkedList<Character> resultList = new LinkedList<>();

        ListIterator<Character> resultIterator = resultList.listIterator();
        for(Character c : inputList){
            switch (c) {
                case '<':
                    if(resultIterator.hasPrevious()){
                        resultIterator.previous();
                    }
                    break;
                case '>':
                    if(resultIterator.hasNext()) resultIterator.next();
                    break;
                case '-':
                    if(resultIterator.hasPrevious()){
                        resultIterator.previous();
                        resultIterator.remove();
                    }
                    break;
                default:
                    resultIterator.add(c);
                    break;
            }
        }
        return resultList;
    }

    private static LinkedList<Character> makeInputList(String input) {
        LinkedList<Character> inputList = new LinkedList<>();
        for(char c : input.toCharArray()) {
            inputList.add(c);
        }
        return inputList;
    }
}

package com.codingTest.inflearn.four.exam04;
/*
4. 후위식 연산(postfix)
설명

후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.

만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.


입력

첫 줄에 후위연산식이 주어집니다. 연산식의 길이는 50을 넘지 않습니다.

식은 1~9의 숫자와 +, -, *, / 연산자로만 이루어진다.

352+*9-

출력

연산한 결과를 출력합니다.

* */

import java.util.*;

public class Main {


    public int solution(String n) {
        Stack<Integer> numberStack = new Stack<>();
        String numberPattern = "^[0-9]*$";
        for(String s : n.split("")){
            if(s.matches(numberPattern)){
                numberStack.push(Integer.parseInt(s));
            }else{
                int number2 = numberStack.pop();
                int number1 = numberStack.pop();
                numberStack.push(calculate(number1, number2, s));
            }
        }
        return numberStack.pop();
    }

    public int calculate(int number1, int number2, String operator){
        switch(operator){
            case "+" :
                return number1 + number2;
            case "-" :
                return number1 - number2;
            case "*" :
                return number1 * number2;
            default:
                return number1 / number2;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Main main = new Main();
        String n = in.next();

        System.out.println(main.solution(n));

    }
}
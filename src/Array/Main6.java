package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main6 {
    public static List<Integer> solution(int n, int[] arr) {
        int answer = 0;
        List<Integer> answers = new ArrayList<>();

        for(Integer i : arr) {
            StringBuilder sb =  new StringBuilder(i.toString()).reverse();
            Integer temp = Integer.parseInt(sb.toString());

            List<Integer> tempss = new ArrayList<>();
            int[] temps = new int[temp+1];
            for(int j = 2 ; j <= temp ; j++) {
                if(temps[j] == 0) {
                    tempss.add(j);
                    for(int k = j ; k <=temp ; k = j+k) {
                        temps[k] = 1;
                    }
                }
            }

            if(tempss.contains(temp)) {
                answers.add(temp);
            }
        }
        return answers;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();
        int[] arr = new int[input1];
        for(int i = 0 ; i < input1 ; i++) {
            arr[i] = in.nextInt();
        }

        for(Integer i : solution(input1, arr)) {
            System.out.print(i + " ");
        }

    }
}


/*
* 설명

N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.

예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.

첫 자리부터의 연속된 0은 무시한다.


입력

첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.

각 자연수의 크기는 100,000를 넘지 않는다.


출력

첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.


예시 입력 1

9
32 55 62 20 250 370 200 30 100
예시 출력 1

23 2 73 2 3
*
*
* */
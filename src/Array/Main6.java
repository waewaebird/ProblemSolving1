package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main6 {
    public static boolean isPrime(int num) {
        if(num==1) {
            return false;
        }
        for(int i = 2 ; i < num ; i++) {
            if(num%i == 0) {
                return false;
            }
        }
        return true;
    }


    public static ArrayList<Integer> solution2(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0 ; i<n ; i++){
            int tmp=arr[i];
            int res = 0;
            while(tmp > 0) {
                int t =tmp%10;
                res = res*10+t;
                tmp = tmp / 10;
            }

            if(isPrime(res)) {
                answer.add(res);
            }
        }
        return answer;
    }
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
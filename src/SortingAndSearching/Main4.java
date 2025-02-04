package SortingAndSearching;

import java.util.Scanner;

public class Main4 {
    public static int[] solution2(int size, int n, int[] arr) {
        int[] cache = new int[size];
        for (int x : arr) {
            int pos = -1; //위치 초기화
            for(int i = 0; i < size ; i++) {
                if(x == cache[i]) {
                    pos = i;//히트된 지점
                }
            }

            if(pos == -1) {
                //미스 상황
                for(int i = size-1; i>=1 ; i--) {
                    //1까지만 돈다
                    cache[i] = cache[i-1];
                }
            } else {
                //히트 상황
                for(int i = pos; i>=1 ; i--) {
                    //1까지만 돈다
                    cache[i] = cache[i-1];
                }
            }
            cache[0] = x;
        }
        return cache;
    }


    public static int[] solution(int n, int k, int[] arr) {
        int[] answers = new int[n];

        for (int i = 0; i < k; i++) {
            boolean flag = false;
            for (int j = 0; j < answers.length; j++) {

                if(arr[i] == answers[j]) {
                    int max = j+1;

                    for (int l = max; l > 0; l--) {
                        if(l == n){
                            continue;
                        }
                        answers[l] = answers[l-1];
                    }
                    answers[0] = arr[i];
                    flag = true;
                    break;
                }
            }

            if(flag == false) {
                if(answers[0] == 0) {
                    answers[0] = arr[i];
                } else if(answers[0] > 0) {
                    int max = 0;
                    for (int j = 0; j < answers.length; j++) {
                        if(answers[j] > 0) {
                            max = j+1;
                        }
                    }

                    for (int j = max; j > 0; j--) {
                        if(j == n){
                            continue;
                        }
                        if(j == 0) {
                            continue;
                        }
                        answers[j] = answers[j-1];
                    }
                    answers[0] = arr[i];
                }
            }
        }

        return answers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int[] arr = new int[k];

        for (int i = 0; i < k; i++) {
            arr[i] = in.nextInt();
        }

        for(int x : solution(n,k,arr)) {
            System.out.print(x + " ");
        }

    }
}

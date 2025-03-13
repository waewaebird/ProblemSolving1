package GreedyAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

class Meeting implements Comparable<Meeting> {
    int start;
    int end;
    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Meeting o) {
        if(this.start == o.start){
            return this.end - o.end;
        } else {
            return this.start -o. start;
        }
    }
}

public class Main2 {
    static int n;
    static Meeting[] arr;
    static int temp = 0;
    static int answer = Integer.MIN_VALUE;

    public static void DFS(int start) {
        System.out.println(temp);
        answer = Math.max(answer, temp);

        for (int i = start; i < n; i++) {
            if(arr[start].start <= arr[i].end) {
                temp++;
                DFS(start+1);
                temp--;
            }
        }


    }

    public static void solution(Meeting[] arr) {
        for (int i = 0; i < n; i++) {
            DFS(i+1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        n = in.nextInt();
        
        arr = new Meeting[n];

        for (int i = 0; i < n; i++) {
            int s = in.nextInt();
            int e = in.nextInt();

            arr[i] = new Meeting(s,e);
        }

        Arrays.sort(arr);

        System.out.println(answer);

    }
}

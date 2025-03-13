package GreedyAlgorithm;

import java.util.*;

// 회의가 빨리 끝나는것부터 선택해나간다 !
// 먼저시작하는걸로 하는것의 반례는 회의시간이 짧은것에 대한 예외가 있을 수 있음
class Meeting implements Comparable<Meeting> {
    int start;
    int end;
    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Meeting o) {
        if(this.end == o.end) {
            return Integer.compare(this.start,o.start);
        } else {
            return Integer.compare(this.end,o.end);
        }
    }
}

public class Main2 {
    static int n;
    static Meeting[] arr;
    static int answer = Integer.MIN_VALUE;
    static int temp = 1;
    public static void DFS(int start) {
        answer = Math.max(answer, temp);

        for (int i = start+1; i < n; i++) {
            if(arr[start].end <= arr[i].start) {
                temp++;
                DFS(i);
                temp--;
            }
        }
    }

    public static int solution2(List<Meeting> arr , int n) {
        int cnt = 0;
        Collections.sort(arr);
        int et = 0;

        for(Meeting ob : arr) {
            if(ob.start >= et) {
                cnt++;
                et = ob.end;
            }
        }

        return cnt;
    }

    public static int solution(List<Meeting> list) {
        int cnt = 0;
        int endTime = 0;

        for (int i = 0; i < list.size(); i++) {
            if(i == 0) {
                endTime = list.get(i).end;
                cnt++;
            } else {
                if(list.get(i).start >= endTime) {
                    endTime = list.get(i).end;
                    cnt++;
                }
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        n = in.nextInt();
        
        arr = new Meeting[n];

        List<Meeting> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int s = in.nextInt();
            int e = in.nextInt();

            arr[i] = new Meeting(s,e);
            list.add(new Meeting(s,e));
        }

        /*Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            DFS(i);
        }
        System.out.println(answer);
        */


        Collections.sort(list);


        System.out.println(solution(list));
    }
}

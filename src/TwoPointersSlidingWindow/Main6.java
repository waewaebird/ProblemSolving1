package TwoPointersSlidingWindow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main6 {
    public static int solution2(int n, int k, int[] arr) {
        int answer = 0;
        int cnt = 0; // 0을 1로 바꾼 횟수
        int lt = 0;

        for(int rt = 0; rt<n; rt++) {
            if(arr[rt] == 0) {
                cnt++;
            }
            while(cnt>k) {
                if(arr[lt]==0) {
                    cnt--;
                }
                lt++;
            }
            answer = Math.max(answer,rt-lt+1);

        }

        return answer;
    }

    public static int solution(int n, int k, int[] arr) {
        int answer = 0;
        int cnt = 0;
        List<Integer> mins = new ArrayList<>();
        int lt = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i] == 1) {
                cnt = cnt+1;
            } else {
                mins.add(i+1);

                if(k > 0) {
                    k--;
                    cnt = cnt+1;
                } else {
                    if(lt == 0) {
                        cnt = cnt - mins.get(lt) + 1;
                    } else {
                        cnt = cnt - (mins.get(lt) - mins.get(lt-1))  + 1;
                    }
                    lt++;

                }
            }

            answer = Math.max(answer, cnt);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        int k = in.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution2(n,k,arr));

    }
}

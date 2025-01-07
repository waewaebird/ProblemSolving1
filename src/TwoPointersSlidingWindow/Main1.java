package TwoPointersSlidingWindow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static List<Integer> solution2(int n, int m, int[] a, int[] b) {
        List<Integer> answer = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;

        while(p1<n && p2<m) { //둘다 동시에 참일때만 Loop를 돈다
            if(a[p1] < b[p2]) {
                //answer.add(a[p1++]); //전위 증감연산자, *후위증감연산자
                answer.add(a[p1]);
                p1++;
            } else {
                answer.add(b[p2]);
                p2++;
            }
        }

        while(p1<n) {
            answer.add(a[p1]);
            p1++;
        }

        while(p2<m) {
            answer.add(b[p2]);
            p2++;
        }

        return answer;
    }

    public static List<Integer> solution(int n1, int[] arr1, int n2, int[] arr2) {
        List<Integer> answers = new ArrayList<>();

        for(int i : arr1){
            answers.add(i);
        }

        for(int i : arr2){
            answers.add(i);
        }

        answers.sort(null);

        return answers;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int arr1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = in.nextInt();
        }

        int n2 = in.nextInt();
        int arr2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = in.nextInt();
        }


/*        List<Integer> answers = solution(n1, arr1, n2, arr2);

        for (int i = 0; i < answers.size(); i++) {
            System.out.print(answers.get(i) + " ");
        }*/

        List<Integer> answers2 = solution2(n1, n2, arr1, arr2);

        for (int i = 0; i < answers2.size(); i++) {
            System.out.print(answers2.get(i) + " ");
        }

    }

}

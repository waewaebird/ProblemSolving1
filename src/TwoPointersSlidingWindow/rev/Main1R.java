package TwoPointersSlidingWindow.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1R {
    public static List<Integer> solution(int n, int[] arrn, int m, int[] arrm) {

        List<Integer> answers = new ArrayList<>();

        String flag ="";

        int nt = 0;
        int mt = 0;

        while(true) { //조건 자체를 둘다 동시에 참일때만 돌도록 한다
            if(arrn[nt] < arrm[mt]) {

                answers.add(arrn[nt]);

                nt++;
            } else if(arrn[nt] > arrm[mt]) {
                answers.add(arrm[mt]);
                mt++;
            } else {

                answers.add(arrn[nt]);
                answers.add(arrm[mt]);


                nt++;
                mt++;
            }
            // 여기까지는 상관없고


            if(arrn.length == nt) {
                flag = "nt";
                break;
            }

            if(arrm.length == mt) {
                flag = "mt";
                break;
            }
        }
        
        //나왔을때는 포인트와 크기를 비교해서 insert flag 없이
        if(flag.equals("nt")) {
            for (int i = mt; i < arrm.length; i++) {
                answers.add(arrm[i]);
            }
        }

        if(flag.equals("mt")) {
            for (int i = nt; i < arrn.length; i++) {
                answers.add(arrn[i]);
            }
        }

        return answers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arrn = new int[n];
        for (int i = 0; i < n; i++) {
            arrn[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] arrm = new int[m];
        for (int i = 0; i < m; i++) {
            arrm[i] = in.nextInt();
        }

        for(int answer : solution(n,arrn,m,arrm)){

            System.out.print(answer + " ");
        }
    }
}

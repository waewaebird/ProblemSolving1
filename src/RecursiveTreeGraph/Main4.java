package RecursiveTreeGraph;

public class Main4 {
    static int[] fibo; //메모이제이션 이렇게 배열에 저장해놓는걸, 메모이제이션
    public static int DFS(int n) {
        if(fibo[n] > 0) {
            return fibo[n];
        }

        if(n == 1) {
            return fibo[n] = 1;
        } else if(n == 2){
            return fibo[n] = 1;
        } else {
            return fibo[n] = DFS(n-2) + DFS(n-1);
        }
    }

    public static void main(String[] args) {
        int n = 45;
        fibo= new int[n+1];
        DFS(n);

        for (int i = 1; i <= n ; i++) {
            System.out.print(fibo[i] + " ");
        }

    }
}


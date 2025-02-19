package RecursiveTreeGraph.rev;

public class Main4R {
    static int[] fibo;

    public static int DFS(int n) {
        if(fibo[n] > 0) {
            //값이 있을때
            return fibo[n];
        }


        if(n == 1) {
            fibo[n] = 1;
            return 1;
        } else if(n == 2){
            fibo[n] = 1;
            return 1;
        } else {
            int val = DFS(n-2) + DFS(n-1);
            fibo[n] = val;
            return val;
        }
    }

    public static int fibonacci(int n) {
        if(n == 1) {
            return 1;
        } else if(n == 2){
            return 1;
        } else {
            int ret = fibonacci(n-2) + fibonacci(n-1);
            return ret;
        }
    }


    public static void main(String[] args) {

        int n = 10;

        fibo = new int[n+1]; //메모라이제이션

        DFS(n);

        for (int i = 1; i <= 5; i++) {
            //System.out.print(fibo[i] + " ");
            System.out.print(fibonacci(i) + " ");
        }
    }
}

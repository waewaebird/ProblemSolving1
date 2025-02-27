package RecursiveTreeGraph.rev;

public class Main1RR {
    public static void DFS(int n) {
        if(n==0) {
            return;
        } else {
            DFS(n-1);
            System.out.print(n + " ");
        }
    }


    public static void main(String[] args) {
        int n = 3;
        DFS(n);
    }
}

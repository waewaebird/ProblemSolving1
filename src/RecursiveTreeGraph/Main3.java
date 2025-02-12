package RecursiveTreeGraph;

public class Main3 {
    public static int DFS1(int n) {
        if(n == 1) {
            return 1;
        } else {
            return n*DFS(n-1);
        }
    }
    public static int DFS(int n) {
        int answer = 0;

        if(n == 1) {
            return 1;
        } else {
            answer = n * DFS(n-1);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(DFS(5));
    }

}

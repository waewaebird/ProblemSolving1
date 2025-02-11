package RecursiveTreeGraph;

public class Main2 {
    private void DFS(int n) {
        if(n == 0) {
            return;
        } else {
            DFS(n/2);
            System.out.print(n % 2 + " ");
        }
    }

    public static void main(String[] args) {
        Main2 T = new Main2();
        T.DFS(11);

    }
}

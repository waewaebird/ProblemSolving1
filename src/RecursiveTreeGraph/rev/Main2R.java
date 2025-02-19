package RecursiveTreeGraph.rev;

public class Main2R {
    public static void DFS(int v) {
        if(v == 0){
            return;
        } else {
            DFS(v/2);
            System.out.print(v%2);
        }
    }

    public static void main(String[] args) {
        DFS(11);
    }
}

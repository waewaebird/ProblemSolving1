package RecursiveTreeGraph;

public class Main1 {
    public void DFS(int n) {
        // 1. 재귀함수는 Stack Frame을 사용한다.
        // 2. 매개변수 지역변수 복귀주소를 갖고 있는다. (stack Frame)
        // 3. 백트랙킹? 재귀함수는 복귀 백.
        if(n == 0) {
            return;
        } else {
            DFS(n-1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Main1 T = new Main1();
        T.DFS(3);

    }
}

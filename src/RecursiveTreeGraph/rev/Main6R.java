package RecursiveTreeGraph.rev;

public class Main6R {
    static int n; //집합 원소의 갯수
    static int[] ch; //체크배열(집합으로 사용한다? 안한다?)
    public static void DFS(int L) { 
        if(L == n+1) { //종착점 추가 ex 4
            String temp = "";
            for (int i = 0; i < ch.length; i++) {
                if(ch[i] > 0) {
                    temp += i + " ";
                }
            }
            if(temp.length() > 0) {
                //공집합 제거
                System.out.println(temp);
            }

        } else { //뻗어 나가는 곳
            ch[L] = 1;
            DFS(L+1); // 사용한다로 생각

            ch[L] = 0;
            DFS(L+1); // 사용하지 않는다 라고 생각
        }
    }


    public static void main(String[] args) {
        // D(1) 원소로 사용한다 안한다( O X 2가지)
        // n개의 집합갯수는 그래서 2 N승 (공집합 포함)
        
        Main6R T = new Main6R();

        n = 3;
        ch = new int[n+1]; //인덱스번호를 그냥 원소로 사용
        DFS(1); //레벨
    }
}

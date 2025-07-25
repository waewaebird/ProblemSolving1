package RecursiveTreeGraph.rev;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main7RRRRR {
    // 이진트리 순회(넓이우선탑색 : 레벨탐색)
    static class Node {
        int data;
        Node lt;
        Node rt;

        public Node(int data) {
            this.data = data;
            this.lt = null;
            this.rt = null;
        }
    }

    Node root;

    public static void DFS(Node N) {
        Deque<Node> queue = new ArrayDeque<>();
        queue.offer(N);

        while(!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");

            if(current.lt != null) {
                queue.offer(current.lt);
            }

            if(current.rt != null) {
                queue.offer(current.rt);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Main7RRRRR C = new Main7RRRRR();

        C.root = new Node(1);
        C.root.lt = new Node(2);
        C.root.rt = new Node(3);
        C.root.lt.lt = new Node(4);
        C.root.lt.rt = new Node(5);
        C.root.rt.lt = new Node(6);
        C.root.rt.rt = new Node(7);

        System.out.print("레벨 탐색 순회 출력 : ");
        DFS(C.root);
    }
}

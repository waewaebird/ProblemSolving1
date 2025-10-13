package RecursiveTreeGraph.rev;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main7RRRRRRRR {
    // 이진트리 순회(넓이우선탑색 : 레벨탐색)
    static class Node {
        int data;
        Node lt;
        Node rt;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void BFS(Node root) {
        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(root);

        System.out.print("레벨 탐색 순회 출력 : ");

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

    Node root;
    public static void main(String[] args) {
        Main7RRRRRRRR T = new Main7RRRRRRRR();

        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);
        T.root.rt.lt = new Node(6);
        T.root.rt.rt = new Node(7);

        BFS(T.root);
    }
}

package RecursiveTreeGraph.rev;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main10RRRRRRRRR {
    // Tree 말단 노드까지의 가장 짧은 경로
    static class Node {
        int data;
        Node lt;
        Node rt;

        public Node(int data) {
            this.data = data;
        }
    }

    Node root;

    public int BFS(Node root) {
        Deque<Node> queue = new ArrayDeque<>();
        queue.offer(root);

        boolean flag = false;
        int level = 0;
        if(!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node current = queue.poll();

                if(current.lt == null && current.rt == null) {
                    flag = true;
                    break;
                }

                if(current.lt != null) {
                    queue.offer(current.lt);
                }

                if(current.rt != null) {
                    queue.offer(current.rt);
                }
            }

            if(!flag) {
                level++;
            }
        }
        return level;
    }

    public static void main(String[] args) {
        Main10RRRRRRRRR T = new Main10RRRRRRRRR();

        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);

        System.out.println(T.BFS(T.root));
    }
}

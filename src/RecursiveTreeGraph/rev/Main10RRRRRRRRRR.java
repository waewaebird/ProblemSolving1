package RecursiveTreeGraph.rev;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main10RRRRRRRRRR {
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

    public static int BFS(Node root) {
        int answers = 0;
        int answer = 0;
        Queue<Node> queue = new ArrayDeque<>();

        queue.offer(root);

        int size = 0;
        while(!queue.isEmpty()) {
            if(answer > 0) {
                break;
            }

            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node current = queue.poll();

                if(current.lt == null && current.rt == null) {
                    answers = current.data;
                    answer = size;
                    break;
                }

                if(current.lt != null) {
                    queue.offer(current.lt);
                }
                if(current.rt != null) {
                    queue.offer(current.rt);
                }
            }
            size++;
        }

        System.out.println(answers);
        return answer;
    }

    public static void main(String[] args) {
        Main10RRRRRRRRRR T = new Main10RRRRRRRRRR();
        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);

        System.out.println(BFS(T.root));
    }
}

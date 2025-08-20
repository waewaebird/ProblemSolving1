package RecursiveTreeGraph.rev;

import java.util.LinkedList;
import java.util.Queue;

public class Main9RRR {
    // Tree 말단 노드까지의 가장 짧은 경로
    Node root;

    public static int BFS(Node root) {
        int answer = 0;
        boolean flag = false;
        Queue<Node> queue = new LinkedList<>();

        queue.offer(root);

        int level = 0;
        while(!queue.isEmpty()) {
            int len = queue.size();

            for (int i = 0; i < len; i++) {
                Node temp = queue.poll();

                if(temp.lt == null || temp.rt == null) {
                    answer = level;
                    flag = true;
                    break;
                }

                if(temp.lt != null) {
                    queue.offer(temp.lt);
                }

                if(temp.rt != null) {
                    queue.offer(temp.rt);
                }
            }

            if(flag) {
                break;
            }
            level++;
        }

        return answer;

    }

    public static void main(String[] args) {
        Main9RRR T = new Main9RRR();

        T.root = new Node(1);
        T.root.lt = new Node(2);
        T.root.rt = new Node(3);
        T.root.lt.lt = new Node(4);
        T.root.lt.rt = new Node(5);

        System.out.println(BFS(T.root));

    }
}


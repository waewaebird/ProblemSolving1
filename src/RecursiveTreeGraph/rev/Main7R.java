package RecursiveTreeGraph.rev;

import java.util.LinkedList;
import java.util.Queue;

public class Main7R {
    Node root;

    public void BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        System.out.print("레벨 탐색 순회 출력 : ");
        int level = 1;
        while (!queue.isEmpty()) {
            int len = queue.size();

            for (int i = 0; i < len; i++) {
                Node cur = queue.poll();

                System.out.print(cur.data + " ");

                if(cur.lt != null) {
                    queue.offer(cur.lt);
                }
                if(cur.rt != null) {
                    queue.offer(cur.rt);
                }
            }

            level++;
        }
    }


    public static void main(String[] args) {
        Main7R tree = new Main7R();

        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        tree.BFS(tree.root);
    }























}


/*
public class Main7R {
    Node root;

    public static void BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int L = 0; //레벨?

        while(!queue.isEmpty()) {
            int len = queue.size();
            System.out.print(" Level - " + L + " : ");
            for (int i = 0; i < len; i++) { //현재 원소의 갯수 처음엔 1개
                Node cur = queue.poll(); //현재 노드 하나를 꺼낸다
                System.out.print(cur.data + " ");
                if(cur.lt != null) {
                    queue.offer(cur.lt);
                }
                if(cur.rt != null) {
                    queue.offer(cur.rt);
                }
            }
            //현재 레벨이 끝난것
            L++;
            System.out.println();

        }
    }


    public static void main(String[] args) {
        Main7R tree = new Main7R();

        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        BFS(tree.root);
    }
}*/

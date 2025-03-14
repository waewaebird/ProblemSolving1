package RecursiveTreeGraph.rev;

import com.sun.tools.javac.Main;

import java.util.LinkedList;
import java.util.Queue;

class MNode {
    int data;
    MNode lt;
    MNode rt;

    public MNode(int data) {
        this.data = data;
        this.lt = null;
        this.rt = null;
    }
}

public class Main7RRR {
    MNode root;

    public void BFS(MNode root) {
        Queue<MNode> queue = new LinkedList<>();
        queue.offer(root);

        System.out.print("레벨 탐색 순회 출력 : ");
        while (!queue.isEmpty()) {
            MNode cn = queue.poll();

            System.out.print(cn.data+ " ");

            if(cn.lt != null) {
                queue.offer(cn.lt);
            }

            if(cn.rt != null) {
                queue.offer(cn.rt);
            }
        }

    }

    public static void main(String[] args) {
        Main7RRR tree = new Main7RRR();

        tree.root = new MNode(1);
        tree.root.lt = new MNode(2);
        tree.root.rt = new MNode(3);
        tree.root.lt.lt = new MNode(4);
        tree.root.lt.rt = new MNode(5);
        tree.root.rt.lt = new MNode(6);
        tree.root.rt.rt = new MNode(7);

        tree.BFS(tree.root);
    }
}

package RecursiveTreeGraph.rev;

import java.util.LinkedList;
import java.util.Queue;

public class Main10RRRRR {

    Nnode root;
    public static class Nnode {
        int data;
        Nnode lt;
        Nnode rt;

        public Nnode(int val) {
            this.data = val;
            lt = null;
            rt = null;
        }
    }

    public int BFS(Nnode root) {
        Queue<Nnode> queue = new LinkedList<>();

        queue.offer(root);

        int level = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Nnode current = queue.poll();

                if(current.lt == null && current.rt == null) {
                    return level;
                }

                if(current.lt != null) {
                    queue.offer(current.lt);
                }

                if(current.rt != null) {
                    queue.offer(current.rt);
                }
            }
            level++;
        }
        return 0;

    }


    public static void main(String[] args) {
        Main10RRRRR tree = new Main10RRRRR();

        tree.root = new Nnode(1);
        tree.root.lt = new Nnode(2);
        tree.root.rt = new Nnode(3);
        tree.root.lt.lt = new Nnode(4);
        tree.root.lt.rt = new Nnode(5);

        System.out.println(tree.BFS(tree.root));

    }



}

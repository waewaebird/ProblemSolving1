package RecursiveTreeGraph.rev;

public class Main5RRR {
    Node root;

    public void DFS(Node root) {
        if(root == null){
            return;
        } else {
            //System.out.print(root.data + " ");
            DFS(root.lt);
            //System.out.print(root.data + " ");
            DFS(root.rt);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        Main5RRR tree = new Main5RRR();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        tree.DFS(tree.root);
    }
}

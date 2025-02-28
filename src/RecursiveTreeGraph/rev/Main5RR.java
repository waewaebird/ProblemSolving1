package RecursiveTreeGraph.rev;

public class Main5RR {
    Node root;

    public void DFS(Node tree) {
        if(tree == null) {
            return;
        } else {
            //System.out.print(tree.data + " ");
            DFS(tree.lt);
            //System.out.print(tree.data + " ");
            DFS(tree.rt);
            System.out.print(tree.data + " ");
        }

    }


    public static void main(String[] args) {
        Main5RR tree = new Main5RR();
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

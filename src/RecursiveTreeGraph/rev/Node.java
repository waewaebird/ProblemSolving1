package RecursiveTreeGraph.rev;

public class Node {
    public int data;
    public Node lt;
    public Node rt;

    public Node(int val) {
        data = val;
        this.lt = null;
        this.rt = null;
    }
}

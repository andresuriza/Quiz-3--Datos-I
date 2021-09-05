public class Node {
    public Object data;
    public Node next;
    public Node previous;

    public Node(Object data) {  // init?
        this.next = null;
        this.previous = null;
        this.data = data;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getNext() {
        return this.next.data;
    }

    public Object getPrevious() {
        return this.previous.data;
    }

    public void setNext(Node node) {
        this.next = node;
    }
}
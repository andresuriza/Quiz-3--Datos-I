public class DoublyLinkedList {
    public Node head;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int size() {
        return this.size;
    }

    public void insertFirst(Object data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            newNode.next = this.head;
        } else {
            newNode.next = this.head;
            this.head.previous = newNode;
        }
        this.head = newNode;
        this.size++;
    }

    public Node deleteFirst() {
        if (this.head != null) {
            Node temp = this.head;
            this.head = this.head.next;
            this.size--;
            return temp;
        } else {
            return null;
        }
    }

    public void printList() {
        Node temp = this.head;

        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.next;
        }
    }
}
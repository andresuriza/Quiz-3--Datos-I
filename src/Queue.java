public class Queue {
    DoublyLinkedList queue = new DoublyLinkedList();

    public void enqueue(Object data) {
        queue.insertFirst(data);
    }

    public void dequeue(int amount) {
        while (amount != 0) {
            Node temp = queue.head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.previous.next = null;
            amount--;
        }
    }

    public Node peak() {
        Node temp = queue.head;

        while (temp.next != null) {
            temp = temp.next;
        }
        return temp;
    }

    public void printQueue() {
        queue.printList();
    }

    /*
    La funcion main encola correctamente a los datos utilizando una lista doblemente enlazada y agregando valores al
    inicio de la lista, al igual que los desencola correctamente. como el metodo printList imprime del head hasta el
    ultimo nodo, es por esto que cuando se usa el printQueue que imprime los datos del Queue, se imprime en orden
    inverso al agregado, el ultimo nodo en imprimirse siendo el de mayor prioridad, siguiendo el orden FIFO.
     */
    public static void main(String[] args) {
        Queue q1 = new Queue();
        q1.enqueue(5);
        q1.enqueue(8);
        q1.enqueue(3);
        q1.enqueue(12);
        q1.enqueue(0);
        q1.enqueue(89);
        q1.enqueue(77);
        q1.dequeue(3);
        q1.printQueue();
    }
}

public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    // Los metodos de la SLL van aqui. Al principio, les mostraremos cómo agregar
    // nodos a la lista.
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while (runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public void remove() {
        Node actual = head;
        Node anterior = null;
        while (actual.next != null) {
            anterior = actual;
            actual = actual.next;
        }
        anterior.next = null;
    }

    public void printValues() {
        Node actual = head;
        while (actual != null) {
            System.out.println(actual.value);
            actual = actual.next;
        }
    }
}

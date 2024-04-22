package az.edu.turing.module1.lesson20;

public class LinkedListApp<E> {
    private Node<E> head;
    private int size;

    private static class Node<E> {
        public static void main(String[] args) {
            LinkedListApp<Integer> list = new LinkedListApp<>();
            list.addHead(3);
            list.addHead(5);
            list.addHead(7);
            list.addHead(9);

            System.out.println("Size of LinkedList is " + list.getSize());

            System.out.println("1st element of LinkedList is " + list.get(1));

            list.update(1, 6);
            System.out.println("Updated element at index 1 is " + list.get(2));

            list.delete(2);
            System.out.println("Updated size is " + list.getSize());

            list.delete(Integer.valueOf(6));
            System.out.println("Updated size after deletion using object is " + list.getSize());
        }

        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addHead(E data) {
        Node<E> temp = new Node<>(data);
        temp.next = head;
        head = temp;
        size++;
    }

    public int getSize(){
        return size;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node<E> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    public void delete(E data) {
        Node<E> current = head;
        Node<E> prev = null;
        while (current != null) {
            if (current.data.equals(data)) {
                if (prev == null) {
                    head = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public void update(int index, E newData) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.data = newData;
    }
}

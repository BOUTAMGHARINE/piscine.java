

public class SingleLinkedList implements LinkedList {
   

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    private Node head;
    private int size;

    @Override
    public int at(int index) {
        if (index <= size  && index >= 0){
            int v = 0;
            Node curent = head;
            while( v != index) {
                curent =next(curent);
                v++;

            }
            return curent.value;
            
        }else {
            return -1;
        }
    }

    @Override
    public void add(int value) {
        // Implementation for adding an element at the end of the list
        Node node = new Node(value);

        if (head == null) {
            head = node;
            head.next =null;
            size++;
            
        }else {
            Node curent = head;
            while ( curent.next != null) {
                curent = next(curent);

            }
            curent.next = node;
            size++;
        }


    }
    

    @Override
    public void remove(int index) {
        // Implementation for removing an element by its index
        if (index > size || index < 0 || size == 0  ) return;

        if (index == 0 ) {
            if (head.next == null) {
                head = null;
                size--;
            }else {
                head =head.next;
                size--;
            }
        } else {

            int pos = 0;
            Node cur = head;
            while ( pos < index-1 && cur != null) {

                cur = next(cur);
                pos++;
                
            }
            //cur = cur.next.next;
            cur.next = next(cur.next);
            size--;
        }


    }
   
  

    @Override
    public int size() {
        return this.size;
    }

    private Node next(Node node) {
        // Print the message "Go to next node"
        System.out.println("Go to next node");
        return node.next;
    }
}


/*```java
public interface LinkedList {
    int at(int index);
    void add(int value);
    void remove(int index);
    int size();
}
public class SingleLinkedList implements LinkedList {
    private Node head;
    private int size;

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    @Override
    public int at(int index) {
        if (index < 0 || index >= size) return -1;
        Node current = head;
        int pos = 0;
        while (current != null && pos < index) {
            current = next(current);
            pos++;
        }
        return current != null ? current.value : -1;
    }

    @Override
    public void add(int value) {
        // Implementation for adding an element at the end of the list
        Node newnode = new Node(value);
        if (head == null){
            head = newnode;
            head.next = null;
            size++;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = next(current);
        }
        current.next = newnode;
        newnode.next = null;
        size++;
    }

    @Override
    public void remove(int index) {
        // Implementation for removing an element by its index
        if (index < 0 || index >= size) return;
        if (index == 0){
            if (head.next == null){
                head = null;
            }else{
                head = head.next;
            }
            size--;
            return;
        }

        Node current = head;
        int pos = 0;
        while (current != null && pos < index -1) {
            current = next(current);
            pos++;
        }
        // current.next = current.next.next;
        current.next = next(current.next);
        size--;
    }

    @Override
    public int size() {
        // Implementation for accessing an element by its index
        return this.size;
    }

    private Node next(Node node) {
        // Print the message "Go to next node"
        System.out.println("Go to next node");
        return node.next;
    }
}``` */
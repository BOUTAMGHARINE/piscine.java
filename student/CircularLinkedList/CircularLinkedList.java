
public class CircularLinkedList implements LinkedList {
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
        if(index<0  || size == 0 ) return -1;
     
        int pos = 0;
        Node cur =head;
        while(index > pos){
            cur =next(cur);
            pos++;
        }
        return cur.value;
    }

    @Override
    public void add(int value) {
        // Implementation for adding an element at the end of the list
        Node node = new Node(value);

        if (head == null) {
            head = node;
            node.next =node;
            size++;
            return;
        }

        Node cur = head;
        while (cur.next != head) {
            cur =next(cur);

            
        }
        cur.next =node;
        node.next=head;
        size++;
    }


    @Override
    public void remove(int index) {
        // Implementation for removing an element by its index

        if (index >size || size == 0|| index < 0) return;

        if (index == 0) {
            if (size == 1) {
                head =null;
                size--;

            }else {
                //head= next(head);
                Node cur = head;
                while(cur.next!=head) {
                    cur=next(cur);

                    
                }
                head =head.next;
                cur.next=head;
                size--;
            }
        }else {
            int pos = 0;
            Node cur = head;
            while ( pos < index-1) {
                cur = next(cur);
                pos++;
                
            }
            cur.next =next(cur.next);
            size--;
           
              
        }
    }


    @Override
    public int size() {
        // Implementation getting the size of the list
        return this.size;
    }

    private Node next(Node node) {
        System.out.println("Go to next node");
        return node.next;
    }
}

 //class CircularLinkedList implements LinkedList {
//     private Node head;
//     private int size;

//     private class Node {
//         int value;
//         Node next;

//         Node(int value) {
//             this.value = value;
//             this.next = null;
//         }
//     }

//     @Override
//     public int at(int index) {
//         // Implementation for accessing an element by its index
//         if (index < 0 ||  size ==0){
//             return -1;
//         }
//         Node current = head;
//         int pos = 0;
//         while (current.next != null && pos < index) {
//             current = next(current);
//             pos++;
//         }
//         return current != null ? current.value : -1;
//     }

//     @Override
//     public void add(int value) {
//         Node newNode = new Node(value);
//         if (head == null){
//             head = newNode;
//             head.next = newNode;
//             size++;
//             return;
//         }
//         Node current = head;
//         while (current.next != head){
//             current = next(current);
//         }
//         current.next = newNode;
//         newNode.next = head;
//         current = newNode;

//         size++;
//     }

//     @Override
//     public void remove(int index) {
//         if (index < 0 || index >= size){
//             return;
//         }

//         if (index == 0){
//             if (head.next == head){
//                 head = null;
//             }else{
//                 // head = next(head);
//                 Node current = head;
//                 // int pos = 0;
//                 while (current.next != head) {
//                     current = next(current);
//                 }
//                 head = head.next;
//                 // head = next(head);
//                 current.next = head;
//             }

//             // head = next(head);
//             size--;
//             return;
//         }

//         Node current = head;
//         int pos = 0;
//         while (current.next != head && pos < index-1) {
//             current = next(current);
//             pos++;
//         }
//         Node rmNode = current.next;
//         // current.next = rmNode.next;
//         current.next = next(rmNode);

//         size--;
//     }

//     @Override
//     public int size() {
//         // Implementation getting the size of the list
//         return this.size;
//     }

//     private Node next(Node node) {
//         // Print the message "Go to next node"
//         System.out.println("Go to next node");
//         return node.next;
//     }
// }

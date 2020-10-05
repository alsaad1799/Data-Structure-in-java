
class Node{
    int data;
    Node next;
}

class LinkedList{
    Node head;
    Node tail;
    int size;

    void addFirst(int val){
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = null;

        if(size == 0)
            head = tail = newNode;

        else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    private Node getNodeAt(int index){
        Node temp = head;
        for(int i=0; i<index; i++)
            temp = temp.next;

        return temp;
    }

    void reverse(){
        int lt = 0;
        int rt = size - 1;
        while (lt < rt){
            Node left = getNodeAt(lt);
            Node right = getNodeAt(rt);

            int temp = left.data;
            left.data = right.data;
            right.data = temp;

            lt++;
            rt--;
        }
    }

    void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }
}

public class reverseLinkedList{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);
        list.addFirst(50);

        list.display();

        list.reverse();
        System.out.println();
        System.out.println("Reverse Using Data Iterative Function : ");
        list.display();


    }
}

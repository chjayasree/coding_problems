

public class ReverseSingleList {
    static class Node{
        int data;
        Node next;
        public Node(int data){
           this.data=data;
           this.next=null;
        }
    }
    public Node head=null;
    public Node tail=null;
    public void addNode(int data) {
        Node newNode = new Node(data);
            if(head==null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode;
            }
        }
        public void reverse (Node current){
            if (head == null) {
                System.out.println("the list is empty");

            }
            else {
                if (current.next == null) {
                    System.out.println(current.data + " ");
                    return;
                }
                reverse(current.next);
                System.out.println(current.data + "");
            }
        }
        public void display () {
            Node current = head;
            if (head == null) {
                System.out.println("the list is empty");
                return;
            }
            System.out.println("the nodes of list are ");
            while (current != null) {
                System.out.println(current.data + " ");
                current = current.next;
            }
            System.out.println();

        }
        public static void main(String[] args){
            ReverseSingleList list=new ReverseSingleList();
            list.addNode(1);
            list.addNode(2);
            list.addNode(3);
            list.addNode(5);
            list.display();
            list.reverse(list.head);
        }


    }


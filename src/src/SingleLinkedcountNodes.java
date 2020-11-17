public class SingleLinkedcountNodes {
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
    public void addNode(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    public int countNodes(){
        int count=0;
        Node current=head;
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }
    public void display(){
       Node current=head;
       if(head==null){
           System.out.println("list is empty");
       }
       System.out.println("the nodes of single linked list are");
        while(current!=null){
            System.out.println(current.data+" ");
            current=current.next;
        }
    }

    public static void main(String[] args) {
        SingleLinkedcountNodes list=new SingleLinkedcountNodes();
        list.addNode(1);
        list.addNode(3);
        list.addNode(5);
        list.addNode(6);
        list.addNode(8);
        list.display();
        System.out.println("count of nodes in single linked list are  "+list.countNodes());
    }
}

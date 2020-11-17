public class SingleLinked {
    static class Node {
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
    public void display(){
        Node current=head;
        if(head==null){
            System.out.println("list is empty");
        }
        System.out.println("nodes of single linked list");
        while(current!=null){
           System.out.println(current.data+" ");
            current=current.next;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        SingleLinked list = new SingleLinked();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.display();
    }
}

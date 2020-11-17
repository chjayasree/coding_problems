public class InsertBeginSingleList {
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
    public  void addNode(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            Node temp=head;
            head=newNode;
            head.next=temp;
        }
    }
    public void display(){
        Node current=head;
        if(head==null){
            System.out.println("the list is empty");
        }
        System.out.println("the nodes of the list are");
        while(current!=null){
            System.out.println(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InsertBeginSingleList list=new InsertBeginSingleList();
        list.addNode(1);
        list.display();
        list.addNode(4);
        list.display();
        list.addNode(8);
        list.display();
    }
}

public class DeleteEndSingleList {
    static class Node{
        int data;
        Node next;
        public  Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node head=null;
    public  Node tail=null;
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
    public void delete(){
        if(head==null){
            System.out.println("the list is empty");
        }
        else{
            if(head!=tail){
                Node current=head;
                while(current.next!=tail){
                    current=current.next;
                }
                tail=current;
                tail.next=null;
            }
            else{
                head=tail=null;
            }
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
        DeleteEndSingleList list =new DeleteEndSingleList();
        list.addNode(1);
        list.addNode(3);
        list.addNode(5);
        list.addNode(7);
        list.addNode(8);
        list.display();
        while(list.head!=null){
            list.delete();
            list.display();
        }
    }
}

public class DeleteStartSingleList {
    class Node {
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
        Node newNode = new Node( data);
        if(head==null){
            head = newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    public void deleteStart(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        else{
            if(head!=tail){
                head=head.next;
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
        while(current!=null){
            System.out.println(current.data+"");
            current=current.next;
        }
        System.out.println();
    }
    public static void main (String[] args) {
        DeleteStartSingleList sList =new DeleteStartSingleList();
        sList.addNode(10);
        sList.addNode(20);
        sList.addNode(30);
        sList.addNode(40);
        sList.addNode(50);
        sList.addNode(60);
        System.out.println("original list");
        sList.display();
        while(sList.head!=null){
            sList.deleteStart();
            System.out.println("updated list");
            sList.display();
        }
    }

}

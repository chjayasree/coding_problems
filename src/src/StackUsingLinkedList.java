public class StackUsingLinkedList {
    class Node{
        int data;
        Node next;
    }
    Node top;
    StackUsingLinkedList(){
        this.top=null;
    }
     public void push(int data){
        Node temp=new Node();
        if(temp==null){
            System.out.println("overflow");
            return;
        }
        temp.data=data;
        temp.next=top;
        top=temp;
     }
     public boolean isEmpty(){
        return top==null;
     }
     public int peek(){
        if(!isEmpty()){
            return top.data;
        }
        else{
            System.out.println("Stack is empty");
            return -1;
        }
     }
     public void pop(){
        if(top==null){
            System.out.println("underflow");
            return;
        }
        top=(top).next;
     }
     public void display(){
        if(top==null){
            System.out.println("underflow");

        }
        else{
            Node temp=top;
            while(temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
        }
     }

    public static void main(String[] args) {
        StackUsingLinkedList obj=new StackUsingLinkedList();
        obj.push(2);
        obj.push(22);
        obj.push(33);
        obj.push(44);
        obj.push(55);
        obj.display();
        System.out.printf("\nTop element is %d\n", obj.peek());
        obj.pop();
        obj.pop();
        obj.display();
        System.out.printf("\nTop element is %d\n", obj.peek());
    }

}

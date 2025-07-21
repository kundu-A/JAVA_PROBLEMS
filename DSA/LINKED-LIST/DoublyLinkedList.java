//Implement Doubly Linked List.
import java.util.Scanner;

class Node{

    int data;
    Node prev;
    Node next;
    public Node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}
class ImplementDoublyLinkedList{

    private Node head;
    private Node tail;
    public void addFirst(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        node.next=head;
        head.prev=node;
        head=node;
    }

    public void addLast(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.prev=tail;
        tail=node;
    }

    public void delete(int value){
        if(head==null){
            System.out.println("Your list is empty...");
            return;
        }
        Node currentNode=head;
        while (currentNode!=null && currentNode.data!=value) {
            currentNode=currentNode.next;
        }
        if(currentNode==null){
            System.out.println("Value is not present");
            return;
        }
        if(currentNode==head){
            head=head.next;
            if(head!=null)
                head.prev=null;
            else
                tail=null;
        }else if(currentNode==tail){
            tail=tail.prev;
            tail.next=null;
        }else{
            value=currentNode.next.data;
            currentNode.next.prev=currentNode.prev;
            currentNode.next.next=currentNode.next;
        }
        System.out.println("Your deteled element is = "+value);
    }
    
    public void forwardDisplay(){
        if(head==null){
            System.out.println("Your list is empty....");
            return;
        }
        Node currentNode=head;
        while(currentNode!=null){
            System.out.print(currentNode.data+" ");
            currentNode=currentNode.next;
        }
        System.out.println();
    }

    public void backwardDisplay(){
        if(head==null){
            System.out.println("Your list is empty....");
            return;
        }
        Node currentNode=tail;
        while(currentNode!=null){
            System.out.print(currentNode.data+" ");
            currentNode=currentNode.prev;
        }
        System.out.println();
    }
}
public class DoublyLinkedList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ImplementDoublyLinkedList linkedList=new ImplementDoublyLinkedList();
        int cont=0;
        do {
            System.out.println("Please enter your choice....\nPress 1 to add element in first position\nPress 2 to add element in last position\nPress 3 to delete and element\nPress 4 to forward display\nPress 5 to backward display: ");
            int ch=sc.nextInt();
            switch (ch) {
                case 1:
                        System.out.println("Please enter a value to insert: ");
                        linkedList.addFirst(sc.nextInt());
                    break;
                case 2:
                        System.out.println("Please enter a value to insert: ");
                        linkedList.addLast(sc.nextInt());
                    break;
                case 3:
                        System.out.println("Please enter a value to delete: ");
                        linkedList.delete(sc.nextInt());
                    break;
                case 4:
                        System.out.println("Your current forward list is: ");
                        linkedList.forwardDisplay();
                    break;
                case 5:
                        System.out.println("Your current backward list is: ");
                        linkedList.backwardDisplay();
                        break;
                default:
                        System.out.println("Please enter the valid choice....");
                    break;
            }
            System.out.println("Press 1 to continue or 0 to exit: ");
            cont=sc.nextInt();
        } while (cont==1);
        sc.close();
    }
}

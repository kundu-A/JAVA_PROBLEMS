//Implement Circular Doubly Linked List
import java.util.Scanner;

class CircularDoublyListImplement{
    class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    private Node head=null;
    private Node tail=null;
    public void addFirst(int value){
        Node newNode=new Node(value);
        if(head==null){
            head=tail=newNode;
            head.prev=head.next=head;
            return;
        }
        newNode.next=head;
        newNode.prev=tail;
        head.prev=newNode;
        tail.next=newNode;
        head=newNode;

    }
    public void addLast(int value){
        Node newNode=new Node(value);
        if(head==null){
            head=tail=newNode;
            head.prev=head.next=head;
            return;
        }
        newNode.prev=tail;
        newNode.next=head;
        tail.next=newNode;
        head.prev=newNode;
        tail=newNode;
    }
    public void delete(int value){
        if(head==null){
            System.out.println("List is empty....");
            return;
        }
        Node currentNode=head;
        do{
            if(currentNode.data==value){
                if(currentNode==head && currentNode==tail){
                    head=tail=null;
                }
                else if(currentNode==head){
                    head=head.next;
                    tail.next=head;
                    head.prev=tail;
                }
                else if(currentNode==tail){
                    tail=tail.prev;
                    tail.next=head;
                    head.prev=tail;
                }
                else{
                    currentNode.next.prev=currentNode.prev;
                    currentNode.next.next=currentNode.next;
                }
                System.out.println("Your deleted value is = "+value);
                return;
            }
            currentNode=currentNode.next;
        }while(currentNode!=head);  
        System.out.println("Value is not present"); 
    }
    public void forwardDisplay(){
        if(head==null){
            System.out.println("List is empty....");
            return;
        }
        Node currentNode=head;
        do{
            System.out.print(currentNode.data+" ");
            currentNode=currentNode.next;
        }while(currentNode!=head);
        System.out.println();
    }
    public void backwardDisplay(){
        if(head==null){
            System.out.println("List is empty....");
            return;
        }
        Node currentNode=tail;
        do{
            System.out.print(currentNode.data+" ");
            currentNode=currentNode.prev;
        }while(currentNode!=tail);
        System.out.println();
    }
}
public class CircularDoublyList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CircularDoublyListImplement circularLinkedList=new CircularDoublyListImplement();
        int cont=0;
        do {
            System.out.println("Please enter your choice....\nPress 1 to add element in first position\nPress 2 to add element in last position\nPress 3 to delete and element\nPress 4 to forward display\nPress 5 to backward display: ");
            int ch=sc.nextInt();
            switch (ch) {
                case 1:
                        System.out.println("Please enter a value to insert: ");
                        circularLinkedList.addFirst(sc.nextInt());
                    break;
                case 2:
                        System.out.println("Please enter a value to insert: ");
                        circularLinkedList.addLast(sc.nextInt());
                    break;
                case 3:
                        System.out.println("Please enter a value to delete: ");
                        circularLinkedList.delete(sc.nextInt());
                    break;
                case 4:
                        System.out.println("Your current forward list is: ");
                        circularLinkedList.forwardDisplay();
                    break;
                case 5:
                        System.out.println("Your current backward list is: ");
                        circularLinkedList.backwardDisplay();
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

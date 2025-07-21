//Implement Singly Linked List
import java.util.Scanner;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
class ImplementLinkedList{

    private Node head;

    public void addFirst(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            System.out.println("Your added value = "+value);
            return;
        }
        node.next=head;
        head=node;
        System.out.println("Your added value = "+value);
    }

    public void addLast(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            System.out.println("Your added value = "+value);
            return;
        }
        Node currentNode=head;
        while (currentNode.next!=null) 
            currentNode=currentNode.next;
        currentNode.next=node;
        System.out.println("Your added value  = "+value);
    }

    public void delete(int value){
        if(head==null){
            System.out.println("List is empty.");
            return;
        }
        if(head.data==value){
            int data=head.data;
            head=head.next;
            System.out.println("Your deleted data = "+data);
            return;
        }
        Node current=head;
        while(current.next!=null && current.next.data!=value)
            current=current.next;
        int data=current.next.data;
        current.next=current.next.next;
        System.out.println("Your deleted data = "+data);
    }

    public void printList(){
        Node current=head;
        while (current!=null) {
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
}
public class SinglyLinkedList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ImplementLinkedList linkedList=new ImplementLinkedList();
        int cont=0;
        do {
            System.out.println("Please enter your choice....\nPress 1 to add element in first position\nPress 2 to add element in last position\nPress 3 to delete and element\nPress 4 to print the list: ");
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
                        System.out.println("Your current list is: ");
                        linkedList.printList();
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

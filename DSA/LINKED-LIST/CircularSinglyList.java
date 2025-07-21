//Implement Circular Singly Linked List
import java.util.Scanner;

public class CircularSinglyList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CircularSinglyListImplement circularLinkedList=new CircularSinglyListImplement();
        int cont=0;
        do {
            System.out.println("Please enter your choice....\nPress 1 to add element in first position\nPress 2 to add element in last position\nPress 3 to delete and element\nPress 4 to print the list: ");
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
                        System.out.println("Your current list is: ");
                        circularLinkedList.printList();
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

class CircularSinglyListImplement{
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    private Node head=null;
    private Node tail=null;
    public void addFirst(int value){
        Node newNode=new Node(value);
        if(head==null){
            head=newNode;
            tail=newNode;
            tail.next=head;
        }
        newNode.next=head;
        head=newNode;
        tail.next=head;
    }
    public void addLast(int value){
        Node newNode=new Node(value);
        if(head==null){
            head=tail=newNode;
            tail.next=head;
        }
        tail.next=newNode;
        tail=newNode;
        tail.next=head;
    }
    public void delete(int value){
        if(head==null){
            System.out.println("The list is empty...");
            return;
        }
        if(head==tail && value==head.data){
            head=tail=null;
            System.out.println("Your deleted value = "+value);
            return;

        }
        Node currentNode=head;
        Node prevNode=tail;
        do{
            if(currentNode.data==value){
                if(currentNode==head){
                    head=head.next;
                    tail.next=head;
                }else{
                    prevNode.next=currentNode.next;
                    if(currentNode==tail)
                        tail=prevNode;
                }
                System.out.println("Your deleted value is = "+value);
                return;
            }
            prevNode=currentNode;
            currentNode=currentNode.next;
        }while(currentNode!=head);
        System.out.println("Value not found");
    }
    public void printList(){
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
}
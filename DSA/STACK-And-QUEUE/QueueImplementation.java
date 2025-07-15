import java.util.Scanner;

class QueueOperationUsingArray {
    private int maxSixe;
    private int queue[];
    private int front;
    private int rear;
    private int itemCount;
    
    public QueueOperationUsingArray(int size){
        maxSixe=size;
        queue=new int[maxSixe];
        front=0;
        rear=-1;
        itemCount=0;
    }

    public void enQueue(int value){
        if(isFull() || rear==maxSixe-1){
            System.out.println("Queue Overflow!! can't insert the value = "+value);
            return;
        }
        queue[++rear]=value;
        itemCount++;
    }

    public int deQueue(){
        if(isEmpty()){
            System.out.println("Queue Underflow!! Nothing is present to delete");
            return -1;
        }
        itemCount--;
        return queue[front++];
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue Underflow!! Nothing is present to delete");
            return -1;
        }
        return queue[front];
    }

    public boolean isEmpty(){
        if(itemCount==0)
            return true;
        else
            return false;
    }

    public boolean isFull(){
        if(itemCount==maxSixe)
            return true;
        else
            return false;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("queue is empty..");
            return;
        }
        for(int i=front;i<=rear;i++)
            System.out.print(queue[i]+" ");
        System.out.println();
    }
}

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
class QueueOperationUsingLinkedList{
    private Node rear;
    private Node front;

    public QueueOperationUsingLinkedList(){
        this.rear=null;
        this.front=null;
    }

    public void enQueue(int value){
        Node node=new Node(value);
        if(rear==null){
            rear=node;
            front=node;
        }else{
            rear.next=node;
            rear=node;
        }
        System.out.println("Your inserted value = "+value);
    }

    public int deQueue(){
        if(isEmpty()){
            System.out.println("Your Queue is empty....");
            return -1;
        }
        int value=front.data;
        front=front.next;
        if(front==null)
            rear=null;
        return value;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Your Queue is empty....");
            return -1;
        }
        return front.data;
    }

    public boolean isEmpty(){
        return front==null;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Your Queue is empty....");
            return;
        }
        Node current=front;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
}

public class QueueImplementation{
    public static void main(String[] args) {
        System.out.println("We are implementing Queue using array and linked list......");
        Scanner sc=new Scanner(System.in);
        int cont=0;
        do {
            System.out.println("Please enter your choice....\nPress 1 to use Array\nPress 2 to use Linked List: ");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                        System.out.println("Please enter the size of the Queue: ");
                        int size=sc.nextInt();
                        QueueOperationUsingArray aQueue=new QueueOperationUsingArray(size);
                        int isContinue=0;
                        do {
                            System.out.println("Please enter your choice....\nPress 1 to Insert a value\nPress 2 to Delete a value\nPress 3 to Peek a value\nPress 4 to Display: ");
                            int ch=sc.nextInt();
                            switch (ch) {
                                case 1:
                                        System.out.println("Please enter a value to insert: ");
                                        int value=sc.nextInt();
                                        aQueue.enQueue(value);
                                    break;
                
                                case 2:
                                        System.out.println("Your deleted element is: "+aQueue.deQueue());
                                    break;

                                case 3:
                                        System.out.println("Your peek element is: "+aQueue.peek());
                                    break;
                
                                case 4:
                                        System.out.println("Your elements are: ");
                                        aQueue.display();
                                    break;
                                default:
                                        System.out.println("Please enter a valid choice.....");
                                    break;
                            }
                            System.out.println("Press 1 to continue the operation or 0 to exit: ");
                            isContinue=sc.nextInt();
                        } while (isContinue==1);
                    break;
            
                case 2:
                        QueueOperationUsingLinkedList lQueue=new QueueOperationUsingLinkedList();
                        int isContinue2=0;
                        do {
                            System.out.println("Please enter your choice....\nPress 1 to Insert a value\nPress 2 to Delete a value\nPress 3 to Peek a value\nPress 4 to Display: ");
                            int ch=sc.nextInt();
                            switch (ch) {
                                case 1:
                                        System.out.println("Please enter a value to insert: ");
                                        int value=sc.nextInt();
                                        lQueue.enQueue(value);
                                    break;
                
                                case 2:
                                        System.out.println("Your deleted element is: "+lQueue.deQueue());
                                    break;

                                case 3:
                                        System.out.println("Your peek element is: "+lQueue.peek());
                                    break;
                
                                case 4:
                                        System.out.println("Your elements are: ");
                                        lQueue.display();
                                    break;
                                default:
                                        System.out.println("Please enter a valid choice.....");
                                    break;
                            }
                            System.out.println("Press 1 to continue the operation or 0 to exit: ");
                            isContinue2=sc.nextInt();
                        } while (isContinue2==1);
                    break;
                default:
                        System.out.println("Please enter the correct option....");
                    break;
            }
            System.out.println("Press 1 to continue or Press 0 to exit: ");
            cont=sc.nextInt();
        } while (cont==1);
        
        sc.close();
    }
}

import java.util.Scanner;

public class CircularQueueImplementation {
    private int queue[];
    private int front;
    private int rear;
    private int itemCount;
    private int maxSize; 

    public CircularQueueImplementation(int size){
        maxSize=size;
        queue=new int[maxSize];
        front=0;
        rear=-1;
        itemCount=0;
    }

    public void enQueue(int value){
        if(isFull()){
            System.out.println("Queue Overflow!! Can't insert the value = "+value);
            return;
        }
        rear=(rear+1)%maxSize;
        queue[rear]=value;
        itemCount++;
    }

    public int deQueue(){
        if(isEmpty()){
            System.out.println("Queue Underflow!! No value is present in the Queue");
            return -1;
        }
        int value=queue[front];
        front=(front+1)%maxSize;
        itemCount--;
        return value;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue Underflow!! No value is present in the Queue");
            return -1;
        }
        return queue[front];
    }

    public boolean isFull(){
        return (itemCount==maxSize);
    }

    public boolean isEmpty(){
        return (itemCount==0);
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue Underflow!! No value is present in the Queue");
            return;
        }
        for(int i=0;i<itemCount;i++){
            int j=(front+i)%maxSize;
            System.out.print(queue[j]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the Queue: ");
        int size=sc.nextInt();
        CircularQueueImplementation queue=new CircularQueueImplementation(size);
        int isContinue=0;
        do {
            System.out.println("Please enter your choice....\nPress 1 to Insert a value\nPress 2 to Delete a value\nPress 3 to Peek a value\nPress 4 to Display: ");
            int ch=sc.nextInt();
            switch (ch) {
                case 1:
                        System.out.println("Please enter a value to insert: ");
                        int value=sc.nextInt();
                        queue.enQueue(value);
                    break;
                
                case 2:
                        System.out.println("Your deleted element is: "+queue.deQueue());
                    break;

                case 3:
                        System.out.println("Your peek element is: "+queue.peek());
                    break;
                
                case 4:
                        System.out.println("Your elements are: ");
                        queue.display();
                    break;
                default:
                        System.out.println("Please enter a valid choice.....");
                    break;
            }
            System.out.println("Press 1 to continue or 0 to exit: ");
            isContinue=sc.nextInt();
        } while (isContinue==1);
        sc.close();
    }
}

import java.util.Scanner;

class StackOperationUsingArray {

    private int maxSize;
    private int top;
    private int stack[];

    public StackOperationUsingArray(int size){
        maxSize=size;
        top=-1;
        stack=new int[maxSize];
    }

    public void push(int value){
        if(isFull()){
            System.out.println("Stack Overflow!! Can't insert the value = "+value);
            return;
        }
        stack[++top]=value;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow!! No value is available...");
            return -1;
        }
        return stack[top--];
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow!! No value is available...");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty(){
        if(top==-1)
            return true;
        else
            return false;
    }

    public boolean isFull(){
        if(top==maxSize-1)
            return true;
        else
            return false;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack Underflow!! No values are available....");
            return;
        }
        for(int i=top;i>=0;i--)
            System.out.print(stack[i]+" ");
        System.out.println();
    }

    public void reverseDisplay(){
        if(isEmpty()){
            System.out.println("Stack Underflow!! No values are available.....");
            return;
        }
        for(int i=0;i<=top;i++)
            System.out.print(stack[i]+" ");
        System.out.println();
    }
}

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class StackOperationUsingLinkedList{

    private Node top;
    public StackOperationUsingLinkedList(){
        top=null;
    }

    public void push(int value){
        Node node=new Node(value);
        node.next=top;
        top=node;
        System.out.println("Your pushed value is = "+value);
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow!! Nothing is available");
            return -1;
        }
        int value=top.data;
        top=top.next;
        return value;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow!! Nothing is available");
            return -1;
        }
        return top.data;
    }

    public boolean isEmpty(){
        return (top==null);
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack Underflow!! Nothing is available");
            return;
        }
        Node current=top;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
}

public class StackImplementation{
    public static void main(String[] args) {
        System.out.println("We are implementing Stack using array and linked list......");
        Scanner sc=new Scanner(System.in);
        int cont=0;
        do {
            System.out.println("Please enter your choice....\nPress 1 for Using Array\nPress 2 for using Linked List: ");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                        System.out.println("Please enter values in array: ");
                        int size=sc.nextInt();
                        StackOperationUsingArray aStack=new StackOperationUsingArray(size);
                        int isContinue=0;
                        do {
                            System.out.println("Please enter your choice....\nPress 1 to Push\nPress 2 to Pop\nPress 3 to Peek\nPress 4 to Display (Top to Buttom)\nPress 5 to Display (Buttom to Top): ");
                            int ch=sc.nextInt();
                            switch (ch) {
                                case 1:
                                        System.out.println("Please enter a value to push: ");
                                        int value=sc.nextInt();
                                        aStack.push(value);
                                    break;
            
                                case 2:
                                        System.out.println("Your popped element is: "+aStack.pop());
                                    break;

                                case 3:
                                        System.out.println("Your peeked element is: "+aStack.peek());
                                    break;
                
                                case 4:
                                        System.out.println("Your Stack elements are (top to buttom)....");
                                        aStack.display();
                                    break;
                
                                case 5:
                                        System.out.println("Your Stack elements are (buttom to top).....");
                                        aStack.reverseDisplay();
                                    break;
                                default:
                                        System.out.println("Please enter valid choice....");
                                    break;
                            }
                            System.out.println("Please enter 1 to continue the operation or 0 to exit: ");
                            isContinue=sc.nextInt();
                        } while (isContinue==1);
                    break;
            
                    case 2:
                            StackOperationUsingLinkedList lStack=new StackOperationUsingLinkedList();
                            int isContinue2=0;
                        do {
                            System.out.println("Please enter your choice....\nPress 1 to Push\nPress 2 to Pop\nPress 3 to Peek\nPress 4 to Display (Top to Buttom): ");
                            int ch=sc.nextInt();
                            switch (ch) {
                                case 1:
                                        System.out.println("Please enter a value to push: ");
                                        int value=sc.nextInt();
                                        lStack.push(value);
                                    break;
            
                                case 2:
                                        System.out.println("Your popped element is: "+lStack.pop());
                                    break;

                                case 3:
                                        System.out.println("Your peeked element is: "+lStack.peek());
                                    break;
                
                                case 4:
                                        System.out.println("Your Stack elements are (top to buttom)....");
                                        lStack.display();
                                    break;
                
                                default:
                                        System.out.println("Please enter valid choice....");
                                    break;
                            }
                            System.out.println("Please enter 1 to continue the operation or 0 to exit: ");
                            isContinue2=sc.nextInt();
                        } while (isContinue2==1);
                        break;
                default: 
                        System.out.println("Please enter valid option....");
                    break;
            }
            System.out.println("Press 1 to continue or 0 to exit....");
            cont=sc.nextInt();
    } while (cont==1);
        sc.close();
    }
}

enum Status{
    //Those are named constants.
    RUNNING,FAILED,PENDING,SUCCESS;
}
class EnumOperations{
    public void conditionalStatements(Status s){
        if(s==Status.RUNNING)
            System.out.println("Execution in progress");
        else if(s==Status.FAILED)
            System.out.println("Execution failed");
        else if(s==Status.PENDING)
            System.out.println("Execution is stopped");
        else
            System.out.println("Execution done");
    }
    public void switchCases(Status s){
        switch (s) {
            case RUNNING:
                System.out.println("Execution in progress");
                break;
            case PENDING:
                System.out.println("Execution is stopped");
                break;
            case FAILED:
                System.out.println("Execution failed");
                break;
            case SUCCESS:
                System.out.println("Execution done");
                break;
            default:
                System.out.println("Please choose the right one!!");
                break;
        }
    }
}
public class Demo {
    public static void main(String[] args) {
        Status s=Status.RUNNING;
        System.out.println(s);
        System.out.println(s.ordinal());
        Status[] ss=Status.values();
        for(int i=0;i<ss.length;i++)
            System.out.println(ss[i]+" : "+ss[i].ordinal());
        EnumOperations enumOperations=new EnumOperations();
        enumOperations.conditionalStatements(s);
        enumOperations.switchCases(Status.SUCCESS);
    }
}

class Calc{
    void Greater()
    {
        System.out.println("BY USING THIS METHOD WE CAN IDENTIFY THE GREATER ONE.");
    }
    void Greater(int a,int b){
        if(a>b)
        System.out.println(a+" IS GREATER.");
        else
        System.out.println(b+" IS GREATER");
    }
    void Greater(int a,int b,int c){
        if(a>b)
        {
            if(a>c)
            System.out.println(a+" IS GREATER.");
            else
            System.out.println(c+" IS GREATER.");

        }
        else
        {
            if(b>c)
            System.out.println(b+" IS GREATER.");
            else
            System.out.println(c+" IS GRETAER.");
        }
    }
}
public class PA_MethodOverloading {
    public static void main(String[] args) {
        int a=10,b=20,c=30;
        Calc obj=new Calc();
        obj.Greater();
        obj.Greater(a,b);
        obj.Greater(a,b,c);   
    }  
}

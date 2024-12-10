public class PA_IndexFind {
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5};
        int a=3;
        for(int i=0;i<ar.length;i++)
        {
            if(a==ar[i])
            {
                System.out.println("THE POSITON OF "+a+" IS "+i);
                break;
            }
        }
    }
    
}

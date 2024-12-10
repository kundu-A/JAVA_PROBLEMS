import java.io.*;
public class Sum_IOException
{
	public static void main(String arg[])
	{
		try{
			InputStreamReader read=new InputStreamReader(System.in);
			BufferedReader in=new BufferedReader(read);
			int n=0,s=0;
			System.out.println("ENTER THE RANGE: ");
			int range=Integer.parseInt(in.readLine());
			for(int i=0;i<range;i++)
			{
				System.out.println("ENTER YOUR NO. ");
				n=Integer.parseInt(in.readLine());
				s=s+n;
			}
			System.out.println("THE SUM OF YOUR NO.S IS: "+s);
		}
		catch(IOException e){
		}
	}
}

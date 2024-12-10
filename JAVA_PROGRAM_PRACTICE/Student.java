class Student
{
	int sid_id=101;
	/*{
		int sid_id=101;
	}*/
	void disp()
	{
		System.out.println("THE STUDENT ID IS "+sid_id);
	}
	public static void main(String ar[])
	{
		new Student().disp();
	}
}
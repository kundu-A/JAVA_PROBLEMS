import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
	int res[]=new int[m+n];
	int k=0;
	for(int i=0;i<nums1.length;i++)
	{
		if(nums1[i]!=0)
			res[k++]=nums1[i];
	}
	for(int i=0;i<nums2.length;i++)
	{
		if(nums2[i]!=0)
			res[k++]=nums2[i];
	}
	Arrays.sort(res);
	for(int i=0;i<nums1.length;i++)
	{
		nums1[i]=res[i];
	}
	for(int i=0;i<nums1.length;i++)
		System.out.print(nums1[i]+" ");
        
    }
}
class Merge
{
	public static void main(String args[])
	{
		int nums1[]={0};
		int m=0;
		int nums2[]={1};
		int n=1;
		Solution ob=new Solution();
		ob.merge(nums1,m,nums2,n);
	}
}
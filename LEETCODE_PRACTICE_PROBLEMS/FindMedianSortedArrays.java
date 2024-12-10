import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int ar[]=new int[nums1.length+nums2.length];
		int k=0; 
		for(int i=0;i<nums1.length;i++)
			ar[k++]=nums1[i];
		for(int i=0;i<nums2.length;i++)
			ar[k++]=nums2[i];
		Arrays.sort(ar);
		if(ar.length%2==0)
			return(ar[(ar.length)/2-1]+ar[(ar.length)/2])/2.0;
		else
        	return (ar[(ar.length)/2]);
	}
}
class FindMedianSortedArrays
{
	public static void main(String args[])
	{
			int nums1[]={1,2};
			int nums2[]={3,4};
			Solution ob=new Solution();
			double ans=ob.findMedianSortedArrays(nums1, nums2);
			System.out.println(ans);
	}
}
package z_4_Median_of_Two_Sorted_Array;

public class Solution {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		if(nums1.length > nums2.length){
			return findMedianSortedArrays(nums2,nums1);
		}
		int m = nums1.length;
		int n = nums2.length;
		int half = (m + n + 1)/2;
		int imin = 0;
		int imax = m;
		int media = 0;
		int i,j = 0;
		
		while(imin <= imax){
			 i = (imin + imax)/2;
			 j = half - i;
			
			if(nums2[j-1]>nums1[i] && i < m && j>0 ){
				imin = i+1;
			}
			else if(nums1[i-1]>nums2[j] && i>0 && j<n){
				imax = i - 1;
			}
			else {
				media = 4;
				break;
			}
			
		}
		
		
		return media;
    }
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {0,1,2,3};
		int[] b = {4,5};
		double result = findMedianSortedArrays(a,b);
		System.out.println(result);

	}

}

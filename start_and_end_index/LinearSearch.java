package start_and_end_index;

import java.util.Arrays;

public class LinearSearch 
{
	 public static int[] searchRange(int[] nums, int t) 
	    {
	        
	        int[] res = new int[2];
	        boolean flg = false;

	         for(int i = 0; i < nums.length; i++)
	         {
	             int n = nums[i];
	             if(n == t)
	             {
	                 res[0] = i;
	                 flg = true;
	                 for(int j = i+1; j < nums.length; j++)
	                 {
	                     if(nums[j] != n)
	                     {
	                         res[1] = j-1;
	                         break;
	                     }
	                 }
	                 if(flg)
	                     break;
	             }
	         }

	         if(!flg)
	         {
	             return new int[] {-1,-1};
	         }

	         if(flg && nums[nums.length-1] == t)
	             res[1] = nums.length-1;

	         return res;	       
	    }
	 
	 public static void main(String[] args) 
	{
		int[] nums = {5,7,7,8,8,10};
		System.out.println(Arrays.toString(searchRange(nums, 8)));
	}
}

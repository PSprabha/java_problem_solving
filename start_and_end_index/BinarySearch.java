package start_and_end_index;

import java.util.Arrays;

public class BinarySearch 
{
	 public static int[] searchRange(int[] nums, int t) 
	 {
	        
        int[] res = new int[2];
        boolean flg = false;
		 int i = 0, j = nums.length-1, mid = 0;

	        while(i <= j)
	        {
	            mid = i+(j-i)/2;
	            if(nums[mid] == t)
	            {
	                flg = true;
	                for(int k = mid; k >= 0; k--)
	                {
	                    if(nums[k] != t)
	                    {
	                        res[0] = k+1;
	                        break;
	                    }
	                }

	                for(int k = mid; k < nums.length; k++)
	                {
	                    if(nums[k] != t)
	                    {
	                        res[1] = k-1;
	                        break;
	                    }
	                    else if(nums[k] == t && k == nums.length-1)
	                    {
	                        res[1] = k;
	                        break;
	                    }
	                }
	                break;
	            }
	            else if(nums[mid] > t)
	                j = mid-1;
	            else
	                i = mid+1;
	        }

	        if(!flg)
	            return new int[] {-1,-1};
	        
	        return res;
	}
	 
	public static void main(String[] args) 
	{
		int[] nums = {5,7,7,8,8,10};
		System.out.println(Arrays.toString(searchRange(nums, 8)));
	}

}

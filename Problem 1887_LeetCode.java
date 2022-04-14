class Solution {
    public int reductionOperations(int[] nums) {
            
       Arrays.sort(nums); int i=0;
            int min=nums[0]; int minsec=0;
            for(i=1;i<nums.length;i++)
            {
                    if(min<nums[i])
                    {
                        break;    
                    }
                    
            }
            int counter=0; int temp=0;
            for(int j=i+1;j<nums.length;j++)
            {
                    if(nums[j]==nums[i])
                    {
                            continue;
                    }
                    else
                    {
                      temp=nums[j]-nums[i];
                            nums[j]=nums[j]-temp;
                            counter++;
                    }
            }
            counter+=(nums.length-(i));
            return counter;
            
    }
        
        
}

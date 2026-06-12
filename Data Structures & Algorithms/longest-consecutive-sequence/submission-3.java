class Solution {
    public int longestConsecutive(int[] nums) {
            Arrays.sort(nums);
            if(nums.length<=1){
                return nums.length;
            }
            int slow=0;
            int count=1;
          int max=Integer.MIN_VALUE;
          
            for(int fast=1;fast<nums.length;fast++){
                if(nums[fast-1]!=nums[fast]){
                if((nums[fast-1]+1)!=nums[fast]){
                       
                    max=Math.max(max,count);
                    count=1;
                   
                }else{
                    count++;
                }
                }
               
            }
           
                 max=Math.max(max,count);
            
           
            return max;
    }
}




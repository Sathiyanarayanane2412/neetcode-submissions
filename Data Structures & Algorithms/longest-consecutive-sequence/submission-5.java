class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> store=new HashSet<>();
        for(int num:nums){
            store.add(num);
        }
        int max=0;
        for(int num:nums){
            if(!store.contains(num-1)){
                int len=1;
                while(store.contains(num+len)){
                    len++;
                }
                max=Math.max(max,len);
            }
        }
        return max;
    }
}

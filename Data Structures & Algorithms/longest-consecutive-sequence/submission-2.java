class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length <= 1) return nums.length ;
        int max = 1 ;
        TreeMap<Integer,Integer> hm = new TreeMap<>(); 
        for(int i = 0 ; i < nums.length ; i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],1);
            }
        }
        int k = 0 ;
        for(Integer c : hm.keySet()){
            nums[k] = c ;
            k++ ;
        }
        int c = 1 ;
        for(int i = 1 ; i < k ; i++){
            if(nums[i-1] + 1 == nums[i]){
                c++;
            }
            else{
                c = 1 ;
            }
             max = Math.max(max, c);
        }
        return max ;
    }
}

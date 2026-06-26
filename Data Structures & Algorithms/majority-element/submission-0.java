class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length ;
        Map<Integer , Integer> hm = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i], hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i] , 1);
            }
        }
        for(Integer c : hm.keySet()){
            if(hm.get(c) > n/2){
                return c ;
            }
        }
        return -1 ;
    }
}
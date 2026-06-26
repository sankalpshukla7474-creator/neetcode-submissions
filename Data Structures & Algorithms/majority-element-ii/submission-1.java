class Solution {
    public List<Integer> majorityElement(int[] nums) {
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
        List<Integer> ls = new ArrayList<>();
        for(Integer c : hm.keySet()){
            if(hm.get(c) > n/3){
                ls.add(c);
            }
        }
        return ls  ;
    }
}
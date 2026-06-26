class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>() ;
        Arrays.sort(nums) ;
        int n = nums.length ;
        for(int i = 0 ; i < nums.length ; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue ;
            int tar = -1 * nums[i] ;
            int low = i+1 , high = n-1 ;
            while(low < high){
                int sum = nums[low] + nums[high] ;
                if(sum == tar){
                    List<Integer> pb = new ArrayList<>() ;
                    pb.add(nums[i]) ;
                    pb.add(nums[low]) ;
                    pb.add(nums[high]) ;
                    ls.add(new ArrayList<>(pb)) ;
                    while(low < high && nums[low] == nums[low+1]){
                        low++ ;
                    }
                    while(low < high && nums[high] == nums[high-1]){
                        high-- ;
                    }
                    low++ ; high-- ;
                }
                else if(sum > tar){
                    high-- ;
                }
                else{
                    low++ ;
                }
            }
        }
        return ls ;
    }
}

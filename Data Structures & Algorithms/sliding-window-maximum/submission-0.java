class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       int[] max = new int[nums.length - k + 1 ] ; 
       List<Integer> ls = new ArrayList<>() ;
       for(int i = 0 ; i < k ; i++){
          ls.add(nums[i]) ;
        }
        max[0] = check(ls) ;
        int j = 1 ; 
        for(int i = k ; i < nums.length ; i++){
            ls.remove(0) ;
            ls.add(nums[i]) ;
            max[j] = check(ls) ;
            j++;
        }
        return max ;
    }
    private int check(List<Integer> ls ){
        int max = Integer.MIN_VALUE ;
        for(int i = 0 ; i < ls.size() ; i++){
            max = Math.max(max , ls.get(i)) ;
        }
        return max ; 
    }
}

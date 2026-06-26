class Solution {
    public int numRescueBoats(int[] p, int limit) {
        Arrays.sort(p);
        int i = 0 , j = p.length - 1 ;
        int count = 0 ;
        while(i <= j){
            if(p[j] == limit){
                j-- ;
            }
            else if(p[i]+p[j] > limit){
                j--;
            }
            else{
                i++;
                j--;
            }
            count++;
        }
        return count;
    }
}
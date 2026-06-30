class Solution {
    public int[] plusOne(int[] d) {
        int i = d.length - 1 ;
        int carry = 1 ;
        while(carry == 1 && i >= 0){
            int sum = d[i] + carry ;
            d[i] = (sum % 10) ;
            carry = sum / 10 ;
            i-- ;
        }
        if(carry == 0){
            return d ;
        }
        int[] arr = new int[d.length+1] ;
        arr[0] = 1 ;
        for(i = 0 ; i < d.length ; i++){
            arr[i+1] = d[i] ;
        }
        return arr ;
    }
}

class Solution {
    public boolean isPalindrome(String s) {
        List<Character> ls = new ArrayList<>();
        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                ls.add(Character.toLowerCase(ch));
            }
        }
        if(ls.isEmpty()) return true ;
        int i = 0 , j = ls.size() - 1 ;
        while(i <= j){
            if(!ls.get(i).equals(ls.get(j))){
                return false ;
            }
            i++; j--;
        }
        return true ;
    }
}

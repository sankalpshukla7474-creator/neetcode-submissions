class Solution {
    Map<Integer,String> hm ;
    public List<String> letterCombinations(String digits) {
        hm = new HashMap<>();
        hm.put(1,"");
        hm.put(2,"abc");
        hm.put(3,"def");
        hm.put(4,"ghi");
        hm.put(5,"jkl");
        hm.put(6,"mno");
        hm.put(7,"pqrs");
        hm.put(8,"tuv");
        hm.put(9,"wxyz");
        StringBuilder sb = new StringBuilder();
        List<String> ls = new ArrayList<>();
        if(digits.length() == 0){
            return ls ;
        }
        check(ls,sb,digits,0);
        return ls ;
    }
    public void check(List<String> ls , StringBuilder sb , String s , int i){
        if(i >= s.length()){
            ls.add(sb.toString());
            return ;
        }
        char ch = s.charAt(i);
        int key = ch - '0';
        String p = hm.get(key);
        for(int j = 0 ; j < p.length() ; j++){
            sb.append(p.charAt(j));
            check(ls,sb,s,i+1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ls = new ArrayList<>();
        if(strs.length == 0) return ls ;
        boolean[] visited = new boolean[strs.length]; 

        for(int i = 0 ; i < strs.length ; i++){
            int[] check1 = new int[26] ;
            if(visited[i]) continue ;

            List<String> ps = new ArrayList<>() ;

            String s = strs[i];
            for(char ch : s.toCharArray()){
                check1[ch-'a']++ ;
            }
            ps.add(s) ;
            visited[i] = true ;

            for(int j = 0 ; j < strs.length ; j++){

                if(!visited[j] && strs[j].length() == s.length()){
                    int[] check2 = new int[26];
                    String o = strs[j] ;
                    for(char ch : o.toCharArray()){
                        check2[ch-'a']++;
                    }
                     boolean isAnagram = true;
                    for (int p = 0; p < 26; p++) {
                        if (check1[p] != check2[p]) {
                            isAnagram = false;
                            break;
                        }
                    }

                    if (isAnagram) {
                        ps.add(o);
                        visited[j] = true; 
                    }
                }

            }
            ls.add(ps) ;
        }
        return ls ;
    }
}

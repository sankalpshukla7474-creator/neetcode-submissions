class Solution {
    public boolean isValidSudoku(char[][] b) {
        for(int i = 0 ; i < 9 ; i++){
            HashSet<Character> hs = new HashSet<>() ;
            for(int j = 0 ; j < 9 ; j++){
                if(b[i][j] == '.') continue ;
                if(hs.contains(b[i][j])) return false ;
                hs.add(b[i][j]) ;
            }
        }
        for(int i = 0 ; i < 9 ; i++){
            HashSet<Character> hm = new HashSet<>() ;
            for(int j = 0 ; j < 9 ; j++){
                if(b[j][i] == '.') continue ;
                if(hm.contains(b[j][i])) return false ;
                hm.add(b[j][i]) ;
            }
        }
        for(int sr = 0 ; sr < 9 ; sr+=3){
            int er = sr + 2 ;
            for(int sc = 0 ; sc < 9 ; sc+=3){
                int ec = sc + 2 ;
                boolean ans = pass(b,sr,er,sc,ec) ;
                if(!ans) return false ;
            }
        }
        return true ;
    }
    public boolean pass(char[][] b , int sr , int er , int sc , int ec){
        HashSet<Character> st = new HashSet<>() ;
        for(int i = sr ; i <= er ; i++){
            for(int j = sc ; j <= ec ; j++){
                if(b[i][j] == '.') continue ;
                if(st.contains(b[i][j])) return false ;
                st.add(b[i][j]) ;
            }
        }
        return true ;
    }
}

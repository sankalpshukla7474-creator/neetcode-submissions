class Solution {
    public String decodeString(String s) {
        Stack<Integer> count = new Stack<>() ;
        Stack<StringBuilder> str = new Stack<>() ;
        int num = 0 ;
        StringBuilder p = new StringBuilder() ;
        for(char ch : s.toCharArray()){
            if(ch == '['){
                count.push(num) ;
                str.push(new StringBuilder(p));
                num = 0 ;
                p.setLength(0);
            }
            else if(ch ==']'){
                int c = count.pop() ;
                StringBuilder temp = new StringBuilder() ;
                for(int i = 0 ; i < c ; i++){
                    temp.append(p) ;
                }
                StringBuilder q = str.pop().append(temp) ;
                p = q ;
            }
            else if(Character.isDigit(ch)){
                num = num*10 + (ch-'0') ;
            }
            else{
                p.append(ch) ;
            }
        }
        return p.toString() ;
    }
}
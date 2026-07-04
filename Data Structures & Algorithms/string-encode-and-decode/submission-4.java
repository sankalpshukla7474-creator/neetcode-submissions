class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ls = new ArrayList<>();
        int r = 0;

        while (r < str.length()) {
            int x = r;

            while (str.charAt(x) != '#') {
                x++;
            }

            int len = Integer.parseInt(str.substring(r, x));
            x++; 

            ls.add(str.substring(x, x + len));
            r = x + len;
        }

        return ls;
    }
}
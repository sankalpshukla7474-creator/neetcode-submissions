class MyHashMap {
    int[] st ;
    public MyHashMap() {
        st = new int[1000001] ;
        Arrays.fill(st,-1);
    }
    
    public void put(int key, int value) {
        st[key] = value ;
        return ;
    }
    
    public int get(int key) {
        if(st[key] != -1){
            return st[key] ;
        }
        return -1 ;
    }
    
    public void remove(int key) {
        st[key] = -1 ;
        return ;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
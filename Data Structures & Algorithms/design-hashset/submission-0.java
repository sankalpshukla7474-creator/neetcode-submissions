class MyHashSet {
    private HashSet<Integer> hm ;
    public MyHashSet() {
        hm = new HashSet<>() ;
        }
    
    public void add(int key) {
        hm.add(key);
    }
    
    public void remove(int key) {
        hm.remove(key) ;
    }
    
    public boolean contains(int key) {
        if(!hm.isEmpty() && hm.contains(key)){
            return true ;
        }
        return false ;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
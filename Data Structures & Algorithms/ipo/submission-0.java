class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        List<int[]> ls = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            ls.add(new int[] { capital[i], profits[i] });
        }

        ls.sort(Comparator.comparingInt(a -> a[0]));

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int i = 0;

        while (k-- > 0) {
            while (i < n && ls.get(i)[0] <= w) {
                pq.add(ls.get(i)[1]);
                i++;
            }

            if (pq.isEmpty()) {
                break;
            }

            w += pq.poll();
        }

        return w;
    }
}

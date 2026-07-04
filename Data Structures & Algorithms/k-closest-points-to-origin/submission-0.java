class Solution {
    public int[][] kClosest(int[][] p, int k) {
        Map<Pair, Double> hm = new HashMap<>();

        for (int i = 0; i < p.length; i++) {
            int a = p[i][0];
            int b = p[i][1];

            double dist = Math.sqrt((long) a * a + (long) b * b);
            hm.put(new Pair(a, b), dist);
        }

        PriorityQueue<Pair> pq =
            new PriorityQueue<>((a, b) -> Double.compare(hm.get(a), hm.get(b)));

        for (Pair cd : hm.keySet()) {
            pq.offer(cd);
        }

        int[][] res = new int[k][2];

        for (int i = 0; i < k; i++) {
            Pair pd = pq.poll();
            res[i][0] = pd.A;
            res[i][1] = pd.B;
        }

        return res;
    }

    class Pair {
        int A;
        int B;

        Pair(int a, int b) {
            this.A = a;
            this.B = b;
        }
    }
}
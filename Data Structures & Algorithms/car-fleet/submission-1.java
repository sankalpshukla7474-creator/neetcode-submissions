class Solution {
    public int carFleet(int tar, int[] pos, int[] speed) {
        int n = speed.length;
        double[] time = new double[n];

        for (int i = 0; i < n; i++) {
            time[i] = (double) (tar - pos[i]) / speed[i];
        }

        PriorityQueue<Pair> pq =
            new PriorityQueue<>((a, b) -> Integer.compare(b.B, a.B));

        for (int i = 0; i < n; i++) {
            Pair p = new Pair(time[i], pos[i]);
            pq.offer(p);
        }

        if (pq.isEmpty()) return 0;

        Pair p = pq.poll();
        double temp = p.A;
        int count = 1;

        while (!pq.isEmpty()) {
            Pair q = pq.poll();

            if (q.A <= temp) {
                continue;
            } else {
                temp = q.A;
                count++;
            }
        }

        return count;
    }

    class Pair {
        double A;
        int B;

        Pair(double A, int B) {
            this.A = A;
            this.B = B;
        }
    }
}
class Solution {
    public boolean canAttendMeetings(List<Interval> inter) {
        if (inter.size() == 0) return true;

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.A - b.A);

        for (int i = 0; i < inter.size(); i++) {
            int u = inter.get(i).start;
            int v = inter.get(i).end;
            pq.offer(new Pair(u, v));
        }

        while (pq.size() > 1) {
            Pair p = pq.poll();
            Pair q = pq.peek();

            if (q.A < p.B) {
                return false;
            }
        }

        return true;
    }

    class Pair {
        int A;
        int B;

        Pair(int A, int B) {
            this.A = A;
            this.B = B;
        }
    }
}
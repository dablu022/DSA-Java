class Solution {
    public class tuple {
        int e1;
        int e2;
        int idx;

        public tuple(int e1, int e2, int idx) {
            this.e1 = e1;
            this.e2 = e2;
            this.idx = idx;
        }
    }

    public class Pair {
        int el;
        int idx;

        public Pair(int el, int idx) {
            this.el = el;
            this.idx = idx;
        }
    }

    public int[] getOrder(int[][] tasks) {
        int n = tasks.length;
        int[] ans = new int[n];
        tuple[] arr = new tuple[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new tuple(tasks[i][0], tasks[i][1], i);
        }
        Arrays.sort(arr, (new Comparator<tuple>() {
            @Override
            public int compare(tuple o1, tuple o2) {
                if (o1.e1 == o2.e1) {
                    return o1.idx - o2.idx;
                }
                return o1.e1 - o2.e1;
            }
        }));

        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if (o1.el == o2.el) {
                    return o1.idx - o2.idx;
                }
                return o1.el - o2.el;
            }
        });

        long timer = 0;
        int i = 0;
        int j = 0;
        while (j < n || !pq.isEmpty()) {
            if (pq.isEmpty() && timer < arr[j].e1) {
                timer = arr[j].e1;
            }
            while (j < n && arr[j].e1 <= timer) {
                pq.add(new Pair(arr[j].e2, arr[j].idx));
                j++;
            }
            Pair cur = pq.poll();
            ans[i++] = cur.idx;
            timer += cur.el;

        }
        return ans;
    }
}
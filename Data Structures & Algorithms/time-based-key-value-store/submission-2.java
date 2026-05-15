class Pair {
    String mood;
    int time;
    Pair(String a, int b) {
        mood = a;
        time = b;
    }
}
class TimeMap {
    HashMap<String, ArrayList<Pair>> hmap;

    public TimeMap() {
        hmap = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (hmap.containsKey(key)) {
            hmap.get(key).add(new Pair(value, timestamp));
        } else {
            hmap.put(key, new ArrayList<>());
            hmap.get(key).add(new Pair(value, timestamp));
        }
    }

    public void bs(ArrayList<Pair> list, int l, int r, int target, int ans[]) {
        if (l > r)
            return;
        int mid = (l + r) / 2;
        int currT = list.get(mid).time;
        int currL = list.get(l).time;
        int currR = list.get(r).time;
        if (currT <= target) {
            ans[0] = mid;
            bs(list, mid + 1, r, target, ans);
        } else {
            bs(list, l, mid - 1, target, ans);
        }
    }

    public String get(String key, int timestamp) {
        ArrayList<Pair> list = hmap.get(key);

        if (list == null)
            return "";

        int index[] = {-1};
        bs(list, 0, list.size() - 1, timestamp, index);

        return index[0] == -1 ? "" : list.get(index[0]).mood;
    }
}
